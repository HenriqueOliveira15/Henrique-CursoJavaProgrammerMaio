package repositorio;

import java.util.List;

import entidades.CorrentistaPadrao;
import entidades.CorrentistaPremium;
import persistencia.DaoCorrentistaPadrao;
import persistencia.DaoCorrentistaPremium;
import servicos.EntidadeService;

public class CorrentistaPremiumRepositorioImp implements CorrentistaPremiumRepositorio{

	@Override
	public boolean salvarCorrentista(CorrentistaPremium correntista, String qtdTransacao) {
		DaoCorrentistaPremium daoCorrentista = new DaoCorrentistaPremium();
		EntidadeService entidadeService = new EntidadeService();

		if (entidadeService.buscarAnuidadeCorrentista(qtdTransacao) == null) {
			return false;
		} else {
			correntista.setQtdTransacao(entidadeService.buscarAnuidadeCorrentista(qtdTransacao));
			return daoCorrentista.salvarCorrentista(correntista);
		}

	}

	@Override
	public List<CorrentistaPremium> listarCorrentistaPremiumRepositorio() {
		DaoCorrentistaPremium daoCorrentista = new DaoCorrentistaPremium();
		return daoCorrentista.retornaListaDeCorrentistasPremium();
	}

	@Override
	public boolean excluirCorrentistaPremiumRepositorio(String cpf) {
		DaoCorrentistaPremium telaCorrentistaPremium = new DaoCorrentistaPremium();
		if(buscaCorrentistaPorCpf(cpf) != null){
			return telaCorrentistaPremium.deletarCorrentistaPremium(cpf);
		}else {
			return false;
		}
	}

	@Override
	public boolean alterarCorrentistaRepositorio(CorrentistaPremium correntistaPremium, String cpf) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public CorrentistaPremium buscaCorrentistaPorCpf(String cpf) {
		for(CorrentistaPremium correntistaEncontrado: listarCorrentistaPremiumRepositorio()) {
			if(correntistaEncontrado.getCpf().equals(cpf)) {
				return correntistaEncontrado;
			}
		}
		return null;
	}

}
