package estruturaCondicional;

import java.util.Locale;
import java.util.Scanner;

public class Main {
	// do while

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double c, f;
		char confirma;

		do {
			System.out.println("Digite a temperatura em Celsius: ");
			c = sc.nextDouble();
			f = ((9.0 * c) / 5.0) + 32.0;
			System.out.printf("Equivalente em Fahrenheit: %.1f%n", f);
			System.out.print("Deseja repetir (s/n)");
			confirma = sc.next().charAt(0);
		} while (confirma != 'n');

		sc.close();
	}
}
