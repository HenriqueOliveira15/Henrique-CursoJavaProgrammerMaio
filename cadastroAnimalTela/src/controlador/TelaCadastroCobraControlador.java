package controlador;

import java.awt.event.ActionEvent;


import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import cliente.EnderecoCliente;
import entidades.Cachorro;
import entidades.Cobra;
import persistencia.DaoCobra;
import repositorio.CobraRepositorioImp;
import telas.TelaMenuCobra;


public class TelaCadastroCobraControlador implements ActionListener{
	
	JTextField caixaTextoPrimeiroCampoRecebido; 
	JTextField caixaTextoSegundoCampoRecebido; 
	JTextField caixaTextoTerceiroCampoRecebido; 
	JFrame frameTelaCadastroCobra;
	JTextField peso;
	JTextField jTextcep;
	
	DaoCobra daoCobra = new DaoCobra();
	CobraRepositorioImp cobraRepositorioImp = new CobraRepositorioImp();
	TelaMenuCobra telaMenuCobra = new TelaMenuCobra();
	
	EnderecoCliente enderecoCliente = new EnderecoCliente();
	
	public TelaCadastroCobraControlador(JTextField caixaTextoPrimeiroCampoRecebido,
			JTextField caixaTextoSegundoCampoRecebido, JTextField caixaTextoTerceiroCampoRecebido, JFrame frameTelaCadastroCobra, JTextField peso, JTextField jTextcep ) {
		
		this.caixaTextoPrimeiroCampoRecebido = caixaTextoPrimeiroCampoRecebido;
		this.caixaTextoSegundoCampoRecebido = caixaTextoSegundoCampoRecebido;
		this.caixaTextoTerceiroCampoRecebido = caixaTextoTerceiroCampoRecebido;
		this.frameTelaCadastroCobra = frameTelaCadastroCobra;
		this.peso = peso;
		this.jTextcep = jTextcep;
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		Cobra cobraConfirmacao = populaCobra();
		int confirmacao = JOptionPane.showConfirmDialog(null, "Confirme os dados:" +"\n"
														+ cobraConfirmacao.getNome()+"\n"
														+ cobraConfirmacao.getCaf()+ "\n"
														+ cobraConfirmacao.getEndereco().getBairro()+ "\n"
														+ cobraConfirmacao.getEndereco().getLocalidade()+ "\n"
														+ cobraConfirmacao.getEndereco().getLogradouro()+ "\n"
														+ cobraConfirmacao.getEndereco().getUf()+ "\n"
														);
		if (confirmacao == 0) {
			registrarArquivo(cobraConfirmacao); // chamando o metodo de registrar o arquivo
		
		System.out.println("O NOME da Cobra: " + caixaTextoPrimeiroCampoRecebido.getText());
		
		System.out.println("O CAF da Cobra: " + caixaTextoSegundoCampoRecebido.getText());
		
		System.out.println("O TIPO DE VENENO da Cobra: " + caixaTextoTerceiroCampoRecebido.getText());	
		
		frameTelaCadastroCobra.setVisible(false);
		
		if(e.getActionCommand().equals("Voltar")){
			System.out.println("Voltar para o menu");
			telaMenuCobra.chamarTelaMenuCobra();
			}
		}
	}
	
	public void registrarArquivo(Cobra cobraConfirmacao) {
		
		
		if(cobraRepositorioImp.salvarCobra(cobraConfirmacao, peso.getText())){
			JOptionPane.showMessageDialog(null, "Dados salvos com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Nao foi possivel salvar os dados");
		
		
	}

}
	
	public Cobra populaCobra() {
		Cobra cobra = new Cobra();
		cobra.setNome(caixaTextoPrimeiroCampoRecebido.getText());
		cobra.setCaf(caixaTextoSegundoCampoRecebido.getText());
		cobra.setTipoVeneno(caixaTextoTerceiroCampoRecebido.getText());
		try {
			cobra.setEndereco(enderecoCliente.buscarEnderecoPeloCep(jTextcep.getText()));
		} catch (Exception e) {
			e.printStackTrace();
		}
		return cobra;
	}
}
