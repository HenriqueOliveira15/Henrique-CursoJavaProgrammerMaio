package telas.TelasCorrentistaPadrao;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorCorrentistaPadrao.TelaFormularioAlteraCorrentistaControlador;
import entidades.CorrentistaPadrao;

public class TelaFormularioAlteraCorrentista {
	
	public void chamarTelaCadastroCorrentista(CorrentistaPadrao correntista) {

		GridLayout grid = new GridLayout(0, 1);
		String primeiroCampo = "Digite o nome do Correntista";
		String terceiroCampo = "Digite o CEP do Correntista";

		JFrame frameTelaCadastroCorrentista = new JFrame();

		frameTelaCadastroCorrentista.setSize(200, 250); 
		JPanel panelTelaCadastroCorrentista = new JPanel();
		
		JLabel labelCpf = new JLabel("CPF: " + correntista.getCpf());
		panelTelaCadastroCorrentista.add(labelCpf);
		
		JLabel labelPrimeiroCampo = new JLabel(primeiroCampo);
		panelTelaCadastroCorrentista.add(labelPrimeiroCampo);
	
		panelTelaCadastroCorrentista.setLayout(grid);

		JTextField caixaTextoPrimeiroCampo = new JTextField(10);
		caixaTextoPrimeiroCampo.setText(correntista.getNome());
		panelTelaCadastroCorrentista.add(caixaTextoPrimeiroCampo);
		
		JLabel labelTerceiroCampo = new JLabel(terceiroCampo);
		panelTelaCadastroCorrentista.add(labelTerceiroCampo);
		
		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		caixaTextoTerceiroCampo.setText(correntista.getEndereco().getCep());
		panelTelaCadastroCorrentista.add(caixaTextoTerceiroCampo);
		
		
		JButton botaoAlterar = new JButton("Alterar Correntista");
		panelTelaCadastroCorrentista.add(botaoAlterar);

		frameTelaCadastroCorrentista.add(panelTelaCadastroCorrentista);
		frameTelaCadastroCorrentista.setVisible(true);
		
		TelaFormularioAlteraCorrentistaControlador alteraCorrentistaControlador = new TelaFormularioAlteraCorrentistaControlador(frameTelaCadastroCorrentista, caixaTextoPrimeiroCampo, caixaTextoPrimeiroCampo, terceiroCampo);
		botaoAlterar.addActionListener(alteraCorrentistaControlador);
		

	}

}
