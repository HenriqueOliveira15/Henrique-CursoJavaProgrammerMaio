package controlador;

import java.awt.TextField;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import repositorio.CachorroRepositorioImp;
import telas.TelaDeletarCachorro;
import telas.TelaMenuCachorro;

public class TelaDeletarCachorroControlador implements ActionListener{
	
	TextField cafRecebido;
	JFrame frameDeletar;
	CachorroRepositorioImp cachorroRepositorioImp = new CachorroRepositorioImp();
	
	TelaMenuCachorro telaMenuCachorro = new TelaMenuCachorro();
	TelaDeletarCachorro telaDeletarCachorro = new TelaDeletarCachorro();
	
	public TelaDeletarCachorroControlador(TextField cafRecebido, JFrame frameDeletar) {
		this.cafRecebido = cafRecebido;
		this.frameDeletar = frameDeletar;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(cachorroRepositorioImp.excluirCachorroRepositorio(cafRecebido.getText())) {
			JOptionPane.showMessageDialog(null, "O cachorro de caf " +cafRecebido.getText()+ " Foi deletado");
			frameDeletar.setVisible(false);
			telaDeletarCachorro.chamarTelaDeletarCachorro(null);
		}else {
			JOptionPane.showMessageDialog(null, "O Cachorro de caf " +cafRecebido.getText()+ " Não foi deletado");
		}
		
	}

}
