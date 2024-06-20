package entidades;

public abstract class Animal {
	
	private  String Nome; 
	private  String Caf;
	private Double Peso;
	private Endereco endereco;

	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCaf() {
		return Caf;
	}
	public void setCaf(String caf) {
		Caf = caf;
	}
	
	public Double getPeso() {
		return Peso;
	}
	public void setPreco(Double peso) {
		Peso = peso;
	}
	
	
	public Double calcularPreco (double peso) {

		return peso * 100.00;

	}
	
}

