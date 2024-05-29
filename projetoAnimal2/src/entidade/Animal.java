package entidade;

public abstract class Animal {
	
	private String Nome;
	private String Idade;
	private Double preco;
	private Double Peso;
	
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getIdade() {
		return Idade;
	}
	public void setIdade(String idade) {
		Idade = idade;
	}
	public Double getPreco() {
		return preco;
	}
	public void setPreco(Double preco) {
		this.preco = preco;
	}
	public Double getPeso() {
		return Peso;
	}
	public void setPeso(Double string) {
		Peso = string;
	}
	
	
	
	
	
}
