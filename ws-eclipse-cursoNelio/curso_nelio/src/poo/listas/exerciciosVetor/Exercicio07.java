package poo.listas.exerciciosVetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio07 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos elementos o vetor terá? ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		double mediaVetor = 0f;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		for (int i = 0; i < vetor.length; i++) {
			mediaVetor += vetor[i] /  n;
		}
		
		System.out.println();
		System.out.printf("MEDIA DO VETOR = %.3f", mediaVetor );
		System.out.println();
		System.out.println("ELEMENTOS ABAIXO DA MEDIA: ");
		for (int i = 0; i < vetor.length; i++) {
			if (vetor[i] < mediaVetor) {
				System.out.println(vetor[i]);
			}
		}
				
		sc.close();
	}
}
