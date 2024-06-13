package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Cobra;
import repositorio.CachorroRepositorioImp;
import repositorio.CobraRepositorioImp;
import telas.TelaFormularioAlterarCachorro;
import telas.TelaFormularioAlterarCobra;

public class TelaAlterarCobraControlador implements ActionListener {
	
	JTextField caf;
	JFrame jFrameTelaAlterar;
	
	
	CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp();
	TelaFormularioAlterarCobra alterarCobra = new TelaFormularioAlterarCobra();

	
	public TelaAlterarCobraControlador(JTextField caf, JFrame framealterarCobras) {
		this.caf = caf;
		this.jFrameTelaAlterar = framealterarCobras;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		Cobra cobra = cobraRepositorioImp.buscarCobraPorCaf(caf.getText());
		
		if(cobra == null) {
			JOptionPane.showMessageDialog(null, "Não foi encontrado o seguinte caf: " + caf.getText());
		} else {
			alterarCobra.chamarTelaCadastroCobra(cobra);
		}
		
		
	}

}
