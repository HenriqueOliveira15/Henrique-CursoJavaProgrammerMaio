import java.util.Scanner; // Objeto java Padrão para receber dados atraves do console.

public class Principal{
	
	public static void main(String[] args){

		Scanner entradaDeDados = new Scanner (System.in); 

		//Cadastro Cachorro

        	Cachorro objetoCachorro = new Cachorro();

        	System.out.println("Digite o nome do cachorro:");
        	objetoCachorro.nome = entradaDeDados.next();

        	System.out.println("Digite a idade do cachorro:");
        	
		objetoCachorro.idade = Integer.parseInt(entradaDeDados.next());

        	System.out.println("Digite a cor do pelo do cachorro:");

		objetoCachorro.corPelo = entradaDeDados.next();

        	System.out.println("Nome do cachorro: " + objetoCachorro.nome);
        	
		System.out.println("Idade do cachorro: " + objetoCachorro.idade);
	
		System.out.println("Cor do pelo do cachorro: " + objetoCachorro.corPelo);

		//Cadastro Galinha

		Galinha objetoGalinha = new Galinha();
		
		System.out.println("Digite o nome da galinha:");

		objetoGalinha.nome = entradaDeDados.next();

		System.out.println("Digite a idade da galinha:");

		objetoGalinha.idade = Integer.parseInt(entradaDeDados.next());

		System.out.println("Digite a cor da pena da galinha:");

		objetoGalinha.corPena = entradaDeDados.next();

		System.out.println("Nome da galinha: " + objetoGalinha.nome);

		System.out.println("Idade da galinha: " + objetoGalinha.idade);

		System.out.println("Cor da pena da galinha: " + objetoGalinha.corPena);
		
	}	
}