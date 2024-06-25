package servicos;

import javax.swing.JOptionPane;

import entidades.Correntista;
import validacao.EntidadeValidacao;

public class EntidadeService {
	
	public Double buscarAnuidadeCorrentista(String qtdTransacao) {
		Correntista correntista = new Correntista();
		EntidadeValidacao entidadeValidacao = new EntidadeValidacao();
		
		if (entidadeValidacao.validaqtdTransacao(qtdTransacao)== null) {
			JOptionPane.showMessageDialog(null, "O valor "+ qtdTransacao + " Não é valido" );
		}else {
			return correntista.calcularAnuidade(entidadeValidacao.validaqtdTransacao(qtdTransacao));
		}
		
		return null;
	}

}
