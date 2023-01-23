package construtoresSobrecargaEncapsulamento;

public class Product {

	String name;
	double price;
	int quantity;

	public Product() {
		
	}
	//Seguindo algumas regras posso ter métodos com estilos diferentes...
	 
	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}
	
	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity;
	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return "Product data: " + name + ", $" + String.format(" %.2f", price) + ", " + quantity + " units, Total: $ "
				+ String.format("%.2f%n", totalValueInStock());
	}

}
