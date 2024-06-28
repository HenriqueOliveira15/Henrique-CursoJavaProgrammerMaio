package controlador.ControladorCorrentistaPadrao;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JTextField;
import entidades.CorrentistaPadrao;
import repositorio.CorrentistaRepositorioImp;
import servicos.EntidadeService;
import telas.TelasCorrentistaPadrao.TelaMenuCorrentista;

public class TelaListarCorrentistaControlador implements ActionListener {
	
	
JTextField cpfTextField;
JFrame frameListarCorrentistas;

	public TelaListarCorrentistaControlador(JTextField cpfTextField,JFrame frameListarCorrentistas ) {
		this.cpfTextField = cpfTextField;
		this.frameListarCorrentistas = frameListarCorrentistas;
	}

	CorrentistaRepositorioImp correntistaRepositorioImp = new CorrentistaRepositorioImp ();
	EntidadeService entidadeService = new EntidadeService();
	
	TelaMenuCorrentista telaMenuCorrentista = new TelaMenuCorrentista();
	
	
	

	@Override
	public void actionPerformed(ActionEvent e) {
		CorrentistaPadrao correntista = correntistaRepositorioImp.buscaCorrentistaPorCpf(cpfTextField.getText());
		entidadeService.gerarPdfDetalharCorrentistaPadrao(correntista);
		System.out.println("PDF gerado");
	}
}
	


