package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaCadastroCobraControlador;

public class TelaCadastroCobra {
	
	public static void chamartelaCadastroCobra(){
	
		
		String primeiroCampo2 = "Informe o NOME da Cobra ";
		String segundoCampo2 = "Informe o CAF da Cobra";
		String terceiroCampo2 = "Informe o TIPO DE VENENO da Cobra";
		String quartoCampo2 = "Informe o PESO da Cobra";
		String cep = "Digite o CEP";
	
		
		JFrame frameTelaCadastroCobra = new JFrame();
		GridLayout grid = new GridLayout(0, 1);
		
		frameTelaCadastroCobra.setSize(300, 300); 
		JPanel painelTelaCadastroCobra = new JPanel();
		
		JLabel labelPrimeiroCampo = new JLabel (primeiroCampo2); 
		painelTelaCadastroCobra.add(labelPrimeiroCampo); 
		
		JTextField caixaTextoPrimeiroCampo = new JTextField(10); 
		painelTelaCadastroCobra.add(caixaTextoPrimeiroCampo);  
		
		JLabel labelSegundoCampo = new JLabel (segundoCampo2); 
		painelTelaCadastroCobra.add(labelSegundoCampo);
		
		JTextField caixaTextoSegundoCampo = new JTextField(10);
		painelTelaCadastroCobra.add(caixaTextoSegundoCampo);
		
		JLabel labelTerceiroCampo = new JLabel (terceiroCampo2);
		painelTelaCadastroCobra.add(labelTerceiroCampo);
		
		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		painelTelaCadastroCobra.add(caixaTextoTerceiroCampo);
		painelTelaCadastroCobra.setLayout(grid);
		
		JLabel labelQuartoCampo = new JLabel (quartoCampo2); 
		painelTelaCadastroCobra.add(labelQuartoCampo);
		
		JTextField caixaTextoQuartoCampo = new JTextField(10);
		painelTelaCadastroCobra.add(caixaTextoQuartoCampo);
		
		JLabel jlabelCep = new JLabel(cep);
		painelTelaCadastroCobra.add(jlabelCep);

		JTextField caixaTextoCep = new JTextField(10);
		painelTelaCadastroCobra.add(caixaTextoCep);
		
		
		JButton botaoCadastrar = new JButton("Enviar"); 
		painelTelaCadastroCobra.add(botaoCadastrar); 
		
		JButton botaoVoltar = new JButton("Voltar");
		painelTelaCadastroCobra.add(botaoVoltar);
		
		
		frameTelaCadastroCobra.add(painelTelaCadastroCobra); 
		frameTelaCadastroCobra.setVisible(true);
		
		TelaCadastroCobraControlador cadastroCobraControlador = new TelaCadastroCobraControlador(caixaTextoPrimeiroCampo, caixaTextoSegundoCampo, caixaTextoTerceiroCampo, frameTelaCadastroCobra, 
				caixaTextoQuartoCampo, caixaTextoCep );
		
		botaoCadastrar.addActionListener(cadastroCobraControlador);
		botaoVoltar.addActionListener(cadastroCobraControlador);
	}

}
