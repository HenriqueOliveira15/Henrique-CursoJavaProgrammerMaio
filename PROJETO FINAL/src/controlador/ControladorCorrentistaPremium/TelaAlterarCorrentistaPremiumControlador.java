package controlador.ControladorCorrentistaPremium;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.CorrentistaPremium;
import repositorio.CorrentistaPremiumRepositorioImp;
import telas.TelasCorrentistaPremium.TelaFormularioAlteraCorrentistaPremium;
import telas.TelasCorrentistaPremium.TelaMenuCorrentistaPremium;

public class TelaAlterarCorrentistaPremiumControlador implements ActionListener{
	
	JFrame telaListarAlterar;
	JTextField cpf;

	TelaMenuCorrentistaPremium telaCorrentista = new TelaMenuCorrentistaPremium();
	TelaFormularioAlteraCorrentistaPremium formularioAlteraCorrentista = new TelaFormularioAlteraCorrentistaPremium();
	CorrentistaPremiumRepositorioImp correntistaRepositorioImp = new CorrentistaPremiumRepositorioImp();
	
	public TelaAlterarCorrentistaPremiumControlador(JFrame telaListarAlterar, JTextField cpf) {

		this.telaListarAlterar = telaListarAlterar;
		this.cpf = cpf;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand().equals("ALTERAR")) {
			
			System.out.println("ir para alterar");
			CorrentistaPremium correntista = correntistaRepositorioImp.buscaCorrentistaPorCpf(cpf.getText());
			
			if(correntista != null){
				formularioAlteraCorrentista.chamarTelaCadastroCorrentista(correntista);	
				telaListarAlterar.setVisible(false);
			}else {
				JOptionPane.showMessageDialog(null, "O CPF "+ cpf.getText() + " não foi Encontrado" );
			}
			
		}
		
		if(e.getActionCommand().equals("MENU")){
			System.out.println("Voltar para o menu");
			telaCorrentista.chamarTelaMenuCorrentistaPremium();
			telaListarAlterar.setVisible(false);
		
			
		}
		
	}
	
	
	
	

}
