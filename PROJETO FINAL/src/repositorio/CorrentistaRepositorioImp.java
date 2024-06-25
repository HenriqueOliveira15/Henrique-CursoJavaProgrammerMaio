package repositorio;

import java.util.List;

import entidades.Correntista;
import persistencia.DaoCorrentista;
import servicos.EntidadeService;

public class CorrentistaRepositorioImp implements CorrentistaRepositorio {

	@Override
	public boolean salvarCorrentista(Correntista correntista, String qtdTransacao) {
		DaoCorrentista daoCorrentista = new DaoCorrentista();
		EntidadeService entidadeService = new EntidadeService();

		if (entidadeService.buscarAnuidadeCorrentista(qtdTransacao) == null) {
			return false;
		} else {
			correntista.setQtdTransacao(entidadeService.buscarAnuidadeCorrentista(qtdTransacao));
			return daoCorrentista.salvarCorrentista(correntista);
		}

	}

	@Override
	public List<Correntista> listarCorrentistaRepositorio() {
		DaoCorrentista daoCorrentista = new DaoCorrentista();
		return daoCorrentista.retornaListaDeCorrentistas();
	}

	@Override
	public boolean excluirCorrentistaRepositorio(String cpf) {
		DaoCorrentista telaCorrentista = new DaoCorrentista();
		if(buscaCorrentistaPorCpf(cpf) != null){
			return telaCorrentista.deletarCorrentista(cpf);
		}else {
			return false;
		}
	}

	@Override
	public boolean alterarCorrentistaRepositorio(Correntista correntista) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Correntista buscaCorrentistaPorCpf(String cpf) {
		// TODO Auto-generated method stub
		return null;
	}

}
