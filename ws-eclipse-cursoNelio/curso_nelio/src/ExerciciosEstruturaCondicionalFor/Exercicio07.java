package ExerciciosEstruturaCondicionalFor;

import java.util.Scanner;

public class Exercicio07 {
	//Fazer um programa para ler um número inteiro positivo N. O programa deve então mostrar na tela N linhas
	//,	começando de 1 até N. Para cada linha, mostrar o número da linha, depois o quadrado e o 
	//cubo do valor, conforme exemplo.

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int quadrado = 0;
		int cubo = 0;
		
		for (int i = 1; i <= n; i++) {
			quadrado = i * i;
			cubo = i * i * i;
			
			System.out.printf("%d %d %d%n", i, quadrado, cubo);
		}
		
		sc.close();
	}

}
