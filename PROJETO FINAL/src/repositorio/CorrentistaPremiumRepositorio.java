package repositorio;

import java.util.List;

import entidades.CorrentistaPremium;

public interface CorrentistaPremiumRepositorio {
	
	public boolean salvarCorrentista(CorrentistaPremium correntistaPremium, String qtdTransacao);

	public List<CorrentistaPremium> listarCorrentistaPremiumRepositorio();

	public boolean excluirCorrentistaPremiumRepositorio(String cpf);

	public boolean alterarCorrentistaRepositorio(CorrentistaPremium correntistaPremium, String cpf);

	public CorrentistaPremium buscaCorrentistaPorCpf(String cpf);


}
