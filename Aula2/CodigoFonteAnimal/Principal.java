import java.util.Scanner; // Objeto java Padrão para receber dados atraves do console.

public class Principal{
	
	public static void main(String[] args){

		Scanner entradaDeDados = new Scanner (System.in); 
	
		Animal objetoAnimal = new Animal(); 
		
		System.out.println("Digite o nome do Animal:");  
		
		objetoAnimal.nomeAnimal = entradaDeDados.next();  

		System.out.println("O nome do Animal: " + objetoAnimal.nomeAnimal);

		System.out.println("Digite a idade do Animal: ");
		
		objetoAnimal.idadeAnimal = Integer.parseInt(entradaDeDados.next());

		System.out.println("A idade do animal: " + objetoAnimal.idadeAnimal); 
		
	}	
}