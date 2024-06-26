package telas;

import java.awt.GridLayout;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaMenuInicialControlador;


public class TelaMenuInicial {
	
	
	public void chamarTelaMenuIniciar() {
		
		JFrame frameTelaInicial = new JFrame();
		
		GridLayout grid = new GridLayout(0, 1);
	
		frameTelaInicial.setSize(170 , 200); 
		JPanel painelTelaInicial = new JPanel();
		
		JLabel labelOpcaoCachorro = new JLabel(" 1 - MENU CACHORRO");
		painelTelaInicial.add(labelOpcaoCachorro);
		
		JLabel labelOpcaoCobra = new JLabel(" 2 - MENU COBRA");
		painelTelaInicial.add(labelOpcaoCobra);
		painelTelaInicial.setLayout(grid);
		
		JLabel labelOpcaoSair = new JLabel(" 3 - SAIR ");
		painelTelaInicial.add(labelOpcaoSair);

		JTextField opcaoTexto = new JTextField(10);
		
		
		painelTelaInicial.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		painelTelaInicial.add(botaoEnviar);
		
		
		

		frameTelaInicial.add(painelTelaInicial);
		frameTelaInicial.setVisible(true);
		
		TelaMenuInicialControlador telaMenuInicialControlador = new TelaMenuInicialControlador(opcaoTexto, frameTelaInicial);
		botaoEnviar.addActionListener(telaMenuInicialControlador);
		
	
		
	}


}
