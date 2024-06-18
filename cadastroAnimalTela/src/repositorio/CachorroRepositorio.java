package repositorio;

import java.util.List;

import entidades.Cachorro;

public interface CachorroRepositorio {
	
		public boolean salvarCachorro(Cachorro cachorro, String peso);
		
		public List<Cachorro> listarCachorroRepositorio();
		
		public boolean excluirCachorroRepositorio (String caf);
		
		public boolean alterarCachorroRepositorio(Cachorro cachorro);
		
		public Cachorro buscaCachorroPorCaf(String caf);
}
