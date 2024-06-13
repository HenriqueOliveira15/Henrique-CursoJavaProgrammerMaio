package repositorio;

import java.util.List;

import entidades.Cobra;
import persistencia.DaoCobra;

public class CobraRepositorioImp implements CobraRepositorio{

	@Override
	public boolean salvarCobra(Cobra cobra) {
		DaoCobra daoCobra = new DaoCobra();
		return daoCobra.salvarCobra(cobra);
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
