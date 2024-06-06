package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;

import entidades.Cachorro;

public class DaoCachorro {
	
	
	public boolean salvarCachorro(Cachorro cachorro) {
		boolean salvamento = false;
		
		FabricaConexao conexaoConectarBancoTeste = new FabricaConexao();
		Connection connectionBaseTeste = null;
		PreparedStatement preparaComandoSQL = null;
		
		
		String comandoSqlInsert = "insert into tb_cachorro (nome, caf, corpelo) values (?, ?, ?)";
		
		
		
		
		try {
			connectionBaseTeste = conexaoConectarBancoTeste.criarConexaoCadastroAnimal();
			
			preparaComandoSQL = connectionBaseTeste.prepareStatement(comandoSqlInsert);	
			
			preparaComandoSQL.setString(1, Cachorro.getNome());
			preparaComandoSQL.setString(2, Cachorro.getCaf());
			preparaComandoSQL.setString(3, Cachorro.getCorPelo()); 
			
			
			preparaComandoSQL.execute();
		
			System.out.println("Cachorro registrado com sucesso");
			
			salvamento = true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Nao foi possivel registrar esse cachorro");
			
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
