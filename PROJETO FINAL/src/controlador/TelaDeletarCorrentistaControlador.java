package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import repositorio.CorrentistaRepositorioImp;
import telas.TelaMenuCorrentista;

public class TelaDeletarCorrentistaControlador implements ActionListener {
	
	
	JFrame frameDeletarCorrentistas;
	JTextField cpf;
	
	public TelaDeletarCorrentistaControlador(JFrame frameDeletarCorrentistas, JTextField cpf) {
		this.frameDeletarCorrentistas = frameDeletarCorrentistas;
		this.cpf = cpf;
	}

	
	CorrentistaRepositorioImp correntistaRepositorioImp = new CorrentistaRepositorioImp();
	
	TelaMenuCorrentista telaMenuCorrentista = new TelaMenuCorrentista();


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("DELETAR")) {
			if(correntistaRepositorioImp.excluirCorrentistaRepositorio(cpf.getText())) {
				JOptionPane.showMessageDialog(null, "Atendente Deletado!!");
				frameDeletarCorrentistas.setVisible(false);
				telaMenuCorrentista.chamarTelaMenuCorrentista();
			}
		}
		if(e.getActionCommand().equals("MENU")) {
			frameDeletarCorrentistas.setVisible(false);
			telaMenuCorrentista.chamarTelaMenuCorrentista();
		}
		
	}

}