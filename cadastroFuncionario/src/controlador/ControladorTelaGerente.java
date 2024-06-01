package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import interfaceGrafica.TelaCadastroGerente;

public class ControladorTelaGerente implements ActionListener {
	
	JTextField opcaoMenuGerente;
	JFrame frameMenuGerente;
	
	TelaCadastroGerente cadastroGerente = new TelaCadastroGerente();
	
	
	public ControladorTelaGerente(JTextField opcaoMenuGerente, JFrame frameMenuGerente);{
		this.opcaoMenuGerente = opcaoMenuGerente;
		this.frameMenuGerente = frameMenuGerente;
	}
	
	@Override
	public void actionPerfomed(ActionEvent e) {
		String opcao = opcaoMenuGerente.getText();
		
		if (opcao.equals("1") || opcao.equals("2")) {
			
			
			switch (opcao) {
			case "1":{
				cadastroGerente.formularioGerente();
				System.out.println("Digitou a opção 1");
				break;
			}
			case "2": {
				cadastroGerente.formularioGerente();
				System.out.println("Digitou a opção 2");
				break;
			}
		}	
		} else {
			JOptionPane.showMessageDialog(null, "Somente 1 ou 2 é Válido");
		}
				
		
	}
	
	

}
