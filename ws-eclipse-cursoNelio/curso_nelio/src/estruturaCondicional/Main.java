package estruturaCondicional;

import java.util.Scanner;

public class Main {
	// Utilização do for
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Insira a quantidade de repetições:");
		int quantidade = sc.nextInt();
		int soma = 0;
		;

		for (int i = 0; i < quantidade; i++) {
			System.out.println("Por favor insira um número: ");
			int x = sc.nextInt();
			soma = soma + x;
		}
		System.out.println(soma);

		for (int i = 0; i < 1005; i++) {
			System.out.println("Valor de i: " + 1);
		}
		 sc.close();
	}

}