package entities;

import java.util.Date;

public class Cliente {

	private String name;
	private String email;
	private Date birthDate;
	private Order order;

	public Cliente() {
		Order order = new Order();
	}

	public Cliente(String name, String email, Date birthDate, Order order) {
		this.name = name;
		this.email = email;
		this.birthDate = birthDate;
		this.order = order;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Date getBirthDate() {
		return birthDate;
	}

	public void setBirthDate(Date birthDate) {
		this.birthDate = birthDate;
	}

	public Order getOrder() {
		return order;
	}

	public void setOrder(Order order) {
		this.order = order;
	}

}
