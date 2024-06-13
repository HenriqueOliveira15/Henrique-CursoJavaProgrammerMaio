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
import entidades.Cachorro;

public class TelaDeletarCachorro {
	
	public void chamarTelaDeletarCachorro(List<Cachorro> listaCachorros) {

		int quantidadeDeLinhas = listaCachorros.size();

		String[][] tabelaString = new String[quantidadeDeLinhas][3];

		int posicaoColuna = 0;
		int posicaoLinha = 0;

		for (Cachorro cachorro : listaCachorros) {

			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getNome();
			posicaoColuna++;

			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getCaf();

			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getCorPelo();

			posicaoLinha++;
			posicaoColuna = 0;

		}

		String nomeColunas[] = { "NOME", "CAF", "COR PELO" };

		JFrame frameDeletarCachorros = new JFrame();

		frameDeletarCachorros.setSize(475, 450);

		JTable tabelaGerentes = new JTable(tabelaString, nomeColunas);
		tabelaGerentes.setSize(1000, 1000);
		tabelaGerentes.setBounds(30, 40, 300, 300);

		JScrollPane scrollPaneListarCachorro = new JScrollPane(tabelaGerentes);
		scrollPaneListarCachorro.setPreferredSize(new Dimension(400, 160));

		JPanel panelListarCachorro = new JPanel();
		panelListarCachorro.setSize(1000, 1000);

		panelListarCachorro.add(scrollPaneListarCachorro);
		
		TextField caf = new TextField(10);
		panelListarCachorro.add(caf);
		
		JButton botaoDeletar = new JButton("Deletar");
		panelListarCachorro.add(botaoDeletar);

		frameDeletarCachorros.add(panelListarCachorro);
		frameDeletarCachorros.setVisible(true);
		
		TelaDeletarCachorroControlador telaDeletarCachorroControlador = new TelaDeletarCachorroControlador(caf,frameDeletarCachorros);
		botaoDeletar.addActionListener(telaDeletarCachorroControlador);
		
	}
}

