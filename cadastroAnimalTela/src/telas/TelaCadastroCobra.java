package telas;

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
		String terceiroCampo2 = "Informe o TIPO DE VENENO da cobra";
	
		
		JFrame frameTelaCadastroCobra = new JFrame(); // Criando o frame da tela
		
		frameTelaCadastroCobra.setSize(200, 200); // Setando o tamanho da tela
		JPanel painelTelaCadastroCobra = new JPanel(); // Criando o painel da tela de Cadastro
		
		JLabel labelPrimeiroCampo = new JLabel (primeiroCampo2); // Criando a label para a String do Nome do Cachorro
		painelTelaCadastroCobra.add(labelPrimeiroCampo); // Adicionando o primeiro label no painel
		
		JTextField caixaTextoPrimeiroCampo = new JTextField(10); // Criando uma caixa de texto para a primeira Label do usuario
		painelTelaCadastroCobra.add(caixaTextoPrimeiroCampo); // adicionando a label no painel  
		
		JLabel labelSegundoCampo = new JLabel (segundoCampo2); 
		painelTelaCadastroCobra.add(labelSegundoCampo);
		
		JTextField caixaTextoSegundoCampo = new JTextField(10);
		painelTelaCadastroCobra.add(caixaTextoSegundoCampo);
		
		JLabel labelTerceiroCampo = new JLabel (terceiroCampo2);
		painelTelaCadastroCobra.add(labelTerceiroCampo);
		
		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		painelTelaCadastroCobra.add(caixaTextoTerceiroCampo);
		
		
		JButton botaoCadastrar = new JButton("Enviar"); // Criando o botão enviar para que os dados inseridos pelo usuario sejam cadastrados 
		painelTelaCadastroCobra.add(botaoCadastrar); // adicionando o botão no painel
		
		
		frameTelaCadastroCobra.add(painelTelaCadastroCobra); // criando o frame do painel da tela de cadastro do cachorro
		frameTelaCadastroCobra.setVisible(true); // deixando o frame visivel
		
		TelaCadastroCobraControlador cadastroCobraControlador = new TelaCadastroCobraControlador(caixaTextoPrimeiroCampo, caixaTextoSegundoCampo, caixaTextoTerceiroCampo);
		botaoCadastrar.addActionListener(cadastroCobraControlador);
		
	}

}
