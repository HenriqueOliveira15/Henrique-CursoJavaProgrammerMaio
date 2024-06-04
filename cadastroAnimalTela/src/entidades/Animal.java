package entidades;

public abstract class Animal {
	
	private static String Nome; 
	private static String Caf;
	
	
	public static String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public static String getCaf() {
		return Caf;
	}
	public void setCaf(String caf) {
		Caf = caf;
	}
	
	
	
}

