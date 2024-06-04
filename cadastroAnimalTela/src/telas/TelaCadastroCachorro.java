package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaCadastroCachorroControlador;

public class TelaCadastroCachorro {
	
	public static void chamartelaCadastroCachorro(){
	
		
		String primeiroCampo = "Informe o NOME do Cachorro";
		String segundoCampo = "Informe o CAF do Cachorro";
		String terceiroCampo = "Informe a COR do pelo do Cachorro";
	
		
		JFrame frameTelaCadastroCachorro = new JFrame(); // Criando o frame da tela
		
		frameTelaCadastroCachorro.setSize(200, 200); // Setando o tamanho da tela
		JPanel painelTelaCadastroCachorro = new JPanel(); // Criando o painel da tela de Cadastro
		
		JLabel labelPrimeiroCampo = new JLabel (primeiroCampo); // Criando a label para a String do primeiro campo de texto do usuario
		painelTelaCadastroCachorro.add(labelPrimeiroCampo); // Adicionando o primeiro campo no painel
		
		JTextField caixaTextoPrimeiroCampo = new JTextField(10);
		painelTelaCadastroCachorro.add(caixaTextoPrimeiroCampo);
		
		JLabel labelSegundoCampo = new JLabel (segundoCampo);
		painelTelaCadastroCachorro.add(labelSegundoCampo);
		
		JTextField caixaTextoSegundoCampo = new JTextField(10);
		painelTelaCadastroCachorro.add(caixaTextoSegundoCampo);
		
		JLabel labelTerceiroCampo = new JLabel (terceiroCampo);
		painelTelaCadastroCachorro.add(labelTerceiroCampo);
		
		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		painelTelaCadastroCachorro.add(caixaTextoTerceiroCampo);
		
		
		JButton botaoCadastrar = new JButton("Enviar");
		painelTelaCadastroCachorro.add(botaoCadastrar);
		
		
		frameTelaCadastroCachorro.add(painelTelaCadastroCachorro);
		frameTelaCadastroCachorro.setVisible(true);
		
		TelaCadastroCachorroControlador cadastroCachorroControlador = new TelaCadastroCachorroControlador(caixaTextoPrimeiroCampo, caixaTextoSegundoCampo, caixaTextoTerceiroCampo);
		botaoCadastrar.addActionListener(cadastroCachorroControlador);
		
	}

		
	}

