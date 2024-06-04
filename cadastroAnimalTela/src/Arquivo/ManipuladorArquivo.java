package Arquivo;

import java.io.BufferedWriter;
import java.io.FileWriter;

import entidades.Animal;
import entidades.Cachorro;
import entidades.Cobra;

public class ManipuladorArquivo {
	
	
	
	public void registrarCachorro (Cachorro cachorro) {
		
		String enderecoArquivo = "D:\\CursoJavaProgrammerMaio\\Henrique-CursoJavaProgrammerMaio\\cadastroAnimalTela\\registroAnimais.txt";
		
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
	

	public void registrarCobra (Cobra cobra) {
	
	String enderecoArquivo = "D:\\CursoJavaProgrammerMaio\\Henrique-CursoJavaProgrammerMaio\\cadastroAnimalTela\\registroAnimais.txt";
	
	try {
		
		BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(enderecoArquivo));
		
		bufferedWriter.append("O NOME  da cobra é: " + Animal.getNome());
		bufferedWriter.newLine();
		bufferedWriter.append("O CAF da cobra é: " + Animal.getCaf());
		bufferedWriter.newLine();
		bufferedWriter.append("O TIPO DE VENENO da cobra é: " + Cobra.getTipoVeneno());
		
		bufferedWriter.close();
			
	} catch (Exception e) {
		System.out.println("Erro ao registrar a Cobra!!"); 
	}
}


}
