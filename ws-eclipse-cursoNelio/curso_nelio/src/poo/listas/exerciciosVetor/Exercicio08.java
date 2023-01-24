package poo.listas.exerciciosVetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {
 
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int somaPares = 0;
		int naoPares = 0;
		double mediapares;
		
		System.out.print("Qantos elementos vai ter o vetor? ");
		int n = sc.nextInt();
		int[] vetor = new int[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextInt();
			
		}
		
		for (int i = 0; i < n; i++) {
			if (vetor[i] % 2 == 0) {
				somaPares = somaPares + vetor[i];
				naoPares++;
			}
		}
		
		if (naoPares == 0) {
			System.out.println("NENHUM NÚMERO PAR");
		}else {
			mediapares = somaPares / naoPares;
			 System.out.printf("MEDIA DOS PARES = %.1f\n", mediapares);
		}
			
		sc.close();
	}
}
