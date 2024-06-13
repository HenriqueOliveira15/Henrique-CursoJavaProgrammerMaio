package telas;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.TelaFormularioAlterarCachorroControlador;
import entidades.Cachorro;

public class TelaFormularioAlterarCachorro {
	
	public void chamarTelaCadastroCachorro(Cachorro cachorro) {

		GridLayout grid = new GridLayout(0, 1);
		String primeiroCampo = "Digite o nome do Cachorro";
		String terceiroCampo = "Digite a Cor do Pelo do Cachorro";

		JFrame frameTelaCadastroCachorro = new JFrame();

		frameTelaCadastroCachorro.setSize(200, 250); 
		JPanel panelTelaCadastroCachorro = new JPanel();
		
		JLabel labelSegundoCampo = new JLabel("CAF: " + cachorro.getCaf() ); 
		panelTelaCadastroCachorro.add(labelSegundoCampo);

	
		JLabel labelPrimeiroCampo = new JLabel(primeiroCampo);
		panelTelaCadastroCachorro.add(labelPrimeiroCampo);

		panelTelaCadastroCachorro.setLayout(grid);

		JTextField caixaTextoPrimeiroCampo = new JTextField(10);
		caixaTextoPrimeiroCampo.setText(cachorro.getNome());
		panelTelaCadastroCachorro.add(caixaTextoPrimeiroCampo);

		JLabel labelTerceiroCampo = new JLabel(terceiroCampo);
		panelTelaCadastroCachorro.add(labelTerceiroCampo);

		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		caixaTextoTerceiroCampo.setText(cachorro.getCorPelo());
		panelTelaCadastroCachorro.add(caixaTextoTerceiroCampo);

		JButton botaoCadastrar = new JButton("Alterar Cachorro");
		panelTelaCadastroCachorro.add(botaoCadastrar);

		frameTelaCadastroCachorro.add(panelTelaCadastroCachorro);
		frameTelaCadastroCachorro.setVisible(true);
		
		TelaFormularioAlterarCachorroControlador alterarCachorroControlador = new TelaFormularioAlterarCachorroControlador(caixaTextoPrimeiroCampo, cachorro.getCaf(), caixaTextoTerceiroCampo,  frameTelaCadastroCachorro);
		botaoCadastrar.addActionListener(alterarCachorroControlador);
		
	
	}
	
	

}
