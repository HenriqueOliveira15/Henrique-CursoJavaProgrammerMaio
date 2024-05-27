package entidade;

import javax.swing.JOptionPane;

public class cadastroAnimal {
	
	public void cadastrarCachorro() {
		
		Cachorro cachorroEntidade = new Cachorro();
		
		cachorroEntidade.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
		
		cachorroEntidade.setIdade(JOptionPane.showInputDialog("Digite a Idade: "));
		
		cachorroEntidade.setPeso(JOptionPane.showInputDialog("Digite o Peso: "));
		
		cachorroEntidade.setPreco(JOptionPane.showInputDialog("Digite o Preço: "));
		
		cachorroEntidade.setCorPelo(JOptionPane.showInputDialog("Digite a Cor do Pelo: "));
		
		JOptionPane.showMessageDialog(null, "NOME: " + cachorroEntidade.getNome() + "\n" +
				"IDADE: " + cachorroEntidade.getIdade() + "\n" +
				"PESO: " + cachorroEntidade.getPeso() + "\n" +
				"PREÇO: " + cachorroEntidade.getPreco() + "\n" +
				"COR DO PELO: " + cachorroEntidade.getCorPelo());
		
	}

	public void cadastrarCobra() {
		
		
		Cobra cobraEntidade = new Cobra();
		
		cobraEntidade.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
		
		cobraEntidade.setIdade(JOptionPane.showInputDialog("Digite a Idade: "));
		
		cobraEntidade.setPeso(JOptionPane.showInputDialog("Digite o Peso: "));
		
		cobraEntidade.setPreco(JOptionPane.showInputDialog("Digite o Preço: "));
		
		cobraEntidade.setTipoVeneno(JOptionPane.showInputDialog("Digite o Tipo de Veneno: "));
		
		
		JOptionPane.showMessageDialog(null, "NOME: " + cobraEntidade.getNome() + "\n" +
				"IDADE: " + cobraEntidade.getIdade() + "\n" +
				"PESO: " + cobraEntidade.getPeso() + "\n" +
				"PREÇO: " + cobraEntidade.getPreco() + "\n" +
				"TIPO DO VENENO: " + cobraEntidade.getTipoVeneno());
		
	}


}
