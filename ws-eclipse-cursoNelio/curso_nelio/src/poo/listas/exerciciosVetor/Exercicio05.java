package poo.listas.exerciciosVetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
				
		System.out.println("Insira a quantidade de número reais: ");
		int n = sc.nextInt();
		
		double[] vetor = new double[n];
		int posicaoMaiorValor = 0;
		double maiorValor = 0f;
		
		for (int i = 0; i < vetor.length; i++) {
			System.out.print("Digite um número: ");
			vetor[i] = sc.nextDouble();
		}
		
		for (int i = 0; i < vetor.length; i++) {
			double aux = vetor[i];
			if (maiorValor < vetor[i]) {
				maiorValor = aux;
				posicaoMaiorValor = i;
			}
		}
		
		System.out.println();
		System.out.print("MAIOR VALOR = " + maiorValor);
		System.out.println();
		System.out.print("POSIÇÃO DO MAIOR VALOR = " + posicaoMaiorValor);
			
		sc.close();
	}

}
