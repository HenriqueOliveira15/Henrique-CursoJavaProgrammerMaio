package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entidades.Gerente;

public class ControladorTelaCadastroGerente implements ActionListener{
	
	JTextField nome;
	JTextField cpf;
	JTextField gerencia;
	
	ManipuladorArquivo arquivo = new ManipuladorArquivo();
	
	public ControladorTelaCadastroGerente(JTextfield nome, JTextfield cpf, JTextfield gerencia) {
		this.nome = nome;
		this.cpf = cpf;
		this.gerencia = gerencia;
		
		ManipuladorArquivo arquivo = new ManipuladorArquivo();
	}
		

	@Override
	public void ActionPerformed(ActionEvent e) {
		registrarGerente();
		}
	
	public void registrarGerente(){
		Gerente gerente = new Gerente();
		gerente.setNome(nome.getText());
		gerente.setCpf(cpf.getText());
		gerente.setGerencia(gerencia.getText());
		arquivo.registrarGerente(gerente);
	}

}
