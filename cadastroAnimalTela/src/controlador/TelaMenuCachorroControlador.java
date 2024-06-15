package controlador;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;
import java.util.List;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Cachorro;
import persistencia.DaoCachorro;
import repositorio.CachorroRepositorioImp;
import telas.TelaAlterarCachorro;
import telas.TelaCadastroCachorro;
import telas.TelaDeletarCachorro;
import telas.TelaListarCachorro;
import telas.TelaMenuCachorro;
import telas.TelaMenuInicial;

public class TelaMenuCachorroControlador implements ActionListener {

	JTextField opcaoRecebida;
	JFrame frameTelaMenuCachorro;

	TelaMenuCachorro telaMenuCachorro = new TelaMenuCachorro();
	TelaListarCachorro telaListarCachorro = new TelaListarCachorro();
	TelaDeletarCachorro telaDeletarCachorro = new TelaDeletarCachorro();
	TelaAlterarCachorro telaAlterarCachorro = new TelaAlterarCachorro();
	TelaMenuInicial telaMenuInicial = new TelaMenuInicial();

	CachorroRepositorioImp cachorroRepositorio = new CachorroRepositorioImp();

	DaoCachorro daoCachorro = new DaoCachorro();

	public TelaMenuCachorroControlador(JTextField opcaoRecebida, JFrame frameTelaMenuCachorro) {
		this.opcaoRecebida = opcaoRecebida;
		this.frameTelaMenuCachorro = frameTelaMenuCachorro;
	}


	@Override
	public void actionPerformed(ActionEvent e) {

		if (opcaoRecebida.getText().equals("1") || opcaoRecebida.getText().equals("2") || opcaoRecebida.getText().equals("3") || opcaoRecebida.getText().equals("4") || opcaoRecebida.getText().equals("5")){
			switch (opcaoRecebida.getText()) {
			case "1":
				TelaCadastroCachorro.chamartelaCadastroCachorro();
				System.out.println("Direcione para a tela do cachorro");
				frameTelaMenuCachorro.setVisible(false);
				break;

			case "2":
				telaListarCachorro.listarCachorro(daoCachorro.retornaListaCachorro());;
				System.out.println("Listando os cachorros cadastrados");
				frameTelaMenuCachorro.setVisible(false);
				break;

			case "3":
				telaDeletarCachorro.chamarTelaDeletarCachorro(cachorroRepositorio.listarCachorroRepositorio());
				System.out.println("Direcione para deletar cachorro");
				frameTelaMenuCachorro.setVisible(false);
				break;
				
			case "4": {
				telaAlterarCachorro.chamarTelaAlterarCachorro(cachorroRepositorio.listarCachorroRepositorio());
				System.out.println("Direcione para alterar cachorro");
				frameTelaMenuCachorro.setVisible(false);
				break;
				}
			
			case "5": {
				telaMenuInicial.chamarTelaMenuIniciar();
				System.out.println("Direcione para alterar cachorro");
				frameTelaMenuCachorro.setVisible(false);
				break;
				}
			
			}
			
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		
}

	public void imprimirCachorro(List<Cachorro> listaCachorro) {

		StringBuilder impressaoCachorro = new StringBuilder();

		for (Cachorro cachorroLista : listaCachorro) {
			impressaoCachorro.append("Nome: ").append(cachorroLista.getNome()).append("\n").append("Caf: ")
					.append(cachorroLista.getCaf()).append("\n").append("Cor Pelo: ").append(cachorroLista.getCorPelo())
					.append("\n");

		}

		JOptionPane.showMessageDialog(null, impressaoCachorro.toString());

	}

}
