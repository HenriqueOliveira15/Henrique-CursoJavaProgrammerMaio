package servicos;

import javax.swing.JOptionPane;
import entidades.CorrentistaPadrao;
import validacao.EntidadeValidacao;

public class EntidadeService {
	
	public Double buscarAnuidadeCorrentista(String qtdTransacao) {
		
		CorrentistaPadrao correntista = new CorrentistaPadrao();
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();
		
		if (entidadeValidacao.validaqtdTransacao(qtdTransacao)== null) {
			JOptionPane.showMessageDialog(null, "O valor "+ qtdTransacao + " Não é valido" );
		}else {
			return correntista.calcularAnuidade(entidadeValidacao.validaqtdTransacao(qtdTransacao));
		}
		
		return null;
	}

}
