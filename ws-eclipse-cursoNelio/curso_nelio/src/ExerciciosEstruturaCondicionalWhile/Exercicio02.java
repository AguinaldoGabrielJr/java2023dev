package ExerciciosEstruturaCondicionalWhile;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		// Escreva um programa para ler as coordenadas (X,Y) de uma quantidade
		// indeterminada de pontos no
		// sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
		// O algoritmo será
		// encerrado quando pelo menos uma de duas coordenadas for NULA (nesta situação
		// sem escrever mensagem
		// alguma).

		Scanner sc = new Scanner(System.in);

		float x;
		float y;

		System.out.println("Por favor insira a coordenada X: ");
		x = sc.nextFloat();
		System.out.println("Por favor insira a coordenada Y: ");
		y = sc.nextFloat();

		while (x != 0 && y != 0) {

			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
			} else {
				System.out.println("Quarto");

			}
			System.out.println("Por favor insira a coordenada X: ");
			x = sc.nextFloat();
			System.out.println("Por favor insira a coordenada Y: ");
			y = sc.nextFloat();
		}

		sc.close();
	}

}