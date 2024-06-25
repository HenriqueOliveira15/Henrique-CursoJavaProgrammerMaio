package entidades;

public class CorrentistaPremium extends Correntista {
	
	@Override 
	public Double calcularAnuidade(double qtdTransacao) {
		
		return qtdTransacao * 120.0;

	}

}
