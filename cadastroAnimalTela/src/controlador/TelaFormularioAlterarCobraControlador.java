package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Cobra;
import repositorio.CobraRepositorioImp;
import telas.TelaMenuCobra;

public class TelaFormularioAlterarCobraControlador implements ActionListener {

	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	String caixaTextoSegundoCampoRecebidoCaf;
	JTextField caixaTextoTerceiroCampoRecebidoTipoVeneno;
	JFrame frameTelaAlterarCobra;

	public TelaFormularioAlterarCobraControlador(JTextField caixaTextoPrimeiroCampoRecebidoNome,
			String caixaTextoSegundoCampoRecebidoCaf, JTextField caixaTextoTerceiroCampoRecebidoTipoVeneno,
			JFrame frameTelaAlterarCobra) {
		this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
		this.caixaTextoSegundoCampoRecebidoCaf = caixaTextoSegundoCampoRecebidoCaf;
		this.caixaTextoTerceiroCampoRecebidoTipoVeneno = caixaTextoTerceiroCampoRecebidoTipoVeneno;
		this.frameTelaAlterarCobra = frameTelaAlterarCobra;
	}

	CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp();
	TelaMenuCobra telaMenuCobra = new TelaMenuCobra();

	@Override
	public void actionPerformed(ActionEvent e) {
		alterarCobraNoBanco();
		
}
	public void alterarCobraNoBanco() {
		
		Cobra cobra = new Cobra();
		cobra.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		cobra.setCaf(caixaTextoSegundoCampoRecebidoCaf);
		cobra.setTipoVeneno(caixaTextoTerceiroCampoRecebidoTipoVeneno.getText());
		
		if(cobraRepositorioImp.alterarCobraRepositorio(cobra)) {
			JOptionPane.showMessageDialog(null, "Alterou Com Sucesso");
			frameTelaAlterarCobra.setVisible(false);
			TelaMenuCobra.chamarTelaMenuCobra();
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possível alterar");
		}

	}

}
