package poo;

import java.util.Iterator;

public class Main {

	public static void main(String[] args) {

		String[] vetor = new String[] { "Maria", "Bob", "João" };

		System.out.println("FOR PADRÂO");
		for (int i = 0; i < vetor.length; i++) {
			System.out.println(vetor[i]);
		}
		
		/* Sintaxe
		for (Tipo apelido : colecao ){ Exemplo abaixo
			<Comando 1>				   Tipo = String
			<Comando 2>				   apelido = obj
			<Comando n> 			   colecao = vetor
		}
		*/
		System.out.println("--------------------------------");
		System.out.println("FOR EACH");
		for (String obj : vetor) {
			System.out.println(obj);
		}
	}

}