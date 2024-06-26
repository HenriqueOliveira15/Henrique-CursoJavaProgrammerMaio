package controlador.ControladorCorrentistaPadrao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;
import entidades.Correntista;
import repositorio.CorrentistaRepositorioImp;
import servicos.EntidadeService;
import telas.TelasCorrentistaPadrao.TelaMenuCorrentista;

public class TelaListarCorrentistaControlador implements ActionListener {
	
	
JTextField cpfTextField;
JFrame frameListarCorrentistas;

	public TelaListarCorrentistaControlador(JTextField jTextFieldcpf,JFrame frameListarCorrentistas ) {
		this.cpfTextField = cpfTextField;
		this.frameListarCorrentistas = frameListarCorrentistas;
	}

	CorrentistaRepositorioImp correntistaRepositorioImp = new CorrentistaRepositorioImp ();
	EntidadeService entidadeService = new EntidadeService();
	
	TelaMenuCorrentista telaMenuCorrentista = new TelaMenuCorrentista();
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand() == "MENU") {
			frameListarCorrentistas.setVisible(false);
			telaMenuCorrentista.chamarTelaMenuCorrentista();
		}
		
		//if(e.getActionCommand() == "DETALHAR") {
			//entidadeService.gerarPdfDetalharA(atendenteRepositorioImplemetacao.buscaAtendentePorCpf(cpf.getText()));
		}
		
	}


