package entidade;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class Menu {
	
	
	public void menuInicial() {
		
		cadastroAnimal cadastro = new cadastroAnimal();
		Cobra cobraParaAddNaLista = new Cobra();
		Cachorro cachorroParaAddNaLista = new Cachorro();
		List <Cobra> cobraLista = new ArrayList <Cobra>();
		List <Cachorro> cachorroLista = new ArrayList <Cachorro>();
		
		
		int opcao;
		
		while (true) {
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("DIGITE 1 PARA CADASTRAR CACHORRO" + "\n"
				+ "DIGITE 2 PARA CADASTRAR COBRA" + "\n"
				+ "DIGITE 3 PARA LISTAR CACHORROS" + "\n"
				+ "DIGITE 4 PARA LISTAR COBRAS" + "\n"
				+ "DIGITE 5 PARA ENCERRAR O PROGRAMA " + "\n"));
		
		switch (opcao) {
		case 1: { 
			cachorroParaAddNaLista = cadastro.cadastrarCachorro();
			cachorroLista.add(cachorroParaAddNaLista);
			break;
		}
		case 2: {
			cobraParaAddNaLista = cadastro.cadastrarCobra();
			cobraLista.add(cobraParaAddNaLista);			
			break;
		}
		case 3: {
			cadastro.imprimirCachorro(cachorroLista);
			break;
		}
		
		case 4: {
			cadastro.imprimirCobra(cobraLista);
			break;
		}
		
		case 5: {
			System.exit(0);
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Insira 1, 2 OU 3 ");
		
			}
		
		}
	}

}
