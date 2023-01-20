package exerciciosEstruturaCondicionalFor;

import java.util.Scanner;

public class Exercicio06 {
	// Ler um número inteiro N e calcular todos os seus divisores.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 1; i <= n; i++) {
			int x = n % i;
			if (x == 0) {
				System.out.println(i);
			}
		}
		sc.close();
	}

}
