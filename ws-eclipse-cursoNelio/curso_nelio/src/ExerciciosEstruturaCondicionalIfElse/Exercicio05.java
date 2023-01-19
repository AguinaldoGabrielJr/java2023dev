package ExerciciosEstruturaCondicionalIfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio05 {

	public static void main(String[] args) {
	//Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item.
	//A seguir, calcule e mostre o valor da conta a pagar...
	
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int cod, qtd;
	double total;
	
	System.out.println("Código do item:");
	cod = sc.nextInt();
	
	System.out.println("Quantidade do item:");
	qtd = sc.nextInt();
	
	if (cod <= 0 || cod > 5) {
		System.out.println("Não existe esse código nos nossos produtos");
	}
	else if (cod == 1) {
		total = (qtd * 4.00);
		System.out.printf("%d dog(s), valor total de R$ %.2f ", qtd, total);
	}
	else if (cod == 2) {
		total = (qtd * 4.50);
		System.out.printf("%d X-Salada(s), valor total de R$ %.2f ", qtd, total);
	}
	else if (cod == 3) {
		total = (qtd * 5.00);
		System.out.printf("%d X-Bacon(s), valor total de R$ %.2f ", qtd, total);
	}
	else if (cod == 4) {
		total = (qtd * 2.00);
		System.out.printf("%d Torrada simples, valor total de R$ %.2f ", qtd, total);
	}
	else if (cod == 5) {
		total = (qtd * 1.50);
		System.out.printf("%d Refrigerante(s), valor total de R$ %.2f ", qtd, total);
	}
	
	//System.out.println("Total");
	
	
	
	sc.close();

	}

}
