package telas.TelasCorrentistaPadrao;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.ControladorCorrentistaPadrao.TelaListarCorrentistaControlador;
import entidades.Correntista;
import entidades.CorrentistaPadrao;

public class TelaListarCorrentista {

	public void listarCorrentista(List<CorrentistaPadrao> list) {

		int quantidadeDeLinhas = list.size();

		String[][] tabelaString = new String[quantidadeDeLinhas][4];

		int posicaoColuna = 0;
		int posicaoLinha = 0;

		for (Correntista correntista : list) {

			tabelaString[posicaoLinha][posicaoColuna] = correntista.getNome();
			posicaoColuna++;

			tabelaString[posicaoLinha][posicaoColuna] = correntista.getCpf();

			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getEndereco().getCep();
			
			posicaoColuna++;
			tabelaString[posicaoLinha][posicaoColuna] = correntista.getEmail();

			posicaoLinha++;
			posicaoColuna = 0;

		}

		String nomeColunas[] = { "NOME", "CPF", "CEP", "EMAIL" };

		JFrame frameListarCorrentistas = new JFrame();

		frameListarCorrentistas.setSize(500, 600);

		JTable tabelaCorrentistas = new JTable(tabelaString, nomeColunas);
		tabelaCorrentistas.setSize(1000, 1000);
		tabelaCorrentistas.setBounds(30, 40, 300, 300);

		JScrollPane scrollPainelListarCorrentistas = new JScrollPane(tabelaCorrentistas);
		scrollPainelListarCorrentistas.setPreferredSize(new Dimension(400, 160));

		JPanel painelListarCorrentista = new JPanel();
		painelListarCorrentista.setSize(1000, 1000);
		painelListarCorrentista.add(scrollPainelListarCorrentistas);

		JTextField cpf = new JTextField(10);
		painelListarCorrentista.add(cpf);
		JButton botaoMenu = new JButton("MENU");

		JButton botaoGerarPdf = new JButton("Gerar PDF");
		JTextField cafTextField = new JTextField(10);

		painelListarCorrentista.add(botaoMenu);
		painelListarCorrentista.add(botaoGerarPdf);

		frameListarCorrentistas.add(painelListarCorrentista);
		frameListarCorrentistas.setVisible(true);

		TelaListarCorrentistaControlador correntistaControlador = new TelaListarCorrentistaControlador(cpf, frameListarCorrentistas);
		botaoGerarPdf.addActionListener(correntistaControlador);
		botaoMenu.addActionListener(correntistaControlador);

	}
}
