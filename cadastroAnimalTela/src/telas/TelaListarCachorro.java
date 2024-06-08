package telas;

import java.util.List;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import entidades.Cachorro;

public class TelaListarCachorro {

		public void listarCachorro(List<Cachorro> listacachorros) {
			
			int quantidadeDeLinhas = listacachorros.size();
			
			String[][] tabelaString = new String [quantidadeDeLinhas][3];
			
			int posicaoColuna = 0;
			int posicaoLinha = 0;
			
			for(Cachorro cachorro : listacachorros) {
				
				tabelaString[posicaoLinha][posicaoColuna] = cachorro.getNome();
				posicaoColuna ++;
				
				tabelaString [posicaoLinha][posicaoColuna] = cachorro.getCaf();
				
				posicaoColuna ++;
				tabelaString [posicaoLinha][posicaoColuna] = cachorro.getCorPelo();
				
				posicaoLinha ++;
				posicaoColuna = 0;
				
				
			}
			
			String nomeColunas [] = {"NOME", "CAF", "COR PELO"};
			
			
			JFrame frameListarCachorros = new JFrame();
			
			frameListarCachorros.setSize(500,600);
			
			JTable tabelaCachorros = new JTable(tabelaString, nomeColunas);
			
			tabelaCachorros.setBounds(30, 40, 300, 300);
			
			JScrollPane scrollPaineListarCachorro = new JScrollPane(tabelaCachorros);
			
			JPanel painelListarCachorro = new JPanel();
			
			painelListarCachorro.add(scrollPaineListarCachorro);
			
			frameListarCachorros.add(painelListarCachorro);
			frameListarCachorros.setVisible(true);
			
		}

	}
