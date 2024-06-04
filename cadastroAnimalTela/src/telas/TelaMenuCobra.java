package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaMenuCachorroControlador;
import controlador.TelaMenuCobraControlador;

public class TelaMenuCobra {
	
public static void chamarTelaMenuCobra() {
		
		JFrame frameTelaMenuCobra = new JFrame();
		
		frameTelaMenuCobra.setSize(180 , 200); 
		JPanel TelaMenuCobra = new JPanel();
		
		JLabel labelCadastrarCobra = new JLabel(" 1 - CADASTRAR COBRA");
		TelaMenuCobra.add(labelCadastrarCobra);
		
		JLabel labelListarCobra = new JLabel(" 2 - LISTAR COBRA");
		TelaMenuCobra.add(labelListarCobra);
		
		JLabel labelOpcaoSair = new JLabel(" 3 - SAIR ");
		TelaMenuCobra.add(labelOpcaoSair);

		JTextField opcaoTexto = new JTextField(10);
		
		
		TelaMenuCobra.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		TelaMenuCobra.add(botaoEnviar);
		
		
		

		frameTelaMenuCobra.add(TelaMenuCobra);
		frameTelaMenuCobra.setVisible(true);
		
		TelaMenuCobraControlador telaMenuCobraControlador = new TelaMenuCobraControlador(opcaoTexto);
		botaoEnviar.addActionListener(telaMenuCobraControlador);
		
	}

}
