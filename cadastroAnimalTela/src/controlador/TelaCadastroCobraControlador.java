package controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import Arquivo.ManipuladorArquivo;
import entidades.Cobra;
import persistencia.DaoCobra;


public class TelaCadastroCobraControlador implements ActionListener{
	
	JTextField caixaTextoPrimeiroCampoRecebido; 
	JTextField caixaTextoSegundoCampoRecebido; 
	JTextField caixaTextoTerceiroCampoRecebido; 
	JFrame frameTelaCadastroCobra;
	
	ManipuladorArquivo manipuladorArquivo = new ManipuladorArquivo();
	DaoCobra daoCobra = new DaoCobra();
	
	public TelaCadastroCobraControlador(JTextField caixaTextoPrimeiroCampoRecebido,
			JTextField caixaTextoSegundoCampoRecebido, JTextField caixaTextoTerceiroCampoRecebido, JFrame frameTelaCadastroCobra) {
		
		this.caixaTextoPrimeiroCampoRecebido = caixaTextoPrimeiroCampoRecebido;
		this.caixaTextoSegundoCampoRecebido = caixaTextoSegundoCampoRecebido;
		this.caixaTextoTerceiroCampoRecebido = caixaTextoTerceiroCampoRecebido;
		this.frameTelaCadastroCobra = frameTelaCadastroCobra;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		registrarArquivo(); // chamando o metodo de registrar o arquivo
		
		System.out.println("O NOME da Cobra: " + caixaTextoPrimeiroCampoRecebido.getText());
		
		System.out.println("O CAF da Cobra: " + caixaTextoSegundoCampoRecebido.getText());
		
		System.out.println("O TIPO DE VENENO da Cobra: " + caixaTextoTerceiroCampoRecebido.getText());	
		
		frameTelaCadastroCobra.setVisible(false);
		
	}
	
	public void registrarArquivo() {
		
		Cobra cobra = new Cobra();
		
		cobra.setNome(caixaTextoPrimeiroCampoRecebido.getText());
		cobra.setCaf(caixaTextoSegundoCampoRecebido.getText());
		cobra.setTipoVeneno(caixaTextoTerceiroCampoRecebido.getText());
		
		manipuladorArquivo.registrarCobra(cobra);
		
		if(daoCobra.salvarCobra(cobra)){
			JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Nao foi possivel salvar os dados");
		
		
	}

}
}
