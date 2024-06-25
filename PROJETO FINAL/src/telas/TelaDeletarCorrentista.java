package telas;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.TelaListarCorrentistaControlador;
import entidades.Correntista;

public class TelaDeletarCorrentista  {
	
	public void deletarCorrentista(List<Correntista> listaCorrentistas) {

			int quantidadeDeLinhas = listaCorrentistas.size();

			String[][] tabelaString = new String[quantidadeDeLinhas][3];

			int posicaoColuna = 0;
			int posicaoLinha = 0;

			for (Correntista correntista : listaCorrentistas) {

				tabelaString[posicaoLinha][posicaoColuna] = correntista.getNome();
				posicaoColuna++;

				tabelaString[posicaoLinha][posicaoColuna] = correntista.getCpf();

				posicaoColuna++;
				tabelaString[posicaoLinha][posicaoColuna] = correntista.getCep();

				posicaoLinha++;
				posicaoColuna = 0;

			}

			String nomeColunas[] = { "NOME", "CPF", "CEP" };

			JFrame frameDeletarCorrentistas = new JFrame();

			frameDeletarCorrentistas.setSize(500, 600);

			JTable tabelaCorrentistas = new JTable(tabelaString, nomeColunas);
			tabelaCorrentistas.setSize(1000, 1000);
			tabelaCorrentistas.setBounds(30, 40, 300, 300);

			JScrollPane scrollPainelListarCorrentistas = new JScrollPane(tabelaCorrentistas);
			scrollPainelListarCorrentistas.setPreferredSize(new Dimension(400, 160));

			JPanel painelDeletarCorrentista = new JPanel();
			painelDeletarCorrentista.setSize(1000, 1000);
			painelDeletarCorrentista.add(scrollPainelListarCorrentistas);

			JTextField cpf = new JTextField(10);
			painelDeletarCorrentista.add(cpf);
			JButton botaoMenu = new JButton("MENU");

			JButton botaoDeletar = new JButton("DELETAR");
			JTextField cafTextField = new JTextField(10);

			painelDeletarCorrentista.add(botaoMenu);
			painelDeletarCorrentista.add(botaoDeletar);

			frameDeletarCorrentistas.add(painelDeletarCorrentista);
			frameDeletarCorrentistas.setVisible(true);

			TelaListarCorrentistaControlador correntistaControlador = new TelaListarCorrentistaControlador(cpf, frameDeletarCorrentistas);
			botaoDeletar.addActionListener(correntistaControlador);
			botaoMenu.addActionListener(correntistaControlador);

		
	}

}
