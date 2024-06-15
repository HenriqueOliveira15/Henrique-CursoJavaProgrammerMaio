package telas;

import java.awt.GridLayout;

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
		GridLayout grid = new GridLayout(0, 1);
		
		frameTelaMenuCobra.setSize(180 , 200); 
		JPanel TelaMenuCobra = new JPanel();
		
		JLabel labelCadastrarCobra = new JLabel(" 1 - CADASTRAR COBRA");
		TelaMenuCobra.add(labelCadastrarCobra);
		
		JLabel labelListarCobra = new JLabel(" 2 - LISTAR COBRA");
		TelaMenuCobra.add(labelListarCobra);
		TelaMenuCobra.setLayout(grid);
		
		JLabel labelOpcaoDeletar = new JLabel(" 3 - DELETAR COBRA ");
		TelaMenuCobra.add(labelOpcaoDeletar);
		
		JLabel labelOpcaoAlterar = new JLabel(" 4 - ALTERAR COBRA ");
		TelaMenuCobra.add(labelOpcaoAlterar);
		
		JLabel labelOpcaoVoltar = new JLabel(" 5 - VOLTAR PARA O MENU ");
		TelaMenuCobra.add(labelOpcaoVoltar);

		JTextField opcaoTexto = new JTextField(10);
		
		
		TelaMenuCobra.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		TelaMenuCobra.add(botaoEnviar);

		frameTelaMenuCobra.add(TelaMenuCobra);
		frameTelaMenuCobra.setVisible(true);
		
		TelaMenuCobraControlador telaMenuCobraControlador = new TelaMenuCobraControlador(opcaoTexto, frameTelaMenuCobra);
		botaoEnviar.addActionListener(telaMenuCobraControlador);
	
		
	}

}
