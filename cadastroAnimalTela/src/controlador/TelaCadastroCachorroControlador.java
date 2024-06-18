package controlador;

import java.awt.Window;
import java.awt.event.ActionEvent;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
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

	DaoCachorro daoCachorro = new DaoCachorro();
	CachorroRepositorioImp cachorroRepositorioImp = new CachorroRepositorioImp();
	TelaMenuCachorro telaMenuCachorro = new TelaMenuCachorro();
	
	
	
	
	public TelaCadastroCachorroControlador(JTextField caixaTextoPrimeiroCampoRecebido,
			JTextField caixaTextoSegundoCampoRecebido, JTextField caixaTextoTerceiroCampoRecebido, JFrame frameTelaCadastroCachorro, JTextField peso) {
		this.caixaTextoPrimeiroCampoRecebido = caixaTextoPrimeiroCampoRecebido;
		this.caixaTextoSegundoCampoRecebido = caixaTextoSegundoCampoRecebido;
		this.caixaTextoTerceiroCampoRecebido = caixaTextoTerceiroCampoRecebido;
		this.frameTelaCadastroCachorro = frameTelaCadastroCachorro;
		this.peso = peso;
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getActionCommand().equals("Enviar")) {
			registrarArquivo(); // chamando o metodo de registrar o arquivo

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
	
	
	
	public void registrarArquivo() {
		
		Cachorro cachorro = new Cachorro();
		
		cachorro.setNome(caixaTextoPrimeiroCampoRecebido.getText());
		cachorro.setCaf(caixaTextoSegundoCampoRecebido.getText());
		cachorro.setCorPelo(caixaTextoTerceiroCampoRecebido.getText());
		
		if(cachorroRepositorioImp.salvarCachorro(cachorro, peso.getText())){
			JOptionPane.showMessageDialog(null, "Dados salvo com sucesso");
		}else {
			JOptionPane.showMessageDialog(null, "Nao foi possivel salvar os dados");
		
		
	}

	}
}
