package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaCadastroCorrentistaControlador;

public class TelaCadastroCorrentista {
	
public static void chamartelaCadastroCorrentista(){
	
		
		String nomeText = "Informe o NOME do Correntista";
		String cpfText = "Informe o CPF do Correntista";
		String cepText = "Informe o CEP do Correntista";
		String emailText = "Informe o Email do Correntista ";
		String qtdTransacaoText = "Informe a Quantidade de Transações";
	
		
		JFrame frameTelaCadastroCorrentista = new JFrame();
		GridLayout grid = new GridLayout(0, 1);
		
		frameTelaCadastroCorrentista.setSize(300, 300); 
		JPanel painelTelaCadastroCorrentista = new JPanel(); 
		
		JLabel labelPrimeiroCampo = new JLabel (nomeText); 
		painelTelaCadastroCorrentista.add(labelPrimeiroCampo); 
		
		JTextField caixaTextoPrimeiroCampo = new JTextField(10); 
		painelTelaCadastroCorrentista.add(caixaTextoPrimeiroCampo); 
		
		JLabel labelSegundoCampo = new JLabel (cpfText); 
		painelTelaCadastroCorrentista.add(labelSegundoCampo);
		
		JTextField caixaTextoSegundoCampo = new JTextField(10);
		painelTelaCadastroCorrentista.add(caixaTextoSegundoCampo);
		
		JLabel labelTerceiroCampo = new JLabel (cepText);
		painelTelaCadastroCorrentista.add(labelTerceiroCampo);
		
		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		painelTelaCadastroCorrentista.add(caixaTextoTerceiroCampo);
		painelTelaCadastroCorrentista.setLayout(grid);
		
		JLabel labelQuartoCampo = new JLabel(emailText);
		painelTelaCadastroCorrentista.add(labelQuartoCampo);
		
		JTextField caixaTextoQuartoCampo = new JTextField(10);
		painelTelaCadastroCorrentista.add(caixaTextoQuartoCampo);

		JLabel labelQuintoCampo = new JLabel(qtdTransacaoText);
		painelTelaCadastroCorrentista.add(labelQuintoCampo);

		JTextField caixaTextoQuintoCampo = new JTextField(10);
		painelTelaCadastroCorrentista.add(caixaTextoQuintoCampo);
		
		
		JButton botaoCadastrar = new JButton("Enviar"); 
		painelTelaCadastroCorrentista.add(botaoCadastrar); 
		JButton botaoVoltar = new JButton("Voltar");
		painelTelaCadastroCorrentista.add(botaoVoltar); 
		
		frameTelaCadastroCorrentista.add(painelTelaCadastroCorrentista); 
		frameTelaCadastroCorrentista.setVisible(true); 
		
		TelaCadastroCorrentistaControlador cadastroCorrentistaControlador = new TelaCadastroCorrentistaControlador(caixaTextoPrimeiroCampo, caixaTextoSegundoCampo, caixaTextoTerceiroCampo,caixaTextoQuartoCampo, frameTelaCadastroCorrentista, caixaTextoQuintoCampo);
		botaoCadastrar.addActionListener(cadastroCorrentistaControlador);
		botaoVoltar.addActionListener(cadastroCorrentistaControlador);
		
		
	}
	
	

}
