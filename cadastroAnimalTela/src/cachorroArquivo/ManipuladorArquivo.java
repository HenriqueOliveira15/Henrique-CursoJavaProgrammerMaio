package cachorroArquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;

import entidades.Animal;
import entidades.Cachorro;

public class ManipuladorArquivo {
	
	
	
public void registrarCachorro (Cachorro cachorro) {
		
		String enderecoArquivo = "D:\\CursoJavaProgrammerMaio\\Henrique-CursoJavaProgrammerMaio\\cadastroAnimalTela\\registroCachorros.txt";
		
		try {
			
			BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
			
			bufferedWriter.append("O NOME  do cachorro é: " + Animal.getNome());
			bufferedWriter.newLine();
			bufferedWriter.append("O CAF do cachorro é: " + Animal.getCaf());
			bufferedWriter.newLine();
			bufferedWriter.append("A COR DO PELO do cachorro é: " + Cachorro.getCorPelo());
			
			bufferedWriter.close();
				
		} catch (Exception e) {
			System.out.println("Erro ao registrar o Cachorro!!"); 
		}
	}
	
}
