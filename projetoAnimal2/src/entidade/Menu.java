package entidade;

import java.util.Scanner;
import entidade.cadastroAnimal;

public class Menu {
	
	Scanner entradaDados = new Scanner (System.in);
	
	public void menuInicial() {
		
		cadastroAnimal cadastro = new cadastroAnimal();
		
		cadastro.cadastrarCachorro();
		
		cadastro.cadastrarCobra();
		
		System.out.println("Digite 1 para CACHORRO e Qualquer Tecla para COBRA");
		int opcao = Integer.parseInt(entradaDados.next());
		
		
		if(opcao == 1) { 
			cadastroAnimal.cadastrarCachorro();
		}
		if(opcao == 2) {
			cadastroAnimal.cadastrarCobra();
		}
		
		if(opcao != 1 || opcao != 2) {
			System.out.println("Escolha entre um ou dois");
		}
		
	}

}
