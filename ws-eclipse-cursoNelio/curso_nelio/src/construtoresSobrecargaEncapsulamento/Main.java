package construtoresSobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter product data:");
		System.out.print("Name: ");
		String name = sc.nextLine();
		
		System.out.print("Price: ");
		double price = sc.nextDouble();
		
		System.out.print("Quantity in stock: ");
		int quantity = sc.nextInt();
		
		Product product = new Product(name, price, quantity);
		Product product2 = new Product(name, price, quantity);
		
		/*Exemplo de mudança de encapsulamento
		product2.name = "Computer"; Não tem acesso pois esta como private, deve se usar método acessor
		product2.setName("X");*/
		
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
