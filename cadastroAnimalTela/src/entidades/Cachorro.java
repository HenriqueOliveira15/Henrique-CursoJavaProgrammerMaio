package entidades;

public class Cachorro extends Animal{
	
	private String CorPelo;

	public String getCorPelo() {
		return CorPelo;
	}

	public void setCorPelo(String corPelo) {
		CorPelo = corPelo;
	}
	
	@Override 
	public Double calcularPreco(double peso) {
		
		return peso * 120.0;

	}
	
}
