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
		
		
		System.out.println("Nome: " + cachorroEntidade.getNome());
		System.out.println("Idade: " + cachorroEntidade.getIdade());
		System.out.println("Peso: " + cachorroEntidade.getPeso());
		System.out.println("Preço: " + cachorroEntidade.getPreco());
		System.out.println("Cor do Pelo: " + cachorroEntidade.getCorPelo());
		
	}

	public void cadastrarCobra() {
		
		
		Cobra cobraEntidade = new Cobra();
		
		cobraEntidade.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
		
		cobraEntidade.setIdade(JOptionPane.showInputDialog("Digite a Idade: "));
		
		cobraEntidade.setPeso(JOptionPane.showInputDialog("Digite o Peso: "));
		
		cobraEntidade.setPreco(JOptionPane.showInputDialog("Digite o Preço: "));
		
		cobraEntidade.setTipoVeneno(JOptionPane.showInputDialog("Digite o Tipo de Veneno: "));
		
		
		System.out.println("Nome: " + cobraEntidade.getNome());
		System.out.println("Idade: " + cobraEntidade.getIdade());
		System.out.println("Peso: " + cobraEntidade.getPeso());
		System.out.println("Preço: " + cobraEntidade.getPreco());
		System.out.println("Tipo do Veneno: " + cobraEntidade.getTipoVeneno());
		
	}


}
