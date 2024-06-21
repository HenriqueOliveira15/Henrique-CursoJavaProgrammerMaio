package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JTextField;
import entidades.Cachorro;
import repositorio.CachorroRepositorioImp;
import servicos.EntidadeService;

public class TelaListarCachorroControlador implements ActionListener {
	
	
	JTextField jTextFieldcaf;
	
	public TelaListarCachorroControlador(JTextField jTextFieldcaf) {
		this.jTextFieldcaf = jTextFieldcaf;
	}
	
	
	CachorroRepositorioImp cachorroRepositorioImp = new CachorroRepositorioImp ();
	EntidadeService entidadeService = new EntidadeService();
	
	
	 
	@Override
	public void actionPerformed(ActionEvent e) {
		Cachorro cachorro = cachorroRepositorioImp.buscaCachorroPorCaf(jTextFieldcaf.getText());
		entidadeService.gerarPdfDetalharCachorro(cachorro);
		System.out.println("PDF gerado");
	}
	
	

}
