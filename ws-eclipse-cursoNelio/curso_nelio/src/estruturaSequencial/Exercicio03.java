package estruturaSequencial;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {

		// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir,
		// calcule e mostre a diferença do produto de A e B pelo produto de C e D
		// segundo
		// a fórmula: DIFERENCA = (A * B - C * D).

		Scanner sc = new Scanner(System.in);

		int a, b, c ,d, diferenca;
		
		System.out.println("Por favor insira o valor A: ");
		a = sc.nextInt();
		
		System.out.println("Por favor insira o valor B: ");
		b = sc.nextInt();
		
		System.out.println("Por favor insira o valor C: ");
		c = sc.nextInt();
		
		System.out.println("Por favor insira o valor D: ");
		d = sc.nextInt();
		
		diferenca = ((a *b) - (c * d));
		System.out.println("A diferença do produto A e B pelo produto de C e D é: " + diferenca);
		sc.close();

	}

}
