package poo.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class mainExercicio01 {

	public static void main(String[] args) {
		/*Fazer um programa para ler os valores da largura e altura de um retângulo. Em seguida, mostrar na tela
		o valor de sua área, perímetro e diagonal. Usar uma classe como mostrado no projeto ao lado.*/
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Rectangle rectangle = new Rectangle();
		
		System.out.println("Enter rectangle width and height:");
		rectangle.height = sc.nextDouble();
		rectangle.width = sc.nextDouble();
		
		System.out.println(rectangle);
		System.out.println(rectangle.toString());
		sc.close();
	}

}
