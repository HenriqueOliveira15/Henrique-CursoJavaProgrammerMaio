package entidades;

public abstract class Correntista {
	
	private String Nome;
	private String Cpf;
	private Endereco endereco;
	private Double QtdTransacao;
	private String Email;
	
	
	
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
	
	public Double calcularAnuidade(double qtdTransacao) {
		
		return null;
	}

	public String getEmail() {
		return Email;
	}

	public void setEmail(String email) {
		Email = email;
	}
	
}
