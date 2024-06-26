package controlador.ControladorCorrentistaPremium;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JTextField;

import repositorio.CorrentistaRepositorioImp;
import servicos.EntidadeService;
import telas.TelasCorrentistaPremium.TelaMenuCorrentistaPremium;

public class TelaListarCorrentistaPremiumControlador implements ActionListener{
	
	JTextField cpfTextField;
	JFrame frameListarCorrentistasPremium;

		public TelaListarCorrentistaPremiumControlador(JTextField jTextFieldcpf,JFrame frameListarCorrentistasPremium ) {
			this.cpfTextField = cpfTextField;
			this.frameListarCorrentistasPremium = frameListarCorrentistasPremium;
		}

		CorrentistaRepositorioImp correntistaRepositorioImp = new CorrentistaRepositorioImp ();
		EntidadeService entidadeService = new EntidadeService();
		TelaMenuCorrentistaPremium telaMenuCorrentistaPremium = new TelaMenuCorrentistaPremium();
		
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
			
			if(e.getActionCommand() == "MENU") {
				frameListarCorrentistasPremium.setVisible(false);
				telaMenuCorrentistaPremium.chamarTelaMenuCorrentistaPremium();
			}
			
			//if(e.getActionCommand() == "DETALHAR") {
				//entidadeService.gerarPdfDetalharA(atendenteRepositorioImplemetacao.buscaAtendentePorCpf(cpf.getText()));
			}

}
