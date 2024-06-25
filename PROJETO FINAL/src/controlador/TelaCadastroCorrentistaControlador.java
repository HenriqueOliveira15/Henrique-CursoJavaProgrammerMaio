package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import entidades.Correntista;
import repositorio.CorrentistaRepositorioImp;
import telas.TelaMenuCorrentista;

public class TelaCadastroCorrentistaControlador implements ActionListener {

	JTextField caixaTextoPrimeiroCampoRecebido;
	JTextField caixaTextoSegundoCampoRecebido;
	JTextField caixaTextoTerceiroCampoRecebido;
	JTextField caixaTextoQuartoCampoRecebido;
	JTextField caixaTextoQuintoCampoRecebido;
	JFrame frameTelaCadastroCorrentista;

	CorrentistaRepositorioImp correntistaRepositorioImp = new CorrentistaRepositorioImp();

	TelaMenuCorrentista telaMenuCorrentista = new TelaMenuCorrentista();

	public TelaCadastroCorrentistaControlador(JTextField caixaTextoPrimeiroCampoRecebido,
			JTextField caixaTextoSegundoCampoRecebido, JTextField caixaTextoTerceiroCampoRecebido,
			JFrame frameTelaCadastroCorrentista, JTextField caixaTextoQuintoCampoRecebido) {
		this.caixaTextoPrimeiroCampoRecebido = caixaTextoPrimeiroCampoRecebido;
		this.caixaTextoSegundoCampoRecebido = caixaTextoSegundoCampoRecebido;
		this.caixaTextoTerceiroCampoRecebido = caixaTextoTerceiroCampoRecebido;
		this.caixaTextoQuartoCampoRecebido = caixaTextoQuartoCampoRecebido;
		this.caixaTextoQuintoCampoRecebido = caixaTextoQuintoCampoRecebido;
		this.frameTelaCadastroCorrentista = frameTelaCadastroCorrentista;
	}

	@Override
	public void actionPerformed(ActionEvent e) {

		Correntista correntistaConfirmacao = populaCorrentista();
		int confirmacao = JOptionPane.showConfirmDialog(null,
				"Confirme os dados:" + "\n" + correntistaConfirmacao.getNome() + "\n" + correntistaConfirmacao.getCpf()
						+ "\n"
		// + correntistaConfirmacao.getEndereco().getLocalidade()+ "\n"
		// + correntistaConfirmacao.getEndereco().getLogradouro()+ "\n"
		// + correntistaConfirmacao.getEndereco().getUf()+ "\n"
		);

		if (confirmacao == 0) {
			registrarArquivo(correntistaConfirmacao);

			System.out.println("O NOME do correntista: " + caixaTextoPrimeiroCampoRecebido.getText());

			System.out.println("O CPF do correntista: " + caixaTextoSegundoCampoRecebido.getText());

			System.out.println("O Cep do correntista: " + caixaTextoTerceiroCampoRecebido.getText());

			frameTelaCadastroCorrentista.setVisible(false);

		}

		if (e.getActionCommand().equals("Voltar")) {
			System.out.println("Voltar para o menu");
			telaMenuCorrentista.chamarTelaMenuCorrentista();
			frameTelaCadastroCorrentista.setVisible(false);
		}

	}

	public void registrarArquivo(Correntista correnstistaConfirmacao) {

		if (correntistaRepositorioImp.salvarCorrentista(correnstistaConfirmacao,
				caixaTextoQuintoCampoRecebido.getText())) {
			JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Nao foi possivel salvar os dados");
		}

	}

	public Correntista populaCorrentista() {

		Correntista correntista = new Correntista();

		correntista.setNome(caixaTextoPrimeiroCampoRecebido.getText());
		correntista.setCpf(caixaTextoSegundoCampoRecebido.getText());
		try {
			correntista.setEndereco(null);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return correntista;
	}

}
