package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import entidades.CorrentistaPadrao;
import entidades.Endereco;
import repositorio.CorrentistaRepositorioImp;
import telas.TelaMenuCorrentista;

public class TelaFormularioAlteraCorrentistaControlador implements ActionListener {
	
	JFrame telaListarAlterar;
	JTextField nome;
	JTextField cep;
	String cpf;
	
	
	public TelaFormularioAlteraCorrentistaControlador(JFrame frameTelaCadastroCorrentista, JTextField nome, JTextField cep,
			String cpf) {
		this.nome = nome;
		this.cep = cep;
		this.cpf = cpf;
	}
	
	CorrentistaRepositorioImp correntistaRepositorioImp = new CorrentistaRepositorioImp();
	TelaMenuCorrentista telaCorrentista = new TelaMenuCorrentista();
	Endereco endereco = new Endereco();

	@Override
	public void actionPerformed(ActionEvent e) {
		alterarCorrentista();
		
	}

	private void alterarCorrentista() {
		CorrentistaPadrao correntista = new CorrentistaPadrao();
		correntista.setCpf(cpf);
		correntista.setNome(nome.getText());
		correntista.setEndereco(endereco);
		endereco.setCep(cep.getText());
		
		
		if(correntistaRepositorioImp.alterarCorrentistaRepositorio(correntista, cpf)) {
			JOptionPane.showMessageDialog(null, "O correntista " + correntista.getNome() + " foi Alterado");
			telaListarAlterar.setVisible(false);
			telaCorrentista.chamarTelaMenuCorrentista();
		}else {
			JOptionPane.showMessageDialog(null, "O correntista " + correntista.getNome() + " não Foi Alterado");
		}
		
		
		
	}

}