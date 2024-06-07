package controlador;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telas.TelaMenuCachorro;
import telas.TelaMenuCobra;

public class TelaMenuInicialControlador implements ActionListener {
	
	JTextField opcao;
	JFrame frameTelaInicial;
	

	public TelaMenuInicialControlador(JTextField opcao, JFrame frameTelaInicial) {
		this.opcao = opcao;
		this.frameTelaInicial= frameTelaInicial;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(opcao.getText().equals("1") || opcao.getText().equals("2")) {
			switch (opcao.getText()) {
					case "1": 	
						TelaMenuCachorro.chamarTelaMenuCachorro();
						System.out.println("Direcione para a tela do cachorro");
						frameTelaInicial.setVisible(false);
						break;
					
					
					case "2": 
						TelaMenuCobra.chamarTelaMenuCobra();
						System.out.println("Direcione para a tela da cobra");
						frameTelaInicial.setVisible(false);
						break;
						
					
					case "3": 
						System.exit(0);
						break;
					
				
					}
				} else {
					JOptionPane.showMessageDialog(null, "A opção " + opcao.getText() + " não é válida");
		
		} 
		}
	

	}
