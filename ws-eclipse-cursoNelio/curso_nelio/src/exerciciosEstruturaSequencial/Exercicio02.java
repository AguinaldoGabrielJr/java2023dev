package exerciciosEstruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {

		// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o
		// valor
		// da área deste círculo com quatro casas decimais conforme exemplos.
		// Fórmula da área: area = π . raio2, considere o valor de π = 3.14159 ...

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double raio;
		double area;
		double pi = 3.14159;

		
		System.out.println("Por favor o valor do raio do circulo: ");
		raio = sc.nextDouble();

		area = (pi * (raio * raio)); 
		System.out.printf("Área igual a %.4f", area);
		sc.close();
	}

}
