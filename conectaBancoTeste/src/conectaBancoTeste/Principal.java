package conectaBancoTeste;

import java.sql.Connection;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		
		ConectarBancoTeste conexao = new ConectarBancoTeste();
		
		Connection conexaoRecebida = conexao.criarConexaoTeste();
		
		DaoPessoa daoPessoa = new DaoPessoa();
		
		Pessoa pessoa = new Pessoa();
		pessoa.setCpf("055");
		pessoa.setNome("Henrique pelo Java");
		pessoa.setEmail("email@java.com");

		
		boolean resultado = daoPessoa.salvarPessoaNoBanco(pessoa);
		
		if (resultado){
			JOptionPane.showMessageDialog(null, "Funcionou");
		} else {
			JOptionPane.showMessageDialog(null, "Não funcionou");
		}
		
		
		
		if (conexaoRecebida == null) {
			System.out.println("Não foi possível utilizar o objeto de conexão");
		} else {
			System.out.println("Utilizando o objeto de conexão");
		}
	}

}
