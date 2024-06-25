package validacao;

public class EntidadeValidacao {
	
public Double validaqtdTransacao(String qtdTransacao) {
		
		double QtdTransacao;
		
		try {
			QtdTransacao = Double.parseDouble(qtdTransacao);
		} catch (Exception e) {
			return null;
		}
		
		return QtdTransacao;
		
	}

}
