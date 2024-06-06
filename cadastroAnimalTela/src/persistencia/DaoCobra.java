package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entidades.Cobra;

public class DaoCobra {
	
	public boolean salvarCobra(Cobra cobra) {
		boolean salvamento = false;
		
		FabricaConexao conexaoConectarBancoTeste = new FabricaConexao();
		Connection connectionBaseTeste = null;
		PreparedStatement preparaComandoSQL = null;
		
		
		String comandoSqlInsert = "insert into tb_cobra (nome, caf, tipoveneno) values (?, ?, ?)";
		
		
		
		
		try {
			connectionBaseTeste = conexaoConectarBancoTeste.criarConexaoCadastroAnimal();
			
			preparaComandoSQL = connectionBaseTeste.prepareStatement(comandoSqlInsert);	
			
			preparaComandoSQL.setString(1, Cobra.getNome());
			preparaComandoSQL.setString(2, Cobra.getCaf());
			preparaComandoSQL.setString(3, Cobra.getTipoVeneno()); 
			
			
			preparaComandoSQL.execute();
		
			System.out.println("Cobra registrada com sucesso");
			
			salvamento = true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Nao foi possivel registrar essa cobra");
			
		}finally { // Esse é obrigatório
			
			try {
				if(connectionBaseTeste != null) {
					connectionBaseTeste.close();
				}
				if (preparaComandoSQL != null) {
					preparaComandoSQL.close();
				}

				
			} catch (Exception e2) {
				System.out.println("Não foi possível fechar a conexão");
			}
			
			
		}
	
		return salvamento;
	}

}
