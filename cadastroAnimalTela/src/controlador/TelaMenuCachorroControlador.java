package controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Cachorro;
import persistencia.DaoCachorro;
import telas.TelaCadastroCachorro;
import telas.TelaListarCachorro;

public class TelaMenuCachorroControlador implements ActionListener {

	JTextField opcaoRecebida;
	JFrame frameTelaMenuCachorro;
	
	TelaListarCachorro telaListarCachorro = new TelaListarCachorro();
	
	

	public TelaMenuCachorroControlador(JTextField opcaoRecebida, JFrame frameTelaMenuCachorro) {
		this.opcaoRecebida = opcaoRecebida;
		this.frameTelaMenuCachorro = frameTelaMenuCachorro;
	}
	
	DaoCachorro daoCachorro = new DaoCachorro();

	@Override
	public void actionPerformed(ActionEvent e) {

		if (opcaoRecebida.getText().equals("1") || opcaoRecebida.getText().equals("2")) {
			switch (opcaoRecebida.getText()) {
			case "1":
				TelaCadastroCachorro.chamartelaCadastroCachorro();
				System.out.println("Direcione para a tela do cachorro");
				frameTelaMenuCachorro.setVisible(false);
				break;

			case "2":
				telaListarCachorro.listarCachorro(daoCachorro.retornaListaCachorro());;
				System.out.println("Listando os cachorros cadastrados");
				break;

			case "3":
				System.exit(0);
				break;

			}
		} else {
			JOptionPane.showMessageDialog(null, "A opção " + opcaoRecebida.getText() + " não é válida");
		}
	}
	
	public void imprimirCachorro(List<Cachorro> listaCachorro) {

		StringBuilder impressaoCachorro = new StringBuilder();

		for(Cachorro cachorroLista : listaCachorro) {
			impressaoCachorro.append("Nome: ").append(cachorroLista.getNome()).append("\n")
								.append("Caf: ").append(cachorroLista.getCaf()).append("\n")
								.append("Cor Pelo: ").append(cachorroLista.getCorPelo()).append("\n");
								


		}


		JOptionPane.showMessageDialog(null, impressaoCachorro.toString());

	}
	

}
