package conectaBancoTeste;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class DaoPessoa {
	
	public boolean salvarPessoaNoBanco(Pessoa pessoa) {
		boolean salvamento = false;
		
		ConectarBancoTeste conexaoConectarBancoTeste = new ConectarBancoTeste();
		Connection connectionBaseTeste = null;
		PreparedStatement preparaComandoSQL = null;
		
		
		String comandoSqlInsert = "insert into pessoa (cpf, nome, email) values (?, ?, ?)";
		
		
		
		
		try {
			connectionBaseTeste = conexaoConectarBancoTeste.criarConexaoTeste();
			
			preparaComandoSQL = connectionBaseTeste.prepareStatement(comandoSqlInsert);	
			
			preparaComandoSQL.setString(1, pessoa.getCpf());
			preparaComandoSQL.setString(2, pessoa.getNome());
			preparaComandoSQL.setString(3, pessoa.getEmail()); 
			
			
			preparaComandoSQL.execute();
		
			System.out.println("Pessoa registrada com sucesso");
			
			salvamento = true;
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Nao foi possivel registrar essa pessoa");
			
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
