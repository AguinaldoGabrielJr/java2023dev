package exerciciosEstruturaCondicionalFor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {
	//Fazer um programa para ler um número N. Depois leia N pares de números e mostre a divisão do primeiro pelo
	//segundo. Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".
	
	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		for (int i = 0; i < n; i++) {
			
			float a = sc.nextInt();
			float b = sc.nextInt();
			
			float divisao;
			
			divisao = a / b;

			if (b == 0) {
				System.err.println("divisão impossivel");
			}else {
				System.out.printf("%.1f",divisao);
			}
			
		}
		
		sc.close();

	}
}