package interacaoUsuario;

import java.util.Scanner;

public class Menu {
	
	Scanner entradaDados = new Scanner(System.in);
	
	public void menuInicial() {
		
		
		CadastroVeiculo cadastroVeiculo = new CadastroVeiculo();
		
		
		System.out.println("Digite 1 para CARRO e Qualquer Tecla para Moto");
		int opcao = Integer.parseInt(entradaDados.next());
		
		
		if(opcao == 1) { // SE A OPÇÃO DIGITADA FOR 1
			cadastroVeiculo.cadastrarCarro();// VAI EXECUTAR ESSA LINHA
		}
		if(opcao == 2) {
			cadastroVeiculo.cadastroMoto();
		}
		
		if(opcao != 1 || opcao != 2) {
			System.out.println("Escolha entre um ou dois");
		}
		
		
	}

}