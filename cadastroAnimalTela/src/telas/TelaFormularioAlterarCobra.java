package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaFormularioAlterarCobraControlador;
import entidades.Cobra;

public class TelaFormularioAlterarCobra {
	
	public void chamarTelaCadastroCobra(Cobra cobra) {

		GridLayout grid = new GridLayout(0, 1);
		String primeiroCampo = "Digite o nome da Cobra";
		String terceiroCampo = "Digite O Tipo de Veneno da Cobra";

		JFrame frameTelaCadastroCobra = new JFrame();

		frameTelaCadastroCobra.setSize(200, 250); 
		JPanel panelTelaCadastroCobra = new JPanel();
		
		JLabel labelSegundoCampo = new JLabel("CAF: " + cobra.getCaf() ); 
		panelTelaCadastroCobra.add(labelSegundoCampo);

	
		JLabel labelPrimeiroCampo = new JLabel(primeiroCampo);
		panelTelaCadastroCobra.add(labelPrimeiroCampo);

		panelTelaCadastroCobra.setLayout(grid);

		JTextField caixaTextoPrimeiroCampo = new JTextField(10);
		caixaTextoPrimeiroCampo.setText(cobra.getNome());
		panelTelaCadastroCobra.add(caixaTextoPrimeiroCampo);

		JLabel labelTerceiroCampo = new JLabel(terceiroCampo);
		panelTelaCadastroCobra.add(labelTerceiroCampo);

		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		caixaTextoTerceiroCampo.setText(cobra.getTipoVeneno());
		panelTelaCadastroCobra.add(caixaTextoTerceiroCampo);

		JButton botaoCadastrar = new JButton("Alterar Cobra");
		panelTelaCadastroCobra.add(botaoCadastrar);

		frameTelaCadastroCobra.add(panelTelaCadastroCobra);
		frameTelaCadastroCobra.setVisible(true);
		
		TelaFormularioAlterarCobraControlador alterarCobraControlador = new TelaFormularioAlterarCobraControlador(caixaTextoPrimeiroCampo, cobra.getCaf(), caixaTextoTerceiroCampo,  frameTelaCadastroCobra);
		botaoCadastrar.addActionListener(alterarCobraControlador);
		
	
	}
	
	

}
