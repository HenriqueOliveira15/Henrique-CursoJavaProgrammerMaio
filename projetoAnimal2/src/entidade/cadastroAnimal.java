package entidade;

import java.util.List;

import javax.swing.JOptionPane;

public class cadastroAnimal {
	
	public Cachorro cadastrarCachorro() {
		
		Cachorro cachorroEntidade = new Cachorro();
		
		cachorroEntidade.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
		
		cachorroEntidade.setIdade(JOptionPane.showInputDialog("Digite a Idade: "));
		
		cachorroEntidade.setPeso(JOptionPane.showInputDialog("Digite o Peso: "));
		
		cachorroEntidade.setPreco(JOptionPane.showInputDialog("Digite o Preço: "));
		
		cachorroEntidade.setCorPelo(JOptionPane.showInputDialog("Digite a Cor do Pelo: "));
		
		return cachorroEntidade;
		
		
	}
	
	public void imprimirCachorro(List <Cachorro> listaCachorros) {
		
		StringBuilder impressaoCachorrosString = new StringBuilder();
		
		for(Cachorro cachorroItemLista: listaCachorros) {
			impressaoCachorrosString.append("Nome: ").append(cachorroItemLista.getNome()).append("\n")
								 .append("Idade: ").append(cachorroItemLista.getIdade()).append("\n")
								 .append("Peso: ").append(cachorroItemLista.getPeso()).append("\n")
								 .append("Preço: ").append(cachorroItemLista.getPreco()).append("\n")
								 .append("Cor do Pelo: ").append(cachorroItemLista.getCorPelo()).append("\n")
								 .append("____________________________________________________").append("\n");	
		
		}
		
		JOptionPane.showMessageDialog(null, impressaoCachorrosString.toString());
		
		
	}

	public Cobra cadastrarCobra() {
		
		
		Cobra cobraEntidade = new Cobra();
		
		cobraEntidade.setNome(JOptionPane.showInputDialog("Digite o Nome: "));
		
		cobraEntidade.setIdade(JOptionPane.showInputDialog("Digite a Idade: "));
		
		cobraEntidade.setPeso(JOptionPane.showInputDialog("Digite o Peso: "));
		
		cobraEntidade.setPreco(JOptionPane.showInputDialog("Digite o Preço: "));
		
		cobraEntidade.setTipoVeneno(JOptionPane.showInputDialog("Digite o Tipo de Veneno: "));
		
		return cobraEntidade;
		
	}
	
	public void imprimirCobra(List <Cobra> listaCobras) {
		
		StringBuilder impressaoCobrasString = new StringBuilder();
		
		for(Cobra cobraItemLista: listaCobras) {
			impressaoCobrasString.append("Nome: ").append(cobraItemLista.getNome()).append("\n")
								 .append("Idade: ").append(cobraItemLista.getIdade()).append("\n")
								 .append("Peso: ").append(cobraItemLista.getPeso()).append("\n")
								 .append("Preço: ").append(cobraItemLista.getPreco()).append("\n")
								 .append("Tipo de Veneno: ").append(cobraItemLista.getTipoVeneno()).append("\n")
								 .append("____________________________________________________").append("\n");	
		}
	
		JOptionPane.showMessageDialog(null, impressaoCobrasString.toString());
		
	}


}
