package poo.membrosEstaticos.util;

public class CurrencyConverter {
	
	static double IOF = 0.06;
	
	public static double converter(double dollarPrice, double quantityDollar) {
		double amount = (dollarPrice * quantityDollar) + ((dollarPrice * quantityDollar) * IOF) ;
		return amount;
		
	}
}
