package poo.listas.exerciciosVetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Quanto números voçê vai digitar? ");
		int num = sc.nextInt();
		
		double [] vetor = new double[num];
		double soma = 0;
		double aux = 0;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			double x = sc.nextDouble();
			vetor[i] = x;
		}
		
		System.out.println();
		System.out.print("Valores = ");
		for (int i = 0; i < vetor.length; i++) {
			System.out.print(vetor[i] + "  ");
			aux = vetor[i];
			soma += vetor[i];
		}
		
		System.out.println();
		System.out.println("SOMA = " +soma);
		System.out.println("MÉDIA = " + soma / num);
		sc.close();
	}

}
