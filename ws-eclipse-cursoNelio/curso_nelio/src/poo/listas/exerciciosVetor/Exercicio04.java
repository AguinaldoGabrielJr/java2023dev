package poo.listas.exerciciosVetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos número voçê vai digitar? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		int totalPar = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			
			if (vetor[i] % 2 == 0) {
				totalPar ++;
			}
		}
		
		System.out.println();
		System.out.println("NÚMEROS PARES: ");
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] % 2 == 0) {
				System.out.print(vetor[i]);
				System.out.print(" ");
			}
		}
		System.out.println();
		System.out.println();
		System.out.println("QUANTIDADE DE PARES = " + totalPar);
		sc.close();
	}

}
