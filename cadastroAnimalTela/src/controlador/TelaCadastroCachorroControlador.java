package controlador;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import cliente.EnderecoCliente;
import entidades.Cachorro;
import persistencia.DaoCachorro;
import repositorio.CachorroRepositorioImp;
import telas.TelaMenuCachorro;

public class TelaCadastroCachorroControlador implements ActionListener {
	
	
	JTextField caixaTextoPrimeiroCampoRecebido; 
	JTextField caixaTextoSegundoCampoRecebido; 
	JTextField caixaTextoTerceiroCampoRecebido; 
	JFrame frameTelaCadastroCachorro;
	JTextField peso;
	JTextField jTextcep;
	DaoCachorro daoCachorro = new DaoCachorro();
	CachorroRepositorioImp cachorroRepositorioImp = new CachorroRepositorioImp();
	TelaMenuCachorro telaMenuCachorro = new TelaMenuCachorro();
	
	EnderecoCliente enderecoCliente = new EnderecoCliente();
	
	
	
	
	
	public TelaCadastroCachorroControlador(JTextField caixaTextoPrimeiroCampoRecebido,
			JTextField caixaTextoSegundoCampoRecebido, JTextField caixaTextoTerceiroCampoRecebido, JFrame frameTelaCadastroCachorro, JTextField peso, JTextField jTextcep) {
		this.caixaTextoPrimeiroCampoRecebido = caixaTextoPrimeiroCampoRecebido;
		this.caixaTextoSegundoCampoRecebido = caixaTextoSegundoCampoRecebido;
		this.caixaTextoTerceiroCampoRecebido = caixaTextoTerceiroCampoRecebido;
		this.frameTelaCadastroCachorro = frameTelaCadastroCachorro;
		this.peso = peso;
		this.jTextcep = jTextcep;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		Cachorro cachorroConfirmacao = populaCachorro();
		int confirmacao = JOptionPane.showConfirmDialog(null, "Confirme os dados:" +"\n"
														+ cachorroConfirmacao.getNome()+"\n"
														+ cachorroConfirmacao.getCaf()+ "\n"
														+ cachorroConfirmacao.getEndereco().getBairro()+ "\n"
														+ cachorroConfirmacao.getEndereco().getLocalidade()+ "\n"
														+ cachorroConfirmacao.getEndereco().getLogradouro()+ "\n"
														+ cachorroConfirmacao.getEndereco().getUf()+ "\n"
														);
		
		
		
		

		if (confirmacao == 0) {
			registrarArquivo(cachorroConfirmacao); // chamando o metodo de registrar o arquivo

			System.out.println("O NOME do cachorro: " + caixaTextoPrimeiroCampoRecebido.getText());

			System.out.println("O CAF do cachorro: " + caixaTextoSegundoCampoRecebido.getText());

			System.out.println("A COR DO PELO do cachorro: " + caixaTextoTerceiroCampoRecebido.getText());

			frameTelaCadastroCachorro.setVisible(false);

		}
		
		if(e.getActionCommand().equals("Voltar")){
			System.out.println("Voltar para o menu");
			telaMenuCachorro.chamarTelaMenuCachorro();
			frameTelaCadastroCachorro.setVisible(false);
		}
	
		
	}
	
	
	public void registrarArquivo(Cachorro cachorroConfirmacao) {
		
		
		if(cachorroRepositorioImp.salvarCachorro(cachorroConfirmacao, peso.getText())){
			JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Nao foi possivel salvar os dados");
	}

	}
	
	public Cachorro populaCachorro() {
		Cachorro cachorro = new Cachorro();
		cachorro.setNome(caixaTextoPrimeiroCampoRecebido.getText());
		cachorro.setCaf(caixaTextoSegundoCampoRecebido.getText());
		cachorro.setCorPelo(caixaTextoTerceiroCampoRecebido.getText());
		try {
			cachorro.setEndereco(enderecoCliente.buscarEnderecoPeloCep(jTextcep.getText()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cachorro;
	}
}
