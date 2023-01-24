package poo.listas.exerciciosVetor;

import java.util.Iterator;
import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Quantos números serão inseridos? ");
		int num = sc.nextInt();

		int[] vetor = new int[num];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
		}

		System.out.println("NÙMEROS NEGATIVOS:");
		
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < 0) {
				System.out.println(vetor[i]);
			}
		}
		
		sc.close();
	}

}
