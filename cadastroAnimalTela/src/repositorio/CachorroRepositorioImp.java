package repositorio;

import java.util.List;

import entidades.Cachorro;
import persistencia.DaoCachorro;

public class CachorroRepositorioImp implements CachorroRepositorio {

	@Override
	public boolean salvarCachorro(Cachorro cachorro) {
			DaoCachorro daoCachorro = new DaoCachorro();
			return daoCachorro.salvarCachorro(cachorro);
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