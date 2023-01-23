package poo.listas;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Insira quantas posições de altura irá incluir: ");
		int n = sc.nextInt();
		double[] vetor = new double[n];
		System.out.println();
		for (int i = 0; i < n; i++) {
			System.out.print("Insira a altura número " + (i + 1) + " = ");
			vetor[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < n; i++) {
			System.out.print("Altura posição " + (i + 1) + " = ");
			System.out.print(vetor[i]);
			System.err.println();
		}
		
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += vetor[i];
		}
		
		double media = soma / n;
		System.out.printf("AVERAGE HEIGHT = %.2f" ,media);
		sc.close();
	}

}
