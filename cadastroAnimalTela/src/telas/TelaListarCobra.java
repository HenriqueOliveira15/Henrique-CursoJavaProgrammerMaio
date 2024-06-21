package telas;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.TelaListarCobraControlador;
import entidades.Cobra;

public class TelaListarCobra {
	
	
	public void listarCobra(List<Cobra> listacobras) {
		
		int quantidadeDeLinhas = listacobras.size();
		
		String[][] tabelaString = new String [quantidadeDeLinhas][3];
		
		int posicaoColuna = 0;
		int posicaoLinha = 0;
		
		for(Cobra cobra : listacobras) {
			
			tabelaString[posicaoLinha][posicaoColuna] = cobra.getNome();
			posicaoColuna ++;
			
			tabelaString [posicaoLinha][posicaoColuna] = cobra.getCaf();
			
			posicaoColuna ++;
			tabelaString [posicaoLinha][posicaoColuna] = cobra.getTipoVeneno();
			
			posicaoLinha ++;
			posicaoColuna = 0;
			
			
		}
		
		String nomeColunas [] = {"NOME", "CAF", "TIPO VENENO"};
		
		
		JFrame frameListarCobras = new JFrame();
		
		frameListarCobras.setSize(500,600);
		
		JTable tabelaCobras = new JTable(tabelaString, nomeColunas);
		tabelaCobras.setSize(1000,1000);
		tabelaCobras.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPainelListarCobra = new JScrollPane(tabelaCobras);
		scrollPainelListarCobra.setPreferredSize(new Dimension(400, 160));
		
		JPanel painelListarCobra = new JPanel();
		painelListarCobra.setSize(1000, 1000);
		painelListarCobra.add(scrollPainelListarCobra);
		
		JTextField caf = new JTextField(10);
		painelListarCobra.add(caf);
		
		JButton botaoGerarPdf = new JButton("Gerar PDF");
		JTextField cafTextField = new JTextField(10);
	
		painelListarCobra.add(botaoGerarPdf);
		
		frameListarCobras.add(painelListarCobra);
		frameListarCobras.setVisible(true);
		
		TelaListarCobraControlador cobraControlador = new TelaListarCobraControlador(caf);
		botaoGerarPdf.addActionListener(cobraControlador);
		
	}

}
