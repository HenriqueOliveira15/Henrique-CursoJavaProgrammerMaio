package controlador.ControladorCorrentistaPremium;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import cliente.EnderecoCorrentista;
import entidades.CorrentistaPremium;
import repositorio.CorrentistaPremiumRepositorioImp;
import telas.TelasCorrentistaPremium.TelaMenuCorrentistaPremium;

public class TelaCadastroCorrentistaPremiumControlador implements ActionListener{
	
	JTextField caixaTextoPrimeiroCampoRecebido;
	JTextField caixaTextoSegundoCampoRecebido;
	JTextField caixaTextoTerceiroCampoRecebido;
	JTextField caixaTextoQuartoCampoRecebido;
	JTextField caixaTextoQuintoCampoRecebido;
	JFrame frameTelaCadastroCorrentistaPremium;
	
	EnderecoCorrentista enderecoCorrentista = new EnderecoCorrentista();
	TelaMenuCorrentistaPremium telaMenuCorrentistaPremium = new TelaMenuCorrentistaPremium();
	CorrentistaPremiumRepositorioImp correntistaPremiumRepositorioImp = new CorrentistaPremiumRepositorioImp();
	
	public TelaCadastroCorrentistaPremiumControlador(JTextField caixaTextoPrimeiroCampoRecebido,
			JTextField caixaTextoSegundoCampoRecebido, JTextField caixaTextoTerceiroCampoRecebido,
			JTextField caixaTextoQuartoCampoRecebido, JFrame frameTelaCadastroCorrentistaPremium,
			JTextField caixaTextoQuintoCampoRecebido) {
		this.caixaTextoPrimeiroCampoRecebido = caixaTextoPrimeiroCampoRecebido;
		this.caixaTextoSegundoCampoRecebido = caixaTextoSegundoCampoRecebido;
		this.caixaTextoTerceiroCampoRecebido = caixaTextoTerceiroCampoRecebido;
		this.caixaTextoQuartoCampoRecebido = caixaTextoQuartoCampoRecebido;
		this.caixaTextoQuintoCampoRecebido = caixaTextoQuintoCampoRecebido;
		this.frameTelaCadastroCorrentistaPremium = frameTelaCadastroCorrentistaPremium;
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getActionCommand() == "Voltar") {
			frameTelaCadastroCorrentistaPremium.setVisible(false);
			telaMenuCorrentistaPremium.chamarTelaMenuCorrentistaPremium();
		}
		
		CorrentistaPremium correntistaConfirmacao = populaCorrentista();
		if(e.getActionCommand() == "Enviar") {
		int confirmacao = JOptionPane.showConfirmDialog(null, "Confirme os dados:" +"\n"
														+ correntistaConfirmacao.getNome()+"\n"
														+correntistaConfirmacao.getCpf()+ "\n"
														+correntistaConfirmacao.getEndereco().getCep()+ "\n"
														+correntistaConfirmacao.getEmail()+ "\n"
														+correntistaConfirmacao.getEndereco().getLocalidade()+ "\n"
														+correntistaConfirmacao.getEndereco().getLogradouro()+ "\n"
														+correntistaConfirmacao.getEndereco().getUf()+ "\n"
														);
		if (confirmacao == 0) {
			registrarArquivo(correntistaConfirmacao);
			frameTelaCadastroCorrentistaPremium.setVisible(false);
			telaMenuCorrentistaPremium.chamarTelaMenuCorrentistaPremium();
		}
		
	}
		
	}
	
	 public void registrarArquivo(CorrentistaPremium correntistaConfirmacao) {

		if (correntistaPremiumRepositorioImp.salvarCorrentista(correntistaConfirmacao,
				caixaTextoQuintoCampoRecebido.getText())) {
			JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
		} else {
			JOptionPane.showMessageDialog(null, "Nao foi possivel salvar os dados");
		}

	}

	public CorrentistaPremium populaCorrentista() {

		CorrentistaPremium correntista = new CorrentistaPremium();

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

