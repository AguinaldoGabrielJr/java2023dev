package poo.listas;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicio2 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Insira N: ");
		int n = sc.nextInt();
		
		Product[] vectProd = new Product[n];
		
		for (int i = 0; i < vectProd.length; i++) {
			sc.nextLine();
			String name = sc.nextLine();
			double price = sc.nextDouble();
			vectProd[i] = new Product(name, price);
		}
		
		double sum = 0.0;
		for (int i = 0; i < vectProd.length; i++) {
			sum += vectProd[i].getPrice();
		}
		double avg = sum / vectProd.length;
		
		System.out.printf("AVERAGE PRICE = %.2f%n" , avg);
		sc.close();
	}

}
