package construtoresSobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Product product = new Product();
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = product.name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = product.price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = product.quantity = sc.nextInt();
		
		double totalValue = product.totalValueInStock();
		System.out.println();
		
		System.out.println(product);
		//System.out.printf("Product data: %s, $ %.2f, %d units, Total: $ %.2f" , name, price, quantity, totalValue);
		
		System.out.print("Enter the number of products to be added in stock: ");
		product.addProducts(sc.nextInt());
		System.out.println();
		
		System.out.print(product);
		System.out.println();
		System.out.print("Enter the number of products to be removed from stock: ");
		product.removeProducts(sc.nextInt());
		System.out.println();
		System.out.println(product);
		sc.close();
	}

}
