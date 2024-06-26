package controlador.ControladorCorrentistaPadrao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import repositorio.CorrentistaRepositorioImp;
import telas.TelasCorrentistaPadrao.TelaAlterarCorrentista;
import telas.TelasCorrentistaPadrao.TelaCadastroCorrentista;
import telas.TelasCorrentistaPadrao.TelaDeletarCorrentista;
import telas.TelasCorrentistaPadrao.TelaListarCorrentista;
import telas.TelasCorrentistaPadrao.TelaMenuCorrentista;
import telas.TelasCorrentistaPadrao.TelaMenuInicial;

public class TelaMenuCorrentistaControlador implements ActionListener {
	
	JTextField opcaoRecebida;
	JFrame frameTelaMenuCorrentista;
	
	

	public TelaMenuCorrentistaControlador(JTextField opcaoRecebida, JFrame frameTelaMenuCorrentista) {
		this.opcaoRecebida = opcaoRecebida;
		this.frameTelaMenuCorrentista = frameTelaMenuCorrentista;
	}


	TelaMenuCorrentista telaMenuCorrentista = new TelaMenuCorrentista();
	TelaListarCorrentista telaListarCorrentista = new TelaListarCorrentista();
	TelaDeletarCorrentista telaDeletarCorrentista = new TelaDeletarCorrentista();
	TelaMenuInicial telaMenuInicial = new TelaMenuInicial();
	TelaAlterarCorrentista telaAlterarCorrentista = new TelaAlterarCorrentista();
	
	CorrentistaRepositorioImp correntistaRepositorioImp = new CorrentistaRepositorioImp();
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (opcaoRecebida.getText().equals("1") || opcaoRecebida.getText().equals("2") || opcaoRecebida.getText().equals("3") || opcaoRecebida.getText().equals("4") || opcaoRecebida.getText().equals("5")){
			switch (opcaoRecebida.getText()) {
			case "1":
				TelaCadastroCorrentista.chamartelaCadastroCorrentista();
				System.out.println("Direcione para a tela do cadastro do correntista");
				frameTelaMenuCorrentista.setVisible(false);
				break;

			 case "2":
				telaListarCorrentista.listarCorrentista(correntistaRepositorioImp.listarCorrentistaRepositorio());;
				System.out.println("Listando os correntistas");
				frameTelaMenuCorrentista.setVisible(false);
				break;

			case "3":
				telaDeletarCorrentista.deletarCorrentista(correntistaRepositorioImp.listarCorrentistaRepositorio());
				System.out.println("Direcione para deletar cachorro");
				frameTelaMenuCorrentista.setVisible(false);
				break;
				
			 case "4": {
				telaAlterarCorrentista.alterarCorrentista(correntistaRepositorioImp.listarCorrentistaRepositorio());
				System.out.println("Direcione para alterar correntista");
				frameTelaMenuCorrentista.setVisible(false);
				break;
				}
			
			
			case "5": {
				telaMenuInicial.chamarTelaMenuInicial();
				System.out.println("Direcione para tela menu inicial");
				frameTelaMenuCorrentista.setVisible(false);
				break;
				}
			
			}
			
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		
	}

}
