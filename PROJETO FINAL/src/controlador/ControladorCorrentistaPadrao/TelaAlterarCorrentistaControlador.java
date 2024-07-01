package controlador.ControladorCorrentistaPadrao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import entidades.CorrentistaPadrao;
import repositorio.CorrentistaRepositorioImp;
import telas.TelasCorrentistaPadrao.TelaFormularioAlteraCorrentista;
import telas.TelasCorrentistaPadrao.TelaMenuCorrentista;

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
		CorrentistaPadrao correntista = correntistaRepositorioImp.buscaCorrentistaPorCpf(cpf.getText());
		
		if( correntista == null) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado o seguinte cpf: " + cpf.getText());
		} else {
			formularioAlteraCorrentista.chamarTelaCadastroCorrentista(correntista);
		}
		
		
		if(e.getActionCommand().equals("MENU")){
			System.out.println("Voltar para o menu");
			telaCorrentista.chamarTelaMenuCorrentista();
			telaListarAlterar.setVisible(false);
		
			
		}
		
	}

	}

