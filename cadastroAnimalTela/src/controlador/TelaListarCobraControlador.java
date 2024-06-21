package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;

import entidades.Cobra;
import repositorio.CobraRepositorioImp;
import servicos.EntidadeService;

public class TelaListarCobraControlador implements ActionListener{
	
	JTextField jTextFieldcaf;
	

	public TelaListarCobraControlador(JTextField jTextFieldcaf) {
		this.jTextFieldcaf = jTextFieldcaf;
	}

	CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp ();
	EntidadeService entidadeService = new EntidadeService();
	
	@Override
	public void actionPerformed(ActionEvent e) {
		Cobra cobra = cobraRepositorioImp.buscarCobraPorCaf(jTextFieldcaf.getText());
		entidadeService.gerarPdfDetalharCobra(cobra);
		System.out.println("PDF gerado");
	}

}
