package curso_nelio;

import java.util.Scanner;

public class Exercicio01Secao4 {

	public static void main(String[] args) {
		//Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma 
		//desses números com uma mensagem explicativa, conforme exemplos
		//PDF exercicios1-estrutura-sequencial
		
		Scanner sc = new Scanner(System.in);
		
		int a;
		int b;
		int c;
		
		System.out.println("Por favor insira o valor A: ");
		a = sc.nextInt();
		
		System.out.println("Por favor insira o valor B: ");
		b = sc.nextInt();
		
		System.out.println(a);
		System.out.println(b);
		
		c = (a + b);
		
		System.out.println("A soma dos valores A + B é: " + c);

		sc.close();
	}

}
