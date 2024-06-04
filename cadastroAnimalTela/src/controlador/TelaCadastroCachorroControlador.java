package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import cachorroArquivo.ManipuladorArquivo;
import entidades.Cachorro;

public class TelaCadastroCachorroControlador implements ActionListener {
	
	
	JTextField caixaTextoPrimeiroCampoRecebido; 
	JTextField caixaTextoSegundoCampoRecebido; 
	JTextField caixaTextoTerceiroCampoRecebido; 
	
	ManipuladorArquivo manipuladorArquivo = new ManipuladorArquivo();
	
	
	
	public TelaCadastroCachorroControlador(JTextField caixaTextoPrimeiroCampoRecebido,
			JTextField caixaTextoSegundoCampoRecebido, JTextField caixaTextoTerceiroCampoRecebido) {
		this.caixaTextoPrimeiroCampoRecebido = caixaTextoPrimeiroCampoRecebido;
		this.caixaTextoSegundoCampoRecebido = caixaTextoSegundoCampoRecebido;
		this.caixaTextoTerceiroCampoRecebido = caixaTextoTerceiroCampoRecebido;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		registrarArquivo(); // chamando o metodo de registrar o arquivo
		
		System.out.println("O NOME do cachorro: " + caixaTextoPrimeiroCampoRecebido.getText());
		
		System.out.println("O CAF do cachorro: " + caixaTextoSegundoCampoRecebido.getText());
		
		System.out.println("A COR DO PELO do cachorro: " + caixaTextoTerceiroCampoRecebido.getText());
		
		
	}
	
	public void registrarArquivo() {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome(caixaTextoPrimeiroCampoRecebido.getText());
		cachorro.setCaf(caixaTextoSegundoCampoRecebido.getText());
		cachorro.setCorPelo(caixaTextoTerceiroCampoRecebido.getText());
		
		manipuladorArquivo.registrarCachorro(cachorro);
		
		
	}

}
