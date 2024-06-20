package persistencia;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import entidades.Cachorro;
import entidades.Cobra;

public class DaoCobra {

	public boolean salvarCobra(Cobra cobra) {
		boolean salvamento = false;

		FabricaConexao conexaoConectarBancoTeste = new FabricaConexao();
		Connection connectionBaseTeste = null;
		PreparedStatement preparaComandoSQL = null;

		String comandoSqlInsert = "insert into tb_cobra (nome, caf, tipoveneno, preco, cep, localidade, logradouro, bairro, uf) values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

		try {
			connectionBaseTeste = conexaoConectarBancoTeste.criarConexaoCadastroAnimal();

			preparaComandoSQL = connectionBaseTeste.prepareStatement(comandoSqlInsert);

			preparaComandoSQL.setString(1, cobra.getNome());
			preparaComandoSQL.setString(2, cobra.getCaf());
			preparaComandoSQL.setString(3, cobra.getTipoVeneno());
			preparaComandoSQL.setString(4, cobra.getPeso().toString());
			preparaComandoSQL.setString(5, cobra.getEndereco().getCep());
			preparaComandoSQL.setString(6, cobra.getEndereco().getLocalidade());
			preparaComandoSQL.setString(7, cobra.getEndereco().getLogradouro());
			preparaComandoSQL.setString(8, cobra.getEndereco().getBairro());
			preparaComandoSQL.setString(9, cobra.getEndereco().getUf());
			preparaComandoSQL.execute();

			System.out.println("Cobra registrada com sucesso");

			salvamento = true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println("Nao foi possivel registrar essa cobra");

		} finally { // Esse é obrigatório

			try {
				if (connectionBaseTeste != null) {
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

	public static List<Cobra> retornaListaCobra() {

		String comandoSqlBuscarCobra = "select * from tb_cobra";
		List<Cobra> listacobra = new ArrayList<>();
		FabricaConexao conexaoConectarBancoTeste = new FabricaConexao();

		Connection connectionBaseTeste = null;
		PreparedStatement preparaComandoSQL = null;
		ResultSet resultadoTabelaCobra = null;

		try {
			
			connectionBaseTeste = conexaoConectarBancoTeste.criarConexaoCadastroAnimal();
			preparaComandoSQL = connectionBaseTeste.prepareStatement(comandoSqlBuscarCobra);
			resultadoTabelaCobra = preparaComandoSQL.executeQuery();

			while (resultadoTabelaCobra.next()) {

				Cobra cobra = new Cobra();
				cobra.setNome(resultadoTabelaCobra.getString("nome"));
				cobra.setCaf(resultadoTabelaCobra.getString("caf"));
				cobra.setTipoVeneno(resultadoTabelaCobra.getString("tipoveneno"));

				listacobra.add(cobra);
			}

		} catch (Exception e) {
			System.out.println("Falha ao listar cobras");

		} finally {

			try {
				if (connectionBaseTeste != null) {
					connectionBaseTeste.close();
				}
				if (preparaComandoSQL != null) {
					preparaComandoSQL.close();
				}

			} catch (Exception e2) {
				System.out.println("Não foi possível fechar a conexão");
			}

		}

		return listacobra;

	}
	
	public boolean deletarCobra(String caf) {
		
		boolean deletar = false;
		
		FabricaConexao conexaoConectarBancoTeste = new FabricaConexao();
		Connection connectionBaseTeste = null;
		PreparedStatement preparaComandoSQL = null;
		
		String comandoSqlDelete = "delete from tb_cobra where caf = ?";

		try {
			connectionBaseTeste = conexaoConectarBancoTeste.criarConexaoCadastroAnimal(); 
																																							
			preparaComandoSQL = connectionBaseTeste.prepareStatement(comandoSqlDelete);
																							
			preparaComandoSQL.setString(1, caf);// 
			
			preparaComandoSQL.execute();

			System.out.println("Cobra Deletada");

			deletar = true; 
			
		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(" Não foi possivel deletar a cobra!");

		} finally { 
			try {
				if (connectionBaseTeste != null) {
					connectionBaseTeste.close();
				}
				if (connectionBaseTeste != null) {
					connectionBaseTeste.close();
				}

			} catch (Exception e2) {
				System.out.println("Não foi possivel fechar a conexão!!");
			}

		}

		return deletar;

	}
	
	
	public boolean alterarCobra(Cobra cobra) {

		boolean salvamento = false;

		FabricaConexao conexaoConectarBancoTeste = new FabricaConexao();
		Connection connectionBaseTeste = null;
		PreparedStatement preparaComandoSQL = null;

		String comandoSqlUpdate = "UPDATE tb_cobra SET nome = ?, tipoveneno = ? WHERE caf = ?"; 
																									
		try {
			connectionBaseTeste = conexaoConectarBancoTeste.criarConexaoCadastroAnimal();  
		
			preparaComandoSQL = connectionBaseTeste.prepareStatement(comandoSqlUpdate);
											
			preparaComandoSQL.setString(1, cobra.getNome());
			
			preparaComandoSQL.setString(2, cobra.getTipoVeneno()); 
			
			preparaComandoSQL.setString(3, cobra.getCaf());
			
			preparaComandoSQL.execute(); 
			
			System.out.println("A cobra foi alterada");

			salvamento = true;

		} catch (Exception e) {
			System.out.println(e.getMessage());
			System.out.println(" Não foi possivel alterar a cobra");

		} finally { 
			try {
				if (connectionBaseTeste != null) {
					connectionBaseTeste.close();
				}
				if (connectionBaseTeste != null) {
					connectionBaseTeste.close();
				}

			} catch (Exception e2) {
				System.out.println("Não foi possivel fechar a conexão!!");
			}

		}

		return salvamento;

	}

}
