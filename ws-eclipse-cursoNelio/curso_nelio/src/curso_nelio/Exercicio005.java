package curso_nelio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio005 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		// Fazer um programa para ler o código de uma peça 1, o número de peças 1, o
		// valor unitário de cada peça 1, o
		// código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2.
		// Calcule e mostre o valor a ser pago.

		int codPeca1, codPeca2, qtdPeca1, qtdPeca2;
		double valorPeca1, valorPeca2, total;

		System.out.println("Por favor insira o código da peça:");
		codPeca1 = sc.nextInt();
		System.out.println("Por favor insira a quantidade:");
		qtdPeca1 = sc.nextInt();
		System.out.println("Por favor insira o valor da peça:");
		valorPeca1 = sc.nextDouble();

		System.out.println("Por favor insira o código da peça:");
		codPeca2 = sc.nextInt();
		System.out.println("Por favor insira a quantidade:");
		qtdPeca2 = sc.nextInt();
		System.out.println("Por favor insira o valor da peça:");
		valorPeca2 = sc.nextDouble();

		total = ((qtdPeca1 * valorPeca1) + (qtdPeca2 * valorPeca2));

		System.out.printf("VALOR A PAGAR : R$ %.2f", total);

		sc.close();
	}
}
