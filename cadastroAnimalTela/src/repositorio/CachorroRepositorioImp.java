package repositorio;

import java.util.List;

import entidades.Cachorro;
import persistencia.DaoCachorro;
import servicos.EntidadeService;

public class CachorroRepositorioImp implements CachorroRepositorio {

	@Override
	public boolean salvarCachorro(Cachorro cachorro, String peso) {
			DaoCachorro daoCachorro = new DaoCachorro();
			EntidadeService entidadeService = new EntidadeService();
			
			if (entidadeService.calculaPrecoCachorro(peso) == null) {
				return false;
			} else {
				cachorro.setPreco(entidadeService.calculaPrecoCachorro(peso));
				return daoCachorro.salvarCachorro(cachorro);
			}
			
		
	}

	@Override
	public List<Cachorro> listarCachorroRepositorio() {
		DaoCachorro daoCachorro = new DaoCachorro();
		return daoCachorro.retornaListaCachorro();
	}


	public boolean excluirCachorroRepositorio(String caf) {
		DaoCachorro telaCachorro = new DaoCachorro();
				return telaCachorro.deletarCachorro(caf);

	}
	
	@Override
	public boolean alterarCachorroRepositorio(Cachorro cachorro) {
		DaoCachorro daoCachorro = new DaoCachorro();
		return daoCachorro.alterarCachorro(cachorro);
	}
	
	@Override
	public Cachorro buscaCachorroPorCaf(String caf) {
		for(Cachorro cachorro:listarCachorroRepositorio() ) {
			if(cachorro.getCaf().equals(caf)) {
				return cachorro;
			}
		}
		return null;
	}

}