package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JOptionPane;
import javax.swing.JTextField;

import telas.TelaCadastroCobra;

public class TelaMenuCobraControlador implements ActionListener {
	
	JTextField opcaoRecebida;

	public TelaMenuCobraControlador(JTextField opcaoRecebida) {
		this.opcaoRecebida = opcaoRecebida;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(opcaoRecebida.getText().equals("1") || opcaoRecebida.getText().equals("2")) {
			switch (opcaoRecebida.getText()) {
					case "1": 	
						TelaCadastroCobra.chamartelaCadastroCobra();
						System.out.println("Direcione para a tela do cachorro");
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
