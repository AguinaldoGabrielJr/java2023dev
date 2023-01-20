package exerciciosEstruturaCondicionalIfElse;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {

		// Fazer um programa para ler um número inteiro, e depois dizer se este número é
		// negativo ou não.

		Scanner sc = new Scanner(System.in);
		int a;

		System.out.println("Insira um número inteiro: ");
		a = sc.nextInt();

		if (a < 0) {
			System.out.println("NEGATIVO...");
		} else {
			System.out.println("NÃO NEGATIVO...");
		}

		sc.close();
	}

}
