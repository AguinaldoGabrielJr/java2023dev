package ExerciciosEstruturaCondicionalIfElse;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
	//Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
		
	Scanner sc = new Scanner(System.in);
	
	int num;
	
	num = sc.nextInt();
	//Dentro do if não dá certo divisão com barra pela questão do resto
	if ((num % 2) == 0) {
		System.out.println("PAR");
	}else {
		System.out.println("IMPAR");
	}
	
	if (num / 2 < 1) {
		System.out.println("Teste");
	}else {
		System.out.println("Teste2");
	}
	
	sc.close();
	
	}

}
