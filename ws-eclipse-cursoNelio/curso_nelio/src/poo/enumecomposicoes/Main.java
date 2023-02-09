package poo.enumecomposicoes;

import java.util.Date;

import poo.enumecomposicoes.entidades.Order;
import poo.enumecomposicoes.entidades.enums.OrderStatus;

public class Main {

	public static void main(String[] args) {

		Order order = new Order(1080, new Date(), OrderStatus.PENDING_PAYMENT);
		
		System.out.println(order);
		
		OrderStatus os1 = OrderStatus.DELIVERED;
		
		OrderStatus os2 = OrderStatus.valueOf("DELIVERED");
		
		System.out.println(os1);
		System.out.println(os2);
	}
}
