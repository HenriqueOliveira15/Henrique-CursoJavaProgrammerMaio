package telas;

import java.awt.Dimension;
import java.awt.TextField;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import controlador.TelaDeletarCachorroControlador;
import controlador.TelaDeletarCobraControlador;
import entidades.Cobra;

public class TelaDeletarCobra {
	
	public void chamarTelaDeletarCobra(List<Cobra> listaCobras) {

		int quantidadeDeLinhas = listaCobras.size();

		String[][] tabelaString = new String[quantidadeDeLinhas][3];

		int posicaoColuna = 0;
		int posicaoLinha = 0;

		for (Cobra cobra : listaCobras) {

			tabelaString[posicaoLinha][posicaoColuna] = cobra.getNome();
			posicaoColuna++;

			tabelaString[posicaoLinha][posicaoColuna] = cobra.getCaf();

			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = cobra.getTipoVeneno();

			posicaoLinha++;
			posicaoColuna = 0;

		}

		String nomeColunas[] = { "NOME", "CAF", "TIPO VENENO" };

		JFrame frameDeletarCobras = new JFrame();

		frameDeletarCobras.setSize(475, 450);

		JTable tabelaCobras = new JTable(tabelaString, nomeColunas);
		tabelaCobras.setSize(1000, 1000);
		tabelaCobras.setBounds(30, 40, 300, 300);

		JScrollPane scrollPaneListarCobra = new JScrollPane(tabelaCobras);
		scrollPaneListarCobra.setPreferredSize(new Dimension(400, 160));

		JPanel panelListarCobra = new JPanel();
		panelListarCobra.setSize(1000, 1000);

		panelListarCobra.add(scrollPaneListarCobra);
		
		TextField caf = new TextField(10);
		panelListarCobra.add(caf);
		
		JButton botaoDeletar = new JButton("Deletar");
		panelListarCobra.add(botaoDeletar);

		frameDeletarCobras.add(panelListarCobra);
		frameDeletarCobras.setVisible(true);
		
		TelaDeletarCobraControlador telaDeletarCobraControlador = new TelaDeletarCobraControlador(caf,frameDeletarCobras);
		botaoDeletar.addActionListener(telaDeletarCobraControlador);
		
	}

}
