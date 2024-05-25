package interacaoUsuario;

import java.util.Scanner;

import entidade.Carro;
import entidade.Moto;

public class CadastroVeiculo {
	Scanner entradaDados = new Scanner(System.in);
	
	
	public void cadastrarCarro() {
	
		Carro carroEntidade = new Carro();
		
		System.out.println("##### Dados do Carro #####");
		
		System.out.println("Digite o modelo: ");
		carroEntidade.setModelo(entradaDados.next());
		
		System.out.println("Digite a marca: ");
		carroEntidade.setMarca(entradaDados.next());
		
		System.out.println("Digite a cor: ");
		carroEntidade.setCor(entradaDados.next());
		
		System.out.println("Digite a quantidade Portas");
		carroEntidade.setNumeroPortas(entradaDados.next());
		
		System.out.println("##### Dados Recebidos #####");
		
		System.out.println("MODELO: " + carroEntidade.getModelo());
		System.out.println("MARCA: " + carroEntidade.getMarca());
		System.out.println("COR: " + carroEntidade.getCor());
		System.out.println("Quantidade de Portas: " + carroEntidade.getNumeroPortas());
			
	}
	
	public void cadastroMoto() {
		
		Moto motoEntidade = new Moto();
		
		System.out.println("##### Dados de moto #####");
		
		System.out.println("Digite o modelo: ");
		motoEntidade.setModelo(entradaDados.next());
		
		System.out.println("Digite a marca: ");
		motoEntidade.setMarca(entradaDados.next());
		
		System.out.println("Digite a cor: ");
		motoEntidade.setCor(entradaDados.next());
		
		System.out.println("Digite o tipo do Guidao: ");
		motoEntidade.setTipoGuidao(entradaDados.next());
		
		System.out.println("##### Dados Recebidos #####");
		
		System.out.println("MODELO: " + motoEntidade.getModelo());
		System.out.println("MARCA: " + motoEntidade.getMarca());
		System.out.println("COR: " + motoEntidade.getCor());
		System.out.println("TIPO DO GUIDAO: " + motoEntidade.getTipoGuidao());
		
		
	}
	
		
}
	
	
