package entidades;

public class CorrentistaPadrao extends Correntista{
	
	public Double calcularAnuidade (double qtdTransacao) {

		return qtdTransacao * 0.5;

	}

}
