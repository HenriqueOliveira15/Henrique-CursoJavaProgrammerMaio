package validacao;

public class EntidadeValidacao {
	
	public Double validapeso(String peso) {
		
		double Peso;
		
		try {
			Peso = Double.parseDouble(peso);
		} catch (Exception e) {
			return null;
		}
		
		return Peso;
		
	}

}
