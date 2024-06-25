package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import repositorio.CorrentistaRepositorioImp;
import telas.TelaCadastroCorrentista;
import telas.TelaDeletarCorrentista;
import telas.TelaListarCorrentista;
import telas.TelaMenuCorrentista;

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
	
	
	//TelaListarCorrentista telaListarCorrentista = new TelaListarCorrentista();
	//TelaDeletarCachorro telaDeletarCachorro = new TelaDeletarCachorro();
	//TelaAlterarCachorro telaAlterarCachorro = new TelaAlterarCachorro();
	//TelaMenuInicial telaMenuInicial = new TelaMenuInicial();
	
	
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
				System.out.println("Listando os cachorros cadastrados");
				frameTelaMenuCorrentista.setVisible(false);
				break;

			case "3":
				telaDeletarCorrentista.deletarCorrentista(correntistaRepositorioImp.listarCorrentistaRepositorio());
				System.out.println("Direcione para deletar cachorro");
				frameTelaMenuCorrentista.setVisible(false);
				break;
				
			/* case "4": {
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
				*/
			
			}
			
			} else {
				JOptionPane.showMessageDialog(null, "Opção inválida");
			}
		
	}

}
