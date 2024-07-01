package entidades;

public abstract class Correntista {
	
	private String Nome;
	private String Cpf;
	private Endereco endereco;
	private Double QtdTransacao;
	private String Email;
	private Double ValorAnuidade;
	

	
	public Double getValorAnuidade() {
		return ValorAnuidade;
	}

	public void setValorAnuidade(Double valorAnuidade) {
		ValorAnuidade = valorAnuidade;
	}

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
	public String getCpf() {
		return Cpf;
	}
	public void setCpf(String cpf) {
		Cpf = cpf;
	}

	public Double getQtdTransacao() {
		return QtdTransacao;
	}
	public void setQtdTransacao(Double qtdTransacao) {
		QtdTransacao = qtdTransacao;
	}
	
	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
	public Double calcularAnuidade (double qtdTransacao) {

		return qtdTransacao * 0.5;

	}
}
