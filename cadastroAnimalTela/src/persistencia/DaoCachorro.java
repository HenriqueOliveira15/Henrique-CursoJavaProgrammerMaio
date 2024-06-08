package persistencia;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

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
			
			preparaComandoSQL.setString(1, cachorro.getNome());
			preparaComandoSQL.setString(2, cachorro.getCaf());
			preparaComandoSQL.setString(3, cachorro.getCorPelo()); 
			
			
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
	
	public static List <Cachorro> retornaListaCachorro(){
		
		String comandoSqlBuscarCachorro = "select * from tb_cachorro";
		List<Cachorro> listacachorro = new ArrayList<>();
		FabricaConexao conexaoConectarBancoTeste = new FabricaConexao();
		
		Connection connectionBaseTeste = null;
		PreparedStatement preparaComandoSQL = null;
		ResultSet resultadoTabelaCachorro = null;
		
		try {
			
			connectionBaseTeste = conexaoConectarBancoTeste.criarConexaoCadastroAnimal();
			preparaComandoSQL = connectionBaseTeste.prepareStatement(comandoSqlBuscarCachorro);	
			resultadoTabelaCachorro = preparaComandoSQL.executeQuery();
			
			while (resultadoTabelaCachorro.next()) {
				
				Cachorro cachorro = new Cachorro();
				cachorro.setNome(resultadoTabelaCachorro.getString("nome"));
				cachorro.setCaf(resultadoTabelaCachorro.getString("caf"));
				cachorro.setCorPelo(resultadoTabelaCachorro.getString("corpelo"));
				
				listacachorro.add(cachorro);
			}
			
		} catch (Exception e) {
			System.out.println("Falha ao listar cachorro");
		
		}finally {
			
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
		
		return listacachorro;
			
		
	}
	
	

}
