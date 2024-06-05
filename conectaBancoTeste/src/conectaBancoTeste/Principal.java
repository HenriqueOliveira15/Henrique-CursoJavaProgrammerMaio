package conectaBancoTeste;

import java.sql.Connection;

public class Principal {

	public static void main(String[] args) {
		
		ConectarBancoTeste conexao = new ConectarBancoTeste();
		
		Connection conexaoRecebida = conexao.criarConexaoTeste();
		
		if (conexaoRecebida == null) {
			System.out.println("Não foi possível utilizar o objeto de conexão");
		} else {
			System.out.println("Utilizando o objeto de conexão");
		}
	}

}
