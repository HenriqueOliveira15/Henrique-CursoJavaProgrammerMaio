package cadastroCachorro;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		
		Cachorro objetoCachorro = new Cachorro();
		
		Scanner entradaDados = new Scanner (System.in);
		
		System.out.println("Digite o Nome do cachorro: ");
		objetoCachorro.nome  = entradaDados.next();
		
		System.out.println("Digite a Idade do cachorro: ");
		objetoCachorro.idade = Integer.parseInt(entradaDados.next());
		
		System.out.println("Digite o peso do cachorro: ");
		objetoCachorro.peso = Double.parseDouble(entradaDados.next());
		
		objetoCachorro.preco = calcularPreco(objetoCachorro.peso);
		
		imprimirResultadosNoConsole(objetoCachorro);

	}
	
	public static void imprimirResultadosNoConsole(Cachorro cachorro) {
		System.out.println("Nome do Cachorro: " + cachorro.nome);
		System.out.println("Idade do Cachorro: " + cachorro.idade);
		System.out.println("Peso do cachorro: " + cachorro.peso);
		System.out.println("Preço do cachorro: " + cachorro.preco);

	}
	
	public static Double calcularPreco(double peso){
		
		double preco = peso * 50;
		
		return preco;
		
	}
	

}
