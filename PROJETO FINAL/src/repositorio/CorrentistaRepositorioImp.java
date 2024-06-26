package repositorio;

import java.util.List;

import entidades.Correntista;
import entidades.CorrentistaPadrao;
import persistencia.DaoCorrentistaPadrao;
import servicos.EntidadeService;

public class CorrentistaRepositorioImp implements CorrentistaRepositorio {

	@Override
	public boolean salvarCorrentista(CorrentistaPadrao correntista, String qtdTransacao) {
		DaoCorrentistaPadrao daoCorrentista = new DaoCorrentistaPadrao();
		EntidadeService entidadeService = new EntidadeService();

		if (entidadeService.buscarAnuidadeCorrentista(qtdTransacao) == null) {
			return false;
		} else {
			correntista.setQtdTransacao(entidadeService.buscarAnuidadeCorrentista(qtdTransacao));
			return daoCorrentista.salvarCorrentista(correntista);
		}

	}

	@Override
	public List<CorrentistaPadrao> listarCorrentistaRepositorio(){
		DaoCorrentistaPadrao daoCorrentista = new DaoCorrentistaPadrao();
		return daoCorrentista.retornaListaDeCorrentistas();
	}

	@Override
	public boolean excluirCorrentistaRepositorio(String cpf) {
		DaoCorrentistaPadrao telaCorrentista = new DaoCorrentistaPadrao();
		if(buscaCorrentistaPorCpf(cpf) != null){
			return telaCorrentista.deletarCorrentista(cpf);
		}else {
			return false;
		}
	}

	@Override
	public boolean alterarCorrentistaRepositorio(CorrentistaPadrao correntista, String cpf) {
		DaoCorrentistaPadrao telaCorrentista = new DaoCorrentistaPadrao();
		if(buscaCorrentistaPorCpf(cpf) != null){
			return telaCorrentista.alterarCorrentista(buscaCorrentistaPorCpf(cpf));
		}else {
			return false;
		}
	}

	@Override
	public CorrentistaPadrao buscaCorrentistaPorCpf(String cpf) {
		for(CorrentistaPadrao correntistaEncontrado: listarCorrentistaRepositorio()) {
			if(correntistaEncontrado.getCpf().equals(cpf)) {
				return correntistaEncontrado;
			}
		}
		return null;
	}


}
