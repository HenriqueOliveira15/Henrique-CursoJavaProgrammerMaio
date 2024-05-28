package entidade;

import javax.swing.JOptionPane;

public class Menu {
	
	
	public void menuInicial() {
		
		cadastroAnimal cadastro = new cadastroAnimal();
		
		
		int opcao;
		
		boolean menuResultado = true;
		
		while (menuResultado) {
		
		opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite 1 para CACHORRO, 2 para COBRA e 3 para Encerrar o programa: "));
		
		switch (opcao) {
		case 1: { 
			cadastro.cadastrarCachorro();
			break;
		}
		case 2: {
			cadastro.cadastrarCobra();
			break;
		}
		case 3: {
			System.exit(0);
			break;
		}
		default:
			JOptionPane.showMessageDialog(null, "Insira 1, 2 OU 3 ");
		
		}
		
		if(opcao == 1 || opcao == 2) {
			menuResultado = false;
		}

		
	}
	}

}
