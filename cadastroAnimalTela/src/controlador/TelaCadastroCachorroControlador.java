package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Arquivo.ManipuladorArquivo;
import entidades.Cachorro;
import persistencia.DaoCachorro;

public class TelaCadastroCachorroControlador implements ActionListener {
	
	
	JTextField caixaTextoPrimeiroCampoRecebido; 
	JTextField caixaTextoSegundoCampoRecebido; 
	JTextField caixaTextoTerceiroCampoRecebido; 
	JFrame frameTelaCadastroCachorro;
	
	ManipuladorArquivo manipuladorArquivo = new ManipuladorArquivo();
	DaoCachorro daoCachorro = new DaoCachorro();
	
	
	
	public TelaCadastroCachorroControlador(JTextField caixaTextoPrimeiroCampoRecebido,
			JTextField caixaTextoSegundoCampoRecebido, JTextField caixaTextoTerceiroCampoRecebido, JFrame frameTelaCadastroCachorro) {
		this.caixaTextoPrimeiroCampoRecebido = caixaTextoPrimeiroCampoRecebido;
		this.caixaTextoSegundoCampoRecebido = caixaTextoSegundoCampoRecebido;
		this.caixaTextoTerceiroCampoRecebido = caixaTextoTerceiroCampoRecebido;
		this.frameTelaCadastroCachorro = frameTelaCadastroCachorro;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		registrarArquivo(); // chamando o metodo de registrar o arquivo
		
		System.out.println("O NOME do cachorro: " + caixaTextoPrimeiroCampoRecebido.getText());
		
		System.out.println("O CAF do cachorro: " + caixaTextoSegundoCampoRecebido.getText());
		
		System.out.println("A COR DO PELO do cachorro: " + caixaTextoTerceiroCampoRecebido.getText());
		
		frameTelaCadastroCachorro.setVisible(false);
		
		
	}
	
	public void registrarArquivo() {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome(caixaTextoPrimeiroCampoRecebido.getText());
		cachorro.setCaf(caixaTextoSegundoCampoRecebido.getText());
		cachorro.setCorPelo(caixaTextoTerceiroCampoRecebido.getText());
		
		manipuladorArquivo.registrarCachorro(cachorro);
		
		if(daoCachorro.salvarCachorro(cachorro)){
			JOptionPane.showMessageDialog(null, "Dados salvo com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Nao foi possivel salvar os dados");
		
		
	}

	}
}
