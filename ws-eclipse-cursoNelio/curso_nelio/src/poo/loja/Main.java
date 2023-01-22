package poo.loja;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data: ");
		System.out.print("Name: ");
		product.name = sc.next();
		System.out.print("Price: ");
		product.price = sc.nextDouble();
		System.out.println("Quantity in stock: ");
		product.quantity = sc.nextInt();
		
		/*String name = product.name;
		double price = product.price;
		int quantity = product.quantity;
		
		Mostrando com formatação por aqui
		System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ " ,name, price, quantity );
		System.out.printf("%.2f%n" ,product.totalValueInStock());
		
		Mostra o endereço por padrão, com a modificação que eu fiz na própria classe vem da forma que eu quero*/
		System.out.println(product);	
		
		System.out.println();
		System.out.print("Enter the number of products to be added in stock: ");
		int quantity = sc.nextInt();
		product.addProducts(quantity);
		
		System.out.println();
		System.out.println("Update data : " + product);
		
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		int quantity2 = sc.nextInt();
		product.removeProducts(quantity2);
		
		System.out.println();
		System.out.println("Update data : " + product);
		
		sc.close();
	}

}
