package poo.membrosEstaticos;

import java.util.Locale;
import java.util.Scanner;

import poo.membrosEstaticos.util.CurrencyConverter;

public class MainConversion {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("What is the dollar price? ");
		double value = sc.nextDouble();
		
		System.out.print("How many dollar will be bought? ");
		double quantity = sc.nextDouble();
		
		System.out.println();
		double result = CurrencyConverter.converter(value, quantity);
		System.out.printf("Amount to be paid in reais = R$ %.2f" ,result);
		
		sc.close();
		
		
	}

}
