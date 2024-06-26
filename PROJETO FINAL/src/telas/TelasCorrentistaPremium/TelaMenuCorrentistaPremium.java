package telas.TelasCorrentistaPremium;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorCorrentistaPremium.TelaMenuCorrentistaPremiumControlador;


public class TelaMenuCorrentistaPremium {
	
public static void chamarTelaMenuCorrentistaPremium() {
		
		JFrame frameTelaMenuCorrentistaPremium = new JFrame();
		GridLayout grid = new GridLayout(0, 1);
		
		frameTelaMenuCorrentistaPremium.setSize(230, 230); 
		JPanel TelaMenuCorrentistaPremium = new JPanel();
		
		JLabel labelCadastrarCorrenstistaPremium = new JLabel(" 1 - CADASTRAR PREMIUM");
		TelaMenuCorrentistaPremium.add(labelCadastrarCorrenstistaPremium);
		
		JLabel labelListarCorrentistaPremium = new JLabel(" 2 - LISTAR PREMIUM");
		TelaMenuCorrentistaPremium.add(labelListarCorrentistaPremium);
		TelaMenuCorrentistaPremium.setLayout(grid);
		
		JLabel labelOpcaoDeletarCorrentistaPremium = new JLabel(" 3 - DELETAR PREMIUM");
		TelaMenuCorrentistaPremium.add(labelOpcaoDeletarCorrentistaPremium);
		
		JLabel labelOpcaoAlterarCorrentistaPremium = new JLabel(" 4 - ALTERAR PREMIUM");
		TelaMenuCorrentistaPremium.add(labelOpcaoAlterarCorrentistaPremium);
		
		JLabel labelOpcaoVoltar = new JLabel(" 5 - VOLTAR PARA O MENU");
		TelaMenuCorrentistaPremium.add(labelOpcaoVoltar);

		JTextField opcaoTexto = new JTextField(10);
		
		
		TelaMenuCorrentistaPremium.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		TelaMenuCorrentistaPremium.add(botaoEnviar);
		
		frameTelaMenuCorrentistaPremium.add(TelaMenuCorrentistaPremium);
		frameTelaMenuCorrentistaPremium.setVisible(true);
		
		TelaMenuCorrentistaPremiumControlador telaMenuCorrentistaPremiumControlador = new TelaMenuCorrentistaPremiumControlador(opcaoTexto, frameTelaMenuCorrentistaPremium);
		botaoEnviar.addActionListener(telaMenuCorrentistaPremiumControlador);

		
	}

}
