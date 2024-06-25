package entidades;

public class Correntista {
	
	private String Nome;
	private String Cpf;
	private String Cep;
	private Endereco endereco;
	private Double QtdTransacao;
	
	

	public String getNome() {
		return Nome;
	}
	public void setNome(String nome) {
		Nome = nome;
	}
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}
	public String getCep() {
		return Cep;
	}
	public void setCep(String cep) {
		Cep = cep;
	}
	
	public Double getQtdTransacao() {
		return QtdTransacao;
	}
	public void setQtdTransacao(Double qtdTransacao) {
		QtdTransacao = qtdTransacao;
	}
	
	public Endereco getEndereco() {
		return endereco;
	}
	public void setEndereco(Endereco endereco) {
		this.endereco = endereco;
	}
	
	
	
	public Double calcularAnuidade (double qtdTransacao) {

		return qtdTransacao * 0.5;

	}
	
	
	
	

}
