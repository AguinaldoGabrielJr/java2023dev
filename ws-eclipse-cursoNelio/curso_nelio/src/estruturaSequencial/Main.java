package estruturaSequencial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Expressão condicional ternaria

		//Exemplo com if
		double preco = 34.50, desconto;
		
		if (preco < 20.0) {
			desconto = preco * 0.1;
		}else {
			desconto = preco * 0.05;
		}
		
		System.out.println("Com if " + desconto);
		
		//Exemplo ternário
		double preco2 = 34.50, desconto2;
		
		desconto2 = (preco < 20.0) ? (preco * 0.1) : (preco *0.05) ;
		System.out.println("Ternário " + desconto2);
		
		
		

	}

}
