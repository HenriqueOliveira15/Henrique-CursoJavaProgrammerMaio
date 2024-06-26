package telas.TelasCorrentistaPadrao;

import java.awt.Dimension;

import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import controlador.ControladorCorrentistaPadrao.TelaDeletarCorrentistaControlador;
import entidades.Correntista;
import entidades.CorrentistaPadrao;

public class TelaDeletarCorrentista  {
	
	public void deletarCorrentista(List<CorrentistaPadrao> list) {

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

			String nomeColunas[] = { "NOME", "CPF", "CEP", "Email" };

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

			JTextField cpfTextField = new JTextField(10);
			painelDeletarCorrentista.add(cpfTextField);
			JButton botaoMenu = new JButton("MENU");

			JButton botaoDeletar = new JButton("DELETAR");
			
			painelDeletarCorrentista.add(botaoMenu);
			painelDeletarCorrentista.add(botaoDeletar);

			frameDeletarCorrentistas.add(painelDeletarCorrentista);
			frameDeletarCorrentistas.setVisible(true);

			TelaDeletarCorrentistaControlador correntistaControlador = new TelaDeletarCorrentistaControlador(cpfTextField, frameDeletarCorrentistas);
			botaoDeletar.addActionListener(correntistaControlador);
			botaoMenu.addActionListener(correntistaControlador);

		
	}

}
