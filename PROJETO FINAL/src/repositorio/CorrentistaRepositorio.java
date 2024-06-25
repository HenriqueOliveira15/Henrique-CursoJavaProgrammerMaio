package repositorio;

import java.util.List;

import entidades.Correntista;

public interface CorrentistaRepositorio {

	public boolean salvarCorrentista(Correntista correntista, String qtdTransacao);

	public List<Correntista> listarCorrentistaRepositorio();

	public boolean excluirCorrentistaRepositorio(String cpf);

	public boolean alterarCorrentistaRepositorio(Correntista correntista);

	public Correntista buscaCorrentistaPorCpf(String cpf);

}
