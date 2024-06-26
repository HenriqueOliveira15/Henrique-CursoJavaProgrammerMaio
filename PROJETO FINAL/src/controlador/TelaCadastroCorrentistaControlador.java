package controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import cliente.EnderecoCorrentista;
import entidades.Correntista;
import entidades.CorrentistaPadrao;
import repositorio.CorrentistaRepositorioImp;
import telas.TelaMenuCorrentista;

public class TelaCadastroCorrentistaControlador implements ActionListener {

	JTextField caixaTextoPrimeiroCampoRecebido;
	JTextField caixaTextoSegundoCampoRecebido;
	JTextField caixaTextoTerceiroCampoRecebido;
	JTextField caixaTextoQuartoCampoRecebido;
	JTextField caixaTextoQuintoCampoRecebido;
	JFrame frameTelaCadastroCorrentista;

	EnderecoCorrentista enderecoCorrentista = new EnderecoCorrentista();
	CorrentistaRepositorioImp correntistaRepositorioImp = new CorrentistaRepositorioImp();
	TelaMenuCorrentista telaMenuCorrentista = new TelaMenuCorrentista();

	public TelaCadastroCorrentistaControlador(JTextField caixaTextoPrimeiroCampoRecebido,
			JTextField caixaTextoSegundoCampoRecebido, JTextField caixaTextoTerceiroCampoRecebido, JTextField caixaTextoQuartoCampoRecebido,
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
		
		if(e.getActionCommand() == "Voltar") {
			frameTelaCadastroCorrentista.setVisible(false);
			telaMenuCorrentista.chamarTelaMenuCorrentista();
		}
		
		CorrentistaPadrao correntistaConfirmacao = populaCorrentista();
		if(e.getActionCommand() == "Enviar") {
		int confirmacao = JOptionPane.showConfirmDialog(null, "Confirme os dados:" +"\n"
														+ correntistaConfirmacao.getNome()+"\n"
														+correntistaConfirmacao.getCpf()+ "\n"
														+correntistaConfirmacao.getEmail()+ "\n"
														+correntistaConfirmacao.getEndereco().getBairro()+ "\n"
														+correntistaConfirmacao.getEndereco().getLocalidade()+ "\n"
														+correntistaConfirmacao.getEndereco().getLogradouro()+ "\n"
														+correntistaConfirmacao.getEndereco().getUf()+ "\n"
														);
		if (confirmacao == 0) {
			registrarArquivo(correntistaConfirmacao);
			frameTelaCadastroCorrentista.setVisible(false);
			telaMenuCorrentista.chamarTelaMenuCorrentista();
		}
		
	}
		
	}
	
	

	public void registrarArquivo(CorrentistaPadrao correntistaConfirmacao) {

		if (correntistaRepositorioImp.salvarCorrentista(correntistaConfirmacao,
				caixaTextoQuintoCampoRecebido.getText())) {
			JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Nao foi possivel salvar os dados");
		}

	}

	public CorrentistaPadrao populaCorrentista() {

		CorrentistaPadrao correntista = new CorrentistaPadrao();

		correntista.setNome(caixaTextoPrimeiroCampoRecebido.getText());
		correntista.setCpf(caixaTextoSegundoCampoRecebido.getText());
		try {
			correntista.setEndereco(enderecoCorrentista.buscarEnderecoPeloCep(caixaTextoTerceiroCampoRecebido.getText()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return correntista;
	}

}
