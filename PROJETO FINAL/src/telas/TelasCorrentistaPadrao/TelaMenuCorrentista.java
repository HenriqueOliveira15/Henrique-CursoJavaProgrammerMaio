package telas.TelasCorrentistaPadrao;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorCorrentistaPadrao.TelaMenuCorrentistaControlador;

public class TelaMenuCorrentista {
	
public static void chamarTelaMenuCorrentista() {
		
		JFrame frameTelaMenuCorrentista = new JFrame();
		GridLayout grid = new GridLayout(0, 1);
		
		frameTelaMenuCorrentista.setSize(230, 230); 
		JPanel TelaMenuCorrentista = new JPanel();
		
		JLabel labelCadastrarCorrenstista = new JLabel(" 1 - CADASTRAR CORRENTISTA");
		TelaMenuCorrentista.add(labelCadastrarCorrenstista);
		
		JLabel labelListarCorrentista = new JLabel(" 2 - LISTAR CORRENTISTA");
		TelaMenuCorrentista.add(labelListarCorrentista);
		TelaMenuCorrentista.setLayout(grid);
		
		JLabel labelOpcaoDeletarCorrentista = new JLabel(" 3 - DELETAR CORRENTISTA");
		TelaMenuCorrentista.add(labelOpcaoDeletarCorrentista);
		
		JLabel labelOpcaoAlterarCorrentista = new JLabel("4 - ALTERAR CORRENTISTA");
		TelaMenuCorrentista.add(labelOpcaoAlterarCorrentista);
		
		JLabel labelOpcaoVoltar = new JLabel("5 - VOLTAR PARA O MENU");
		TelaMenuCorrentista.add(labelOpcaoVoltar);

		JTextField opcaoTexto = new JTextField(10);
		
		
		TelaMenuCorrentista.add(opcaoTexto);
		
		JButton botaoEnviar = new JButton("Enviar");
		TelaMenuCorrentista.add(botaoEnviar);
		
		frameTelaMenuCorrentista.add(TelaMenuCorrentista);
		frameTelaMenuCorrentista.setVisible(true);
		
		TelaMenuCorrentistaControlador telaMenuCachorroControlador = new TelaMenuCorrentistaControlador(opcaoTexto, frameTelaMenuCorrentista);
		botaoEnviar.addActionListener(telaMenuCachorroControlador);

		
	}

}
