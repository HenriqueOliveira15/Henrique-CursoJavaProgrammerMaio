package telas;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.TelaAlterarCachorroControlador;
import entidades.Cachorro;

public class TelaAlterarCachorro {
	
	public void chamarTelaAlterarCachorro(List<Cachorro> listaCachorros) {

		int quantidadeDeLinhas = listaCachorros.size();

		String[][] tabelaString = new String[quantidadeDeLinhas][3];

		int posicaoColuna = 0;
		int posicaoLinha = 0;

		for (Cachorro cachorro : listaCachorros) {

			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getCaf();
			posicaoColuna++;

			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getNome();

			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = cachorro.getCorPelo();

			posicaoLinha++;
			posicaoColuna = 0;

		}

		String nomeColunas[] = { "CAF", "NOME", "COR PELO" };

		JFrame framealterarCachorros = new JFrame();

		framealterarCachorros.setSize(475, 450);

		JTable tabelaCachorros = new JTable(tabelaString, nomeColunas);
		tabelaCachorros.setSize(1000, 1000);
		tabelaCachorros.setBounds(30, 40, 300, 300);

		JScrollPane scrollPaneListarCachorro = new JScrollPane(tabelaCachorros);
		scrollPaneListarCachorro.setPreferredSize(new Dimension(400, 160));

		JPanel panelListarCachorro = new JPanel();
		panelListarCachorro.setSize(1000, 1000);

		panelListarCachorro.add(scrollPaneListarCachorro);
		
		JTextField caf = new JTextField(10);
		panelListarCachorro.add(caf);
		
		JButton botaoalterar = new JButton("Alterar");
		panelListarCachorro.add(botaoalterar);

		framealterarCachorros.add(panelListarCachorro);
		framealterarCachorros.setVisible(true);
		
		TelaAlterarCachorroControlador alterarCachorroControlador = new TelaAlterarCachorroControlador(caf, framealterarCachorros);
		botaoalterar.addActionListener(alterarCachorroControlador);
	}


}
