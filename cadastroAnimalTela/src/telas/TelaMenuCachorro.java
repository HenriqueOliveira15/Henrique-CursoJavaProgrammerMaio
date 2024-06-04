package telas;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaMenuCachorroControlador;

public class TelaMenuCachorro {
	
	public static void chamarTelaMenuCachorro() {
		
		JFrame frameTelaMenuCachorro = new JFrame();
		
		frameTelaMenuCachorro.setSize(180 , 200); 
		JPanel TelaMenuCachorro = new JPanel();
		
		JLabel labelCadastrarCachorro = new JLabel(" 1 - CADASTRAR CACHORRO");
		TelaMenuCachorro.add(labelCadastrarCachorro);
		
		JLabel labelListarCachorro = new JLabel(" 2 - LISTAR CACHORRO");
		TelaMenuCachorro.add(labelListarCachorro);
		
		JLabel labelOpcaoSair = new JLabel(" 3 - SAIR ");
		TelaMenuCachorro.add(labelOpcaoSair);

		JTextField opcaoTexto = new JTextField(10);
		
		
		TelaMenuCachorro.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		TelaMenuCachorro.add(botaoEnviar);
		
		
		

		frameTelaMenuCachorro.add(TelaMenuCachorro);
		frameTelaMenuCachorro.setVisible(true);
		
		TelaMenuCachorroControlador telaMenuCachorroControlador = new TelaMenuCachorroControlador(opcaoTexto);
		botaoEnviar.addActionListener(telaMenuCachorroControlador);
		
	}

}
