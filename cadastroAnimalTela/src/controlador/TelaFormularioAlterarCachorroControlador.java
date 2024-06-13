package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import entidades.Cachorro;
import repositorio.CachorroRepositorioImp;
import telas.TelaMenuCachorro;

public class TelaFormularioAlterarCachorroControlador implements ActionListener {

	JTextField caixaTextoPrimeiroCampoRecebidoNome;
	String caixaTextoSegundoCampoRecebidoCaf;
	JTextField caixaTextoTerceiroCampoRecebidoCorPelo;
	JFrame frameTelaAlterarCachorro;

	public TelaFormularioAlterarCachorroControlador(JTextField caixaTextoPrimeiroCampoRecebidoNome,
			String caixaTextoSegundoCampoRecebidoCaf, JTextField caixaTextoTerceiroCampoRecebidoCorPelo,
			JFrame frameTelaAlterarCachorro) {
		this.caixaTextoPrimeiroCampoRecebidoNome = caixaTextoPrimeiroCampoRecebidoNome;
		this.caixaTextoSegundoCampoRecebidoCaf = caixaTextoSegundoCampoRecebidoCaf;
		this.caixaTextoTerceiroCampoRecebidoCorPelo = caixaTextoTerceiroCampoRecebidoCorPelo;
		this.frameTelaAlterarCachorro = frameTelaAlterarCachorro;
	}

	CachorroRepositorioImp cachorroRepositorioImp = new CachorroRepositorioImp();
	TelaMenuCachorro telaMenuCachorro = new TelaMenuCachorro();

	@Override
	public void actionPerformed(ActionEvent e) {
		alterarCachorroNoBanco();

	}

	private void alterarCachorroNoBanco() {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome(caixaTextoPrimeiroCampoRecebidoNome.getText());
		cachorro.setCaf(caixaTextoSegundoCampoRecebidoCaf);
		cachorro.setCorPelo(caixaTextoTerceiroCampoRecebidoCorPelo.getText());

		if (cachorroRepositorioImp.alterarCachorroRepositorio(cachorro)) {
			JOptionPane.showMessageDialog(null, "Alterou Com Sucesso");
			frameTelaAlterarCachorro.setVisible(false);
			telaMenuCachorro.chamarTelaMenuCachorro();
		} else {
			JOptionPane.showMessageDialog(null, "Não foi possível alterar");
		}

	}

}
