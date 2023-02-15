package poo.listas.exerciciosVetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quantas pessoas? ");
		int n = sc.nextInt();
		sc.nextLine();
		
		PessoaExercicio3[] vetor = new PessoaExercicio3[n];
		
		double media = 0.0;
		double porcentagemMenores;
		int menores = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.println("Dados da " + (i + 1) + "º pessoa:");
			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Idade: ");
			int idade = sc.nextInt();
			System.out.print("Altura: ");
			double altura = sc.nextDouble();
			sc.nextLine();
			vetor[i] = new PessoaExercicio3(nome, idade, altura);
			
			if (vetor[i].getIdade() < 16) {
				menores ++ ;
			}
		}
		
		for (int i = 0; i < vetor.length; i++) {
			media += vetor[i].getAltura() / n;
		}
		
		System.out.println();
		System.out.printf("Altura média: %.2f", media);
		System.out.println();
		porcentagemMenores = (((double)menores / n) * 100.0);
		System.out.println("Pessoas com menos de 16 anos: " + porcentagemMenores + "%");
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i].getIdade() < 16) {
				System.out.println(vetor[i].getNome());
			}
		}
		
		sc.close();
	}

}
