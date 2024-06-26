package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import entidades.CorrentistaPadrao;
import repositorio.CorrentistaRepositorioImp;
import telas.TelaFormularioAlteraCorrentista;
import telas.TelaMenuCorrentista;

public class TelaAlterarCorrentistaControlador implements ActionListener {

	JFrame telaListarAlterar;
	JTextField cpf;

	public TelaAlterarCorrentistaControlador(JFrame telaListarAlterar, JTextField cpf) {
		
		this.telaListarAlterar = telaListarAlterar;
		this.cpf = cpf;
	}

	TelaMenuCorrentista telaCorrentista = new TelaMenuCorrentista();
	TelaFormularioAlteraCorrentista formularioAlteraCorrentista = new TelaFormularioAlteraCorrentista();
	CorrentistaRepositorioImp correntistaRepositorioImp = new CorrentistaRepositorioImp();


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("ALTERAR")) {
			
			System.out.println("ir para alterar");
			CorrentistaPadrao correntista = correntistaRepositorioImp.buscaCorrentistaPorCpf(cpf.getText());
			
			if(correntista != null){
				formularioAlteraCorrentista.chamarTelaCadastroCorrentista(correntista);	
				telaListarAlterar.setVisible(false);
			}else {
				JOptionPane.showMessageDialog(null, "O CPF "+ cpf.getText() + " não foi Encontrado" );
			}
			
		}
		
		if(e.getActionCommand().equals("MENU")){
			System.out.println("Voltar para o menu");
			telaCorrentista.chamarTelaMenuCorrentista();
			telaListarAlterar.setVisible(false);
		
			
		}
		
	}

	}

