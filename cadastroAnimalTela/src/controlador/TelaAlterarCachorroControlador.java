package controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Cachorro;
import repositorio.CachorroRepositorioImp;
import telas.TelaFormularioAlterarCachorro;

public class TelaAlterarCachorroControlador implements ActionListener {
	
	JTextField caf;
	JFrame jFrameTelaAlterar;
	
	
	CachorroRepositorioImp cachorroRepositorioImp = new CachorroRepositorioImp();
	TelaFormularioAlterarCachorro alterarCachorro = new TelaFormularioAlterarCachorro();

	
	public TelaAlterarCachorroControlador(JTextField caf, JFrame framealterarCachorros) {
		this.caf = caf;
		this.jFrameTelaAlterar = framealterarCachorros;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Cachorro cachorro = cachorroRepositorioImp.buscaCachorroPorCaf(caf.getText());
		
		if( cachorro == null) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado o seguinte caf: " + caf.getText());
		} else {
			alterarCachorro.chamarTelaCadastroCachorro(cachorro);
		}
		
	}

}
