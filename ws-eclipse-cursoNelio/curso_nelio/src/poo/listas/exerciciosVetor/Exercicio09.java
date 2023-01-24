package poo.listas.exerciciosVetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio09 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.print("Quantas pessoas você vai digitar? ");		
		int n = sc.nextInt();
		sc.nextLine();
		
		int aux = 0;
		String velho = "";
		PessoaExercicio9[] vetor = new PessoaExercicio9[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Dados da " + ( i + 1 ) + "º pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			sc.nextLine();
			
			vetor[i] = new PessoaExercicio9(nome, idade);
		}
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() > aux ){
				velho = vetor[i].getNome();
			}
		}
		System.out.print("PESSOA MAIS VELHA: " + velho );

		sc.close();
	}

}
