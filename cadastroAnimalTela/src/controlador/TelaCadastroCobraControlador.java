package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import Arquivo.ManipuladorArquivo;
import entidades.Cobra;


public class TelaCadastroCobraControlador implements ActionListener{
	
	JTextField caixaTextoPrimeiroCampoRecebido; 
	JTextField caixaTextoSegundoCampoRecebido; 
	JTextField caixaTextoTerceiroCampoRecebido; 
	
	ManipuladorArquivo manipuladorArquivo = new ManipuladorArquivo();
	
	public TelaCadastroCobraControlador(JTextField caixaTextoPrimeiroCampoRecebido,
			JTextField caixaTextoSegundoCampoRecebido, JTextField caixaTextoTerceiroCampoRecebido) {
		
		this.caixaTextoPrimeiroCampoRecebido = caixaTextoPrimeiroCampoRecebido;
		this.caixaTextoSegundoCampoRecebido = caixaTextoSegundoCampoRecebido;
		this.caixaTextoTerceiroCampoRecebido = caixaTextoTerceiroCampoRecebido;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		registrarArquivo(); // chamando o metodo de registrar o arquivo
		
		System.out.println("O NOME da Cobra: " + caixaTextoPrimeiroCampoRecebido.getText());
		
		System.out.println("O CAF da Cobra: " + caixaTextoSegundoCampoRecebido.getText());
		
		System.out.println("O TIPO DE VENENO da Cobra: " + caixaTextoTerceiroCampoRecebido.getText());	
		
	}
	
	public void registrarArquivo() {
		
		Cobra cobra = new Cobra();
		
		cobra.setNome(caixaTextoPrimeiroCampoRecebido.getText());
		cobra.setCaf(caixaTextoSegundoCampoRecebido.getText());
		cobra.setTipoVeneno(caixaTextoTerceiroCampoRecebido.getText());
		
		manipuladorArquivo.registrarCobra(cobra);
		
		
	}

}
