package telas.TelasCorrentistaPremium;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import controlador.ControladorCorrentistaPadrao.TelaAlterarCorrentistaControlador;
import controlador.ControladorCorrentistaPremium.TelaAlterarCorrentistaPremiumControlador;
import entidades.CorrentistaPremium;

public class TelaAlterarCorrentistaPremium {
	
	
	public void alterarCorrentistaPremium(List<CorrentistaPremium> listaCorrentistas) {

		int quantidadeDeLinhas = listaCorrentistas.size();

		String[][] tabelaString = new String[quantidadeDeLinhas][4];

		int posicaoColuna = 0;
		int posicaoLinha = 0;

		for (CorrentistaPremium correntista : listaCorrentistas) {

			tabelaString[posicaoLinha][posicaoColuna] = correntista.getCpf();
			posicaoColuna++;

			tabelaString[posicaoLinha][posicaoColuna] = correntista.getNome();

			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getEndereco().getCep();
			
			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getEmail();

			posicaoLinha++;
			posicaoColuna = 0;

		}

		String nomeColunas[] = { "CPF", "NOME", "CEP", "EMAIL" };

		JFrame frameListarCorrentista = new JFrame();

		frameListarCorrentista.setSize(475, 450);

		JTable tabelaCorrentistas = new JTable(tabelaString, nomeColunas);
		tabelaCorrentistas.setSize(1000, 1000);
		tabelaCorrentistas.setBounds(30, 40, 300, 300);

		JScrollPane scrollPaneListarAtendente = new JScrollPane(tabelaCorrentistas);
		scrollPaneListarAtendente.setPreferredSize(new Dimension(400, 160));

		JPanel panelListarAtendente = new JPanel();
		panelListarAtendente.setSize(1000, 1000);
		JButton botaoMenu = new JButton("MENU");
		
		JButton botaoAlterar = new JButton("ALTERAR");
		
		JTextField cpfTextField = new JTextField(10);

		panelListarAtendente.add(cpfTextField);
		panelListarAtendente.add(botaoAlterar);
		
		panelListarAtendente.add(scrollPaneListarAtendente);
		panelListarAtendente.add(botaoMenu);
		frameListarCorrentista.add(panelListarAtendente);
		frameListarCorrentista.setVisible(true);
		
		TelaAlterarCorrentistaPremiumControlador alterarCorrentistaControlador = new TelaAlterarCorrentistaPremiumControlador(frameListarCorrentista, cpfTextField);
		botaoAlterar.addActionListener(alterarCorrentistaControlador);
		botaoMenu.addActionListener(alterarCorrentistaControlador);
		
		

	}
	

}
