package controlador.ControladorCorrentistaPremium;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import repositorio.CorrentistaPremiumRepositorioImp;
import telas.TelasCorrentistaPadrao.TelaCadastroCorrentista;
import telas.TelasCorrentistaPadrao.TelaMenuInicial;
import telas.TelasCorrentistaPremium.TelaCadastroCorrentistaPremium;
import telas.TelasCorrentistaPremium.TelaDeletarCorrentistaPremium;
import telas.TelasCorrentistaPremium.TelaListarCorrentistaPremium;
import telas.TelasCorrentistaPremium.TelaMenuCorrentistaPremium;

public class TelaMenuCorrentistaPremiumControlador implements ActionListener {

	JTextField opcaoRecebida;
	JFrame frameTelaMenuCorrentistaPremium;

	public TelaMenuCorrentistaPremiumControlador(JTextField opcaoRecebida, JFrame frameTelaMenuCorrentistaPremium) {
		this.opcaoRecebida = opcaoRecebida;
		this.frameTelaMenuCorrentistaPremium = frameTelaMenuCorrentistaPremium;
	}

	TelaMenuInicial telaMenuInicial = new TelaMenuInicial();
	TelaMenuCorrentistaPremium telaMenuCorrentistaPremium = new TelaMenuCorrentistaPremium();
	TelaListarCorrentistaPremium telaListarCorrentistaPremium = new TelaListarCorrentistaPremium();
	CorrentistaPremiumRepositorioImp correntistaPremiumRepositorioImp = new CorrentistaPremiumRepositorioImp();
	TelaDeletarCorrentistaPremium telaDeletarCorrentistaPremium = new TelaDeletarCorrentistaPremium();
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (opcaoRecebida.getText().equals("1") || opcaoRecebida.getText().equals("2")
				|| opcaoRecebida.getText().equals("3") || opcaoRecebida.getText().equals("4")
				|| opcaoRecebida.getText().equals("5")) {
			switch (opcaoRecebida.getText()) {
			case "1":
				TelaCadastroCorrentistaPremium.chamartelaCadastroCorrentistaPremium();
				System.out.println("Direcione para a tela do cadastro do correntista");
				frameTelaMenuCorrentistaPremium.setVisible(false);
				break;

			case "2":
				telaListarCorrentistaPremium.listarCorrentista(correntistaPremiumRepositorioImp.listarCorrentistaPremiumRepositorio());
				System.out.println("Listando os correntistas");
				frameTelaMenuCorrentistaPremium.setVisible(false);
				break;

			case "3":
				telaDeletarCorrentistaPremium.deletarCorrentistaPremium(correntistaPremiumRepositorioImp.listarCorrentistaPremiumRepositorio());
				System.out.println("Direcione para deletar Correntista");
				frameTelaMenuCorrentistaPremium.setVisible(false);
				break;
			}
		}
	}
}
/*
 
 * case "4": {
 * telaAlterarCorrentista.alterarCorrentista(correntistaRepositorioImp.
 * listarCorrentistaRepositorio());
 * System.out.println("Direcione para alterar correntista");
 * frameTelaMenuCorrentista.setVisible(false); break; }
 * 
 * 
 * case "5": { telaMenuInicial.chamarTelaMenuInicial();
 * System.out.println("Direcione para tela menu inicial");
 * frameTelaMenuCorrentista.setVisible(false); break; }
 * 
 * }
 * 
 * } else { JOptionPane.showMessageDialog(null, "Opção inválida"); }
 */
