package controlador.ControladorCorrentistaPadrao;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import entidades.CorrentistaPadrao;
import repositorio.CorrentistaRepositorioImp;
import telas.TelasCorrentistaPadrao.TelaMenuCorrentista;

public class TelaFormularioAlteraCorrentistaControlador implements ActionListener {
	
	JFrame frameTelaAlterarCorrentista;
	JTextField nome;
	JTextField email;
	String cpf;
	
	
	public TelaFormularioAlteraCorrentistaControlador(JFrame frameTelaAlterarCorrentista, JTextField nome, JTextField email,
			String cpf) {
		this.nome = nome;
		this.email = email;
		this.cpf = cpf;
		this.frameTelaAlterarCorrentista = frameTelaAlterarCorrentista;
	}
	
	CorrentistaRepositorioImp correntistaRepositorioImp = new CorrentistaRepositorioImp();
	TelaMenuCorrentista telaCorrentista = new TelaMenuCorrentista();

	@Override
	public void actionPerformed(ActionEvent e) {
		alterarCorrentistaRepositorio();
		
	}

	private void alterarCorrentistaRepositorio() {
		CorrentistaPadrao correntista = new CorrentistaPadrao();
		correntista.setCpf(cpf);
		correntista.setNome(nome.getText());
		correntista.setEmail(email.getText());
		
		
		if(correntistaRepositorioImp.alterarCorrentistaRepositorio(correntista)) {
			JOptionPane.showMessageDialog(null, "O correntista " + correntista.getNome() + " foi Alterado");
			frameTelaAlterarCorrentista.setVisible(false);
			telaCorrentista.chamarTelaMenuCorrentista();
		}else {
			JOptionPane.showMessageDialog(null, "O correntista " + correntista.getNome() + " não Foi Alterado");
		}
		
		
		
	}

}