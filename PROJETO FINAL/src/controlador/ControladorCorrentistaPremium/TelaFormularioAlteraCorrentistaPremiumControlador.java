package controlador.ControladorCorrentistaPremium;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.CorrentistaPadrao;
import entidades.CorrentistaPremium;
import repositorio.CorrentistaPremiumRepositorioImp;
import telas.TelasCorrentistaPremium.TelaMenuCorrentistaPremium;

public class TelaFormularioAlteraCorrentistaPremiumControlador implements ActionListener{
	
	JFrame frameTelaAlterarCorrentistaPremium;
	JTextField nome;
	JTextField email;
	String cpf;
	

	public TelaFormularioAlteraCorrentistaPremiumControlador(JFrame frameTelaAlterarCorrentistaPremium, JTextField nome,
			JTextField email, String cpf) {
		this.frameTelaAlterarCorrentistaPremium = frameTelaAlterarCorrentistaPremium;
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
	}
	
	CorrentistaPremiumRepositorioImp correntistaPremiumRepositorioImp = new CorrentistaPremiumRepositorioImp();
	TelaMenuCorrentistaPremium telaMenu = new TelaMenuCorrentistaPremium();


	@Override
	public void actionPerformed(ActionEvent e) {
		alterarCorrentistaPremiumRepositorio();	
	}
	
	private void alterarCorrentistaPremiumRepositorio() {
		CorrentistaPremium correntista = new CorrentistaPremium();
		correntista.setCpf(cpf);
		correntista.setNome(nome.getText());
		correntista.setEmail(email.getText());
		
		
		if(correntistaPremiumRepositorioImp.alterarCorrentistaPremiumRepositorio(correntista)) {
			JOptionPane.showMessageDialog(null, "O correntista " + correntista.getNome() + " foi Alterado");
			frameTelaAlterarCorrentistaPremium.setVisible(false);
			telaMenu.chamarTelaMenuCorrentistaPremium();
		}else {
			JOptionPane.showMessageDialog(null, "O correntista " + correntista.getNome() + " não Foi Alterado");
		}
		
		
		
	}

}
