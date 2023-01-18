package curso_nelio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Entrada de dados

		Scanner sc = new Scanner(System.in);

		String x;
		int y;
		double f;
		char c, d;
		
		System.out.println("Por favor digite algo: ");
		x = sc.next();
		
		System.out.println("Por favor digite um número inteiro: ");
		y = sc.nextInt();
		
		System.out.println("Por favor digite um número: ");
		f = sc.nextDouble();
		
		System.out.println("Por favor digite algo(Irá aparecer somente a posição zero: ");
		c = sc.next().charAt(0);
		
		System.out.println("Por favor digite algo(Irá aparecer somente a posição hum: ");
		d = sc.next().charAt(1);

		System.out.println("Você digitou: " + x);
		System.out.println("Você digitou: " + y);
		System.out.println("Você digitou: " + f);
		System.out.println("Você digitou: " + c);
		System.out.println("Você digitou: " + d);
		
		sc.close();
	}

}
