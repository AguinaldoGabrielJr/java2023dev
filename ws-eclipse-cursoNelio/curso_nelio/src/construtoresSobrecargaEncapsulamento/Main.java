package construtoresSobrecargaEncapsulamento;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		/*Modificadores de acesso
		• https://docs.oracle.com/javase/tutorial/java/javaOO/accesscontrol.html
		• private: o membro só pode ser acessado na própria classe
		• (nada): o membro só pode ser acessado nas classes do mesmo pacote
		• protected: o membro só pode ser acessado no mesmo pacote, bem como em
		subclasses de pacotes diferentes
		• public: o membro é acessado por todas classes (ao menos que ele*/
		
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
