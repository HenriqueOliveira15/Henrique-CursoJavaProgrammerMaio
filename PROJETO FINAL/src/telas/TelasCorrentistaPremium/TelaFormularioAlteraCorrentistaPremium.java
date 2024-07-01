package telas.TelasCorrentistaPremium;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

import controlador.ControladorCorrentistaPremium.TelaFormularioAlteraCorrentistaPremiumControlador;
import entidades.CorrentistaPremium;


public class TelaFormularioAlteraCorrentistaPremium {
	
	public void chamarTelaCadastroCorrentista(CorrentistaPremium correntista) {

		GridLayout grid = new GridLayout(0, 1);
		String primeiroCampo = "Digite o NOME do Correntista";
		String terceiroCampo = "Digite o EMAIL do Correntista";

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
		caixaTextoTerceiroCampo.setText(correntista.getEmail());
		panelTelaCadastroCorrentista.add(caixaTextoTerceiroCampo);
		
		
		JButton botaoAlterar = new JButton("Alterar Correntista");
		panelTelaCadastroCorrentista.add(botaoAlterar);

		frameTelaCadastroCorrentista.add(panelTelaCadastroCorrentista);
		frameTelaCadastroCorrentista.setVisible(true);
		
		TelaFormularioAlteraCorrentistaPremiumControlador alteraCorrentistaControlador = new TelaFormularioAlteraCorrentistaPremiumControlador(frameTelaCadastroCorrentista, caixaTextoPrimeiroCampo, caixaTextoTerceiroCampo, correntista.getCpf());
		botaoAlterar.addActionListener(alteraCorrentistaControlador);
		

	}

}
