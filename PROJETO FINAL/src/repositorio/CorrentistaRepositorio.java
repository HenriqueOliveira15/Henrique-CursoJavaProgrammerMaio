package repositorio;

import java.util.List;

import entidades.Correntista;
import entidades.CorrentistaPadrao;

public interface CorrentistaRepositorio {

	public boolean salvarCorrentista(CorrentistaPadrao correntista, String qtdTransacao);

	public List<CorrentistaPadrao> listarCorrentistaRepositorio();

	public boolean excluirCorrentistaRepositorio(String cpf);

	public boolean alterarCorrentistaRepositorio(CorrentistaPadrao correntista, String cpf);

	public CorrentistaPadrao buscaCorrentistaPorCpf(String cpf);

}
