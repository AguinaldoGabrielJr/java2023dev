package poo.listas.exerciciosVetor;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicio3 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		Estudante[] vetor = new Estudante[10];

		System.out.print("Quantos quartos serão alugados?");
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			System.out.println("Quarto " + (i + 1) + ".");
			System.out.print("Nome: ");
			sc.nextLine();
			String nome = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Room: ");
			int numeroQuarto = sc.nextInt();

			vetor[numeroQuarto] = new Estudante(nome, email);
		}

		System.out.println();
		System.out.println("Quartos ocupados: ");
		for (int i = 0; i < 10; i++) {
			if (vetor[i] != null) {
				System.out.println(i + ": " + vetor[i]);
			}

		}

		sc.close();
	}
}
