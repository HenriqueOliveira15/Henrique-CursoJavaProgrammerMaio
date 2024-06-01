package interfaceGrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorTelaPrincipal;

public class TelaPrincipal {
	
	public void menuPrincipal() {
		
		JFrame frameMenuPrincipal = new JFrame(); //Frame da tela
		frameMenuPrincipal.setSize(200, 200); //Informa largura e altura
		
		JPanel painelMenuPrincipal = new JPanel(); //Painel onde iremos agrupar os componentes
		
		JLabel labelOpcao1 = new JLabel("1 - PARA MENU GERENTE"); // Label da primeira opção
		painelMenuPrincipal.add(labelOpcao1); //Adicional o labelOpcao1 no painel
		
		JLabel labelOpcao2 = new JLabel("2 - PARA MENU ATENDENTE");// Label da segunda opção
		painelMenuPrincipal.add(labelOpcao2); //Adiciona o labelOpcao2 no painel
		
		JTextField caixaTextoOpcao = new JTextField(10);// Caixa de texto
		painelMenuPrincipal.add(caixaTextoOpcao); //Adiciona a caixa de texto no painel caixaTextoOpcao
		
		JButton botaoEnviar = new JButton("Enviar"); //Cria o botão com o valor enviar
		painelMenuPrincipal.add(botaoEnviar); //Adiciona o botão no painel
		
		frameMenuPrincipal.add(painelMenuPrincipal); //Adicionando o painel no frame
		frameMenuPrincipal.setVisible(true); //Tornando o frame visível
		
		ControladorTelaPrincipal controladorTelaPrincipal = new ControladorTelaPrincipal(caixaTextoOpcao, frameMenuPrincipal); //Criando o controlador já com o valor que foi digitado
		botaoEnviar.addActionListener(controladorTelaPrincipal); //Inserindo o controlador no botão
		
		
	}

}
