package entidade;

public abstract class Animal {
	
	private String nome;
	private String CorPelo;

	public Animal(String nome) {
		super();
		this.nome = nome;
	}


	public String getNome() {
		return nome;
	}


	public void setCorpelo(String CorPelo) {
		this.CorPelo = CorPelo;
	}
	
	public String getCorPelo() {
		return CorPelo;
	}
	
	
}