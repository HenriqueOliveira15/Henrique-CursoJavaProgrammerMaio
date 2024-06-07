package controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telas.TelaCadastroCobra;

public class TelaMenuCobraControlador implements ActionListener {
	
	JTextField opcaoRecebida;
	JFrame frameTelaMenuCobra;

	public TelaMenuCobraControlador(JTextField opcaoRecebida, JFrame frameTelaMenuCobraFrame) {
		this.opcaoRecebida = opcaoRecebida;
		this.frameTelaMenuCobra = frameTelaMenuCobraFrame;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(opcaoRecebida.getText().equals("1") || opcaoRecebida.getText().equals("2")) {
			switch (opcaoRecebida.getText()) {
					case "1": 	
						TelaCadastroCobra.chamartelaCadastroCobra();
						System.out.println("Direcione para a tela do cachorro");
						frameTelaMenuCobra.setVisible(false);
						break;
					
					
					case "2": 
						System.out.println("Direcione para a tela da cobra");
						break;
						
					
					case "3": 
						System.exit(0);
						break;
					
				
					}
				} else {
					JOptionPane.showMessageDialog(null, "A opção " + opcaoRecebida.getText() + " não é válida");
	}
		
		
	}

}
