package telas;

import java.awt.Dimension;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

import controlador.TelaListarCachorroControlador;
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
			tabelaCachorros.setSize(1000,1000);
			tabelaCachorros.setBounds(30, 40, 300, 300);
			
			JScrollPane scrollPaineListarCachorro = new JScrollPane(tabelaCachorros);
			scrollPaineListarCachorro.setPreferredSize(new Dimension(400, 160));
			
			JPanel painelListarCachorro = new JPanel();
			painelListarCachorro.setSize(1000, 1000);
			painelListarCachorro.add(scrollPaineListarCachorro);
			
			JTextField caf = new JTextField(10);
			painelListarCachorro.add(caf);
			
			JButton botaoGerarPdf = new JButton("Gerar PDF");
			JTextField cafTextField = new JTextField(10);
		
			painelListarCachorro.add(botaoGerarPdf);
			
			frameListarCachorros.add(painelListarCachorro);
			frameListarCachorros.setVisible(true);
			
			TelaListarCachorroControlador cachorroControlador = new TelaListarCachorroControlador(caf);
			botaoGerarPdf.addActionListener(cachorroControlador);
					
			
		}

	}
