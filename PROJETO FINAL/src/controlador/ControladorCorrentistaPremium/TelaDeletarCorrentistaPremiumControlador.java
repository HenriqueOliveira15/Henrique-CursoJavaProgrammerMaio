package controlador.ControladorCorrentistaPremium;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import repositorio.CorrentistaPremiumRepositorioImp;
import repositorio.CorrentistaRepositorioImp;
import telas.TelasCorrentistaPadrao.TelaMenuCorrentista;
import telas.TelasCorrentistaPremium.TelaMenuCorrentistaPremium;

public class TelaDeletarCorrentistaPremiumControlador implements ActionListener {

	JFrame frameDeletarCorrentistas;
	JTextField cpf;
	
	public TelaDeletarCorrentistaPremiumControlador(JTextField cpf, JFrame frameDeletarCorrentistas) {
		this.frameDeletarCorrentistas = frameDeletarCorrentistas;
		this.cpf = cpf;
	}

	
	CorrentistaPremiumRepositorioImp correntistaRepositorioImp = new CorrentistaPremiumRepositorioImp();
	TelaMenuCorrentistaPremium telaMenuCorrentistaPremium = new TelaMenuCorrentistaPremium();


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getActionCommand().equals("DELETAR")) {
			if(correntistaRepositorioImp.excluirCorrentistaPremiumRepositorio(cpf.getText())) {
				JOptionPane.showMessageDialog(null, "Correntista Deletado!!");
				frameDeletarCorrentistas.setVisible(false);
				telaMenuCorrentistaPremium.chamarTelaMenuCorrentistaPremium();
			}
		}
		if(e.getActionCommand().equals("MENU")) {
			frameDeletarCorrentistas.setVisible(false);
			telaMenuCorrentistaPremium.chamarTelaMenuCorrentistaPremium();
		}
		
	}
		
		
	}

