package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class TelaMenuInicial {
	
	
	public void chamarTelaMenuIniciar() {
		
		JFrame frameTelaInicial = new JFrame();
		
		frameTelaInicial.setSize(200 , 200); 
		JPanel painelTelaInicial = new JPanel();
		
		JLabel labelOpcaoAnimais = new JLabel(" 1 - MENU ANIMAIS");
		painelTelaInicial.add(labelOpcaoAnimais);
		
		JLabel labelOpcaoCachorro = new JLabel(" 2 - MENU CACHORRO");
		painelTelaInicial.add(labelOpcaoCachorro);
		
		JLabel labelOpcaoCobra = new JLabel(" 3 - MENU COBRA");
		painelTelaInicial.add(labelOpcaoCobra);
		
		
		JTextField opcaoTexto = new JTextField(10);
		
		
		painelTelaInicial.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		painelTelaInicial.add(botaoEnviar);
		
		
		

		frameTelaInicial.add(painelTelaInicial);
		frameTelaInicial.setVisible(true);
	
		
	}

}
