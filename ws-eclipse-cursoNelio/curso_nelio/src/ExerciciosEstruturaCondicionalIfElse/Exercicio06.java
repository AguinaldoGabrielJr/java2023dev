package ExerciciosEstruturaCondicionalIfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio06 {

	public static void main(String[] args) {
	//Você deve fazer um programa que leia um valor qualquer e apresente uma mensagem dizendo em qual dos
	//seguintes intervalos ([0,25], (25,50], (50,75], (75,100]) este valor se encontra. Obviamente se o valor
	//não estiver em nenhum destes intervalos, deverá ser impressa a mensagem “Fora de intervalo”.

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	double x;
	
	System.out.println("Insira um valor qualquer: ");
	x = sc.nextDouble();
	
	if (x <= 0 || x > 100) {
		System.out.println("Fora de intervalo...");
	}
	else if (x >= 75 && x <= 100){
		System.out.println("Intervalo [75,100]");
	}
	else if (x >= 50 && x < 75){
		System.out.println("Intervalo [50,75]");
	}
	else if (x > 25 && x < 50){
		System.out.println("Intervalo [25,50]");
	}
	else {
		System.out.println("Intervalo [0,25]");
	}
	
	sc.close();
	}

}