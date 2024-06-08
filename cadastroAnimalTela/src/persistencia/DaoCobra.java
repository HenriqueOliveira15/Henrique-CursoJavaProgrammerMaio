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

		String comandoSqlInsert = "insert into tb_cobra (nome, caf, tipoveneno) values (?, ?, ?)";

		try {
			connectionBaseTeste = conexaoConectarBancoTeste.criarConexaoCadastroAnimal();

			preparaComandoSQL = connectionBaseTeste.prepareStatement(comandoSqlInsert);

			preparaComandoSQL.setString(1, cobra.getNome());
			preparaComandoSQL.setString(2, cobra.getCaf());
			preparaComandoSQL.setString(3, cobra.getTipoVeneno());

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

}
