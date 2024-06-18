package repositorio;

import java.util.List;

import entidades.Cobra;
import persistencia.DaoCobra;
import servicos.EntidadeService;

public class CobraRepositorioImp implements CobraRepositorio{

	@Override
	public boolean salvarCobra(Cobra cobra, String peso) {
		DaoCobra daoCobra = new DaoCobra();
		EntidadeService entidadeService = new EntidadeService();
		
		if (entidadeService.calculaPrecoCobra(peso) == null) {
			return false;
		} else {
			cobra.setPreco(entidadeService.calculaPrecoCobra(peso));
			return daoCobra.salvarCobra(cobra);
		}
	}

	@Override
	public List<Cobra> listarCobraRepositorio() {
		DaoCobra daoCobra = new DaoCobra();
		return daoCobra.retornaListaCobra();
	}

	@Override
	public boolean excluirCobraRepositorio(String caf) {
		
		DaoCobra daoCobra = new DaoCobra();
		for (Cobra cobra : listarCobraRepositorio()) {
			if (cobra.getCaf().equals(caf)) {
				return daoCobra.deletarCobra(caf);
			}
		}
		return false;
	}

	@Override
	public boolean alterarCobraRepositorio(Cobra cobra) {
		DaoCobra daoCobra = new DaoCobra();
		return daoCobra.alterarCobra(cobra);
	}

	@Override
	public Cobra buscarCobraPorCaf(String caf) {
		for(Cobra cobra : listarCobraRepositorio() ) {
			if(cobra.getCaf().equals(caf)) {
				return cobra;
			}
		}
		return null;
	}

}
