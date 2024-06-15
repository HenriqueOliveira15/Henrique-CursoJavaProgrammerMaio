package controlador;

import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import entidades.Cobra;
import persistencia.DaoCobra;
import repositorio.CobraRepositorioImp;
import telas.TelaAlterarCobra;
import telas.TelaCadastroCobra;
import telas.TelaDeletarCobra;
import telas.TelaListarCobra;
import telas.TelaMenuInicial;

public class TelaMenuCobraControlador implements ActionListener {

	JTextField opcaoRecebida;
	JFrame frameTelaMenuCobra;
	
	TelaListarCobra telaListarCobra = new TelaListarCobra();
	TelaDeletarCobra telaDeletarCobra = new TelaDeletarCobra();
	TelaAlterarCobra telaAlterarCobra = new TelaAlterarCobra();
	TelaMenuInicial telaMenuInicial = new TelaMenuInicial();
	
	CobraRepositorioImp cobraRepositorio = new CobraRepositorioImp();

	public TelaMenuCobraControlador(JTextField opcaoRecebida, JFrame frameTelaMenuCobraFrame) {
		this.opcaoRecebida = opcaoRecebida;
		this.frameTelaMenuCobra = frameTelaMenuCobraFrame;
	}

	DaoCobra daoCobra = new DaoCobra();

	@Override
	public void actionPerformed(ActionEvent e) {

		if (opcaoRecebida.getText().equals("1") || opcaoRecebida.getText().equals("2") || opcaoRecebida.getText().equals("3") || opcaoRecebida.getText().equals("4")|| opcaoRecebida.getText().equals("5")){
			switch (opcaoRecebida.getText()) {
			case "1":
				TelaCadastroCobra.chamartelaCadastroCobra();
				System.out.println("Direcione para a tela do cachorro");
				frameTelaMenuCobra.setVisible(false);
				break;

			case "2":
				telaListarCobra.listarCobra(daoCobra.retornaListaCobra());
				System.out.println("Liste as cobras cadastradas");
				break;

			case "3":
				telaDeletarCobra.chamarTelaDeletarCobra(cobraRepositorio.listarCobraRepositorio());
				System.out.println("Direcione para deletar cobra");
				break;
				
			case "4":
				telaAlterarCobra.chamarTelaAlterarCobra(cobraRepositorio.listarCobraRepositorio());
				System.out.println("Direcione para alterar cobra");
				break;
				
			case "5": 
				telaMenuInicial.chamarTelaMenuIniciar();
				System.out.println("Direcione Para o Menu Inicial");
				frameTelaMenuCobra.setVisible(false);
				break;
			}
		}
		
	}

	public void imprimirCobra(List<Cobra> listaCobra) {

		StringBuilder impressaoCobra = new StringBuilder();

		for (Cobra cobraLista : listaCobra) {
			impressaoCobra.append("Nome: ").append(cobraLista.getNome()).append("\n").append("Caf: ")
					.append(cobraLista.getCaf()).append("\n").append("Tipo Veneno: ").append(cobraLista.getTipoVeneno())
					.append("\n");

		}

		JOptionPane.showMessageDialog(null, impressaoCobra.toString());

	}

}
