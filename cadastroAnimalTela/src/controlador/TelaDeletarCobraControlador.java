package controlador;

import java.awt.TextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import repositorio.CobraRepositorioImp;
import telas.TelaDeletarCobra;
import telas.TelaMenuCobra;


public class TelaDeletarCobraControlador implements ActionListener{
	
	TextField cafRecebido;
	JFrame frameDeletar;
	CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp();
	
	TelaMenuCobra telaMenuCobra = new TelaMenuCobra();
	TelaDeletarCobra telaDeletarCobra = new TelaDeletarCobra();
	
	public TelaDeletarCobraControlador(TextField cafRecebido, JFrame frameDeletar) {
		this.cafRecebido = cafRecebido;
		this.frameDeletar = frameDeletar;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(cobraRepositorioImp.excluirCobraRepositorio(cafRecebido.getText())) {
			JOptionPane.showMessageDialog(null, "A cobra de caf " +cafRecebido.getText()+ " Foi deletado");
			frameDeletar.setVisible(false);
			telaDeletarCobra.chamarTelaDeletarCobra(null);
		}else {
			JOptionPane.showMessageDialog(null, "A Cobra de caf " +cafRecebido.getText()+ " Não foi deletado");
		}
		
		
		
	}

}
