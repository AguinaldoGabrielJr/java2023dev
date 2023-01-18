package estruturaCondicional;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Estrutura condicional if else

		// Simples
		System.out.println("Estrutura simples, se for verdadeira executa senão não faz nada...\n");

		int hora;

		Scanner sc = new Scanner(System.in);
		System.out.println("Que horas são?");
		hora = sc.nextInt();

		System.out.println("======================SIMPLES=========================");
		if (hora < 12) {
			System.out.println("Bom dia");
		}

		// Composta
		System.out.println("Estrutura composta, se for verdadeira executa o se, senão o outro...\n");

		System.out.println("======================COMPOSTA=========================");
		if (hora < 12) {
			System.out.println("Bom dia");
		} else {
			System.out.println("Boa tarde");
		}

		// Encadeada
		System.out.println("Estrutura composta encadeada, se for verdadeira executa o se, senão o outro...\n");

		System.out.println("======================ENCADEADA=========================");
		if (hora < 12) {
			System.out.println("Bom dia");
		} else if (hora < 18) {
			System.out.println("Boa tarde");
		} else {
			System.out.println("Boa noite");
		}

		sc.close();
	}
}
