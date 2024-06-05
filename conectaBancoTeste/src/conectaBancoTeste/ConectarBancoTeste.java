package conectaBancoTeste;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConectarBancoTeste {
	
	private static String USUARIO= "root";
	private static String SENHA = "root";
	private static String BANCO_URL = "jdbc:mysql://localhost:3306/teste?useTimezone=true&serverTimezone=UTC";
	
	public Connection criarConexaoTeste() {
		
		Connection conexaoBancoTeste = null;
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			conexaoBancoTeste = DriverManager.getConnection(BANCO_URL, USUARIO, SENHA);
			System.out.println("Conectado ao banco");
		
		} catch (Exception e) {
			
			System.out.println(e.getMessage());
			System.out.println("A conexão falhou");
		}
		
		return conexaoBancoTeste;

	}

}
