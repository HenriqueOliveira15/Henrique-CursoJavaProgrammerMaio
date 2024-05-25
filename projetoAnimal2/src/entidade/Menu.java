package entidade;

import java.util.Scanner;
import entidade.cadastroAnimal;

public class Menu {
	
	Scanner entradaDados = new Scanner (System.in);
	
	public void menuInicial() {
		
		cadastroAnimal cadastro = new cadastroAnimal();
		
		
		System.out.println("Digite 1 para CACHORRO e Qualquer Tecla para COBRA");
		int opcao = Integer.parseInt(entradaDados.next());
		
		
		if(opcao == 1) { 
			cadastro.cadastrarCachorro();
		}
		if(opcao == 2) {
			cadastro.cadastrarCobra();
		}
		
		
	}

}
