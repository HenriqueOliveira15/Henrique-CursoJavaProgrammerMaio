package telas;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
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
		
		tabelaCobras.setBounds(30, 40, 300, 300);
		
		JScrollPane scrollPainelListarCobra = new JScrollPane(tabelaCobras);
		
		JPanel painelListarCobra = new JPanel();
		
		painelListarCobra.add(scrollPainelListarCobra);
		
		frameListarCobras.add(painelListarCobra);
		frameListarCobras.setVisible(true);
		
	}

}
