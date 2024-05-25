package entidade;

import java.util.Scanner;

public class cadastroAnimal {
	Scanner entradaDados = new Scanner (System.in);
	
	public void cadastrarCachorro() {
		
		Cachorro cachorroEntidade = new Cachorro();
		
		System.out.println("Digite o nome do Cachorro: ");
		cachorroEntidade.setNome(entradaDados.next());
		
		System.out.println("Digite a idade do Cachorro: ");
		cachorroEntidade.setIdade(entradaDados.next());
		
		System.out.println("Digite o peso do Cachorro: ");
		cachorroEntidade.setPeso(entradaDados.next());
		
		System.out.println("Digite o preço do Cachorro: ");
		cachorroEntidade.setPreco(entradaDados.next());
		
		System.out.println("Digite a cor do Pelo do cachorro: ");
		cachorroEntidade.setCorPelo(entradaDados.next());
		
		
		System.out.println("##### DADOS DO CACHORRO #####");
		
		System.out.println("Nome: " + cachorroEntidade.getNome());
		System.out.println("Idade: " + cachorroEntidade.getIdade());
		System.out.println("Peso: " + cachorroEntidade.getPeso());
		System.out.println("Preço: " + cachorroEntidade.getPreco());
		System.out.println("Cor do Pelo: " + cachorroEntidade.getCorPelo());
		
	}

	public void cadastrarCobra() {
		
		
		Cobra cobraEntidade = new Cobra();
		
		System.out.println("Digite o nome da Cobra: ");
		cobraEntidade.setNome(entradaDados.next());
		
		System.out.println("Digite a idade da Cobra: ");
		cobraEntidade.setIdade(entradaDados.next());
		
		System.out.println("Digite o peso da Cobra: ");
		cobraEntidade.setPeso(entradaDados.next());
		
		System.out.println("Digite o preço da Cobra: ");
		cobraEntidade.setPreco(entradaDados.next());
		
		System.out.println("Digite o tipo de veneno da Cobra: ");
		cobraEntidade.setTipoVeneno(entradaDados.next());
		
		
		System.out.println("##### DADOS DA COBRA #####");
		
		System.out.println("Nome: " + cobraEntidade.getNome());
		System.out.println("Idade: " + cobraEntidade.getIdade());
		System.out.println("Peso: " + cobraEntidade.getPeso());
		System.out.println("Preço: " + cobraEntidade.getPreco());
		System.out.println("Tipo do Veneno: " + cobraEntidade.getTipoVeneno());
		
	}


}
