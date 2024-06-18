package servicos;

import javax.swing.JOptionPane;

import entidades.Cachorro;
import entidades.Cobra;
import validacao.EntidadeValidacao;

public class EntidadeService {
	
	public Double calculaPrecoCachorro (String peso) {
		
		Cachorro cachorro = new Cachorro();
		
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();
		
		if (entidadeValidacao.validapeso(peso) == null) {
			JOptionPane.showMessageDialog(null, "O Valor " + peso + "Não é válido");
		}else {
			
			return cachorro.calcularPreco(entidadeValidacao.validapeso(peso));
		}
		
		return null;
	}
	
	public Double calculaPrecoCobra (String peso) {
		
		Cobra cobra = new Cobra();
		
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();
		
		if (entidadeValidacao.validapeso(peso) == null) {
			JOptionPane.showMessageDialog(null, "O Valor " + peso + "Não é válido");
		}else {
			
			return cobra.calcularPreco(entidadeValidacao.validapeso(peso));
		}
		
		return null;
	}
	
	


}
