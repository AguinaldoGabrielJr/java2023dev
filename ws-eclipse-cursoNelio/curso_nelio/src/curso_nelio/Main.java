package curso_nelio;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

		// Saida de dados
		// Concatenar elementos

		String nome = "Guina";
		int idade = 36;
		double salario = 5000;

		
		// %f = ponto flutuante
		// %d = inteiro
		// %s = texto
		// %n = quebra de linha
		
		
		System.out.printf("%s tem %d anos e ganha R$ %.2f ", nome, idade, salario);
		System.out.println();
		System.out.println("Meu nome é: " + nome + " e meu salário é R$ " + salario + ".");

	}

}
