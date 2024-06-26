package telas.TelasCorrentistaPremium;

import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import controlador.ControladorCorrentistaPremium.TelaCadastroCorrentistaPremiumControlador;

public class TelaCadastroCorrentistaPremium {

	public static void chamartelaCadastroCorrentistaPremium() {

		String nomeText = "Informe o NOME do Correntista";
		String cpfText = "Informe o CPF do Correntista";
		String cepText = "Informe o CEP do Correntista";
		String emailText = "Informe o Email do Correntista ";
		String qtdTransacaoText = "Informe a Quantidade de Transações";

		JFrame frameTelaCadastroCorrentistaPremium = new JFrame();
		GridLayout grid = new GridLayout(0, 1);

		frameTelaCadastroCorrentistaPremium.setSize(300, 300);
		JPanel painelTelaCadastroCorrentistaPremium = new JPanel();

		JLabel labelPrimeiroCampo = new JLabel(nomeText);
		painelTelaCadastroCorrentistaPremium.add(labelPrimeiroCampo);

		JTextField caixaTextoPrimeiroCampo = new JTextField(10);
		painelTelaCadastroCorrentistaPremium.add(caixaTextoPrimeiroCampo);

		JLabel labelSegundoCampo = new JLabel(cpfText);
		painelTelaCadastroCorrentistaPremium.add(labelSegundoCampo);

		JTextField caixaTextoSegundoCampo = new JTextField(10);
		painelTelaCadastroCorrentistaPremium.add(caixaTextoSegundoCampo);

		JLabel labelTerceiroCampo = new JLabel(cepText);
		painelTelaCadastroCorrentistaPremium.add(labelTerceiroCampo);

		JTextField caixaTextoTerceiroCampo = new JTextField(10);
		painelTelaCadastroCorrentistaPremium.add(caixaTextoTerceiroCampo);
		painelTelaCadastroCorrentistaPremium.setLayout(grid);

		JLabel labelQuartoCampo = new JLabel(emailText);
		painelTelaCadastroCorrentistaPremium.add(labelQuartoCampo);

		JTextField caixaTextoQuartoCampo = new JTextField(10);
		painelTelaCadastroCorrentistaPremium.add(caixaTextoQuartoCampo);

		JLabel labelQuintoCampo = new JLabel(qtdTransacaoText);
		painelTelaCadastroCorrentistaPremium.add(labelQuintoCampo);

		JTextField caixaTextoQuintoCampo = new JTextField(10);
		painelTelaCadastroCorrentistaPremium.add(caixaTextoQuintoCampo);

		JButton botaoCadastrar = new JButton("Enviar");
		painelTelaCadastroCorrentistaPremium.add(botaoCadastrar);
		JButton botaoVoltar = new JButton("Voltar");
		painelTelaCadastroCorrentistaPremium.add(botaoVoltar);

		frameTelaCadastroCorrentistaPremium.add(painelTelaCadastroCorrentistaPremium);
		frameTelaCadastroCorrentistaPremium.setVisible(true);

		TelaCadastroCorrentistaPremiumControlador cadastroCorrentistaPremiumControlador = new TelaCadastroCorrentistaPremiumControlador(
				caixaTextoPrimeiroCampo, caixaTextoSegundoCampo, caixaTextoTerceiroCampo, caixaTextoQuartoCampo,
				frameTelaCadastroCorrentistaPremium, caixaTextoQuintoCampo);
		botaoCadastrar.addActionListener(cadastroCorrentistaPremiumControlador);
		botaoVoltar.addActionListener(cadastroCorrentistaPremiumControlador);

	}
}
