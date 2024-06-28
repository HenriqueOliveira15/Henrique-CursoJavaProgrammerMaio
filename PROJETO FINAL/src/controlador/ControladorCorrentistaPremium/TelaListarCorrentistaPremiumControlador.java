package controlador.ControladorCorrentistaPremium;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;

import entidades.CorrentistaPremium;
import repositorio.CorrentistaPremiumRepositorioImp;
import servicos.EntidadeService;
import telas.TelasCorrentistaPremium.TelaMenuCorrentistaPremium;

public class TelaListarCorrentistaPremiumControlador implements ActionListener{
	
	JTextField cpfTextField;
	JFrame frameListarCorrentistasPremium;

		public TelaListarCorrentistaPremiumControlador(JTextField cpfTextField,JFrame frameListarCorrentistasPremium ) {
			this.cpfTextField = cpfTextField;
			this.frameListarCorrentistasPremium = frameListarCorrentistasPremium;
		}

		CorrentistaPremiumRepositorioImp correntistaPremiumRepositorioImp = new CorrentistaPremiumRepositorioImp ();
		EntidadeService entidadeService = new EntidadeService();
		TelaMenuCorrentistaPremium telaMenuCorrentistaPremium = new TelaMenuCorrentistaPremium();
		
		
		

		@Override
		public void actionPerformed(ActionEvent e) {
			CorrentistaPremium correntista = correntistaPremiumRepositorioImp.buscaCorrentistaPorCpf(cpfTextField.getText());
			entidadeService.gerarPdfDetalharCorrentistaPremium(correntista);
			System.out.println("PDF gerado");
		}

}