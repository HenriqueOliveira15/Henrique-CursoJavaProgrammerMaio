package repositorio;

import java.util.List;
import entidades.Cobra;


public interface CobraRepositorio {
	
	public boolean salvarCobra(Cobra cobra, String peso);
	
	public List<Cobra> listarCobraRepositorio();
	
	public boolean excluirCobraRepositorio (String caf);

	public boolean alterarCobraRepositorio(Cobra cobra);
	
	public Cobra buscarCobraPorCaf(String caf);
}
