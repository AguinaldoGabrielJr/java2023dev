package poo.listas.exerciciosVetor;

import java.util.Iterator;
import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos valores iram ter cada vetor? ");
		int n = sc.nextInt();
		
		int[] vetorA = new int[n];
		int[] vetorB = new int[n];
		int[] vetorC = new int[n];
		
		System.out.println("Digite os valores do vetor A:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorA[i] = sc.nextInt();
		}
		
		System.out.println("Digite os valores do vetor B:");
		for (int i = 0; i < vetorA.length; i++) {
			vetorB[i] = sc.nextInt();
		}
		
		System.out.println("VETOR RESULTANTE COM SOMA: ");
		for (int i = 0; i < n; i++) {
			int soma = vetorA[i] + vetorB[i];
			System.out.println(soma);
		}
		
		System.out.println("VETOR RESULTANTE COM OUTRO VETOR: ");
		for (int i = 0; i < n; i++) {
			int c = vetorC[i]= vetorA[i] + vetorB[i];
			System.out.println(c);
		}
				
		sc.close();// TODO Auto-generated method stub

	}

}
