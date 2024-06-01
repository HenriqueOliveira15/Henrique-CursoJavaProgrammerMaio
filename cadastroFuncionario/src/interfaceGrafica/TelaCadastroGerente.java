package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorTelaCadastroGerente;

public class TelaCadastroGerente {
	
	public void formularioGerente() {
		
		String nomeGerente = "Digite o nome do Gerente: ";
		String cpfGerente = "Digite o cpf do gerente: ";
		String gerenciaGerente = "Digite a Gerencia: ";
		
		JFrame frameCadastroGerente = new JFrame();
		frameCadastroGerente.setSize(300, 300);
		
		JPanel painelGerente = new JPanel();
		
		JLabel labelnome = new JLabel(nomeGerente);
		painelGerente.add(labelnome);
		
		JTextField nomeText = new JTextField(10);
		painelGerente.add(nomeText);
		
		JLabel labelCpfGerente = new JLabel(cpfGerente);
		painelGerente.add(labelCpfGerente);
		
		JTextField cpfText = new JTextField(10);
		painelGerente.add(cpfText);
		
		JLabel labelGerenciaGerente = new JLabel (gerenciaGerente);
		painelGerente.add(labelGerenciaGerente);
		
		JTextField gerenciaText = new JTextField(10);
		painelGerente.add(gerenciaText);
		
		JButton botaoCadastroGerente = new JButton("Enviar");
		painelGerente.add(botaoCadastroGerente);
		
		frameCadastroGerente.add(painelGerente);
		frameCadastroGerente.setVisible(true);
		
		ControladorTelaCadastroGerente cadastroGerente = new ControladorTelaCadastroGerente(nomeText, cpfText, gerenciaText);
		botaoCadastroGerente.addActionListener(cadastroGerente);
		
		
		
		
		
		
		
		
		
	}
}
