package entities;

public class OrderItem {

	private Integer quantity;
	private Double price;

	private Product product;

	public OrderItem() {
	}

	public OrderItem(Integer quantity, Double price, Product product) {
		this.quantity = quantity;
		this.price = price;
		this.product = product;
	}

	public double subTotal() {
		return quantity * price;
	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

}
