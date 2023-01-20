package exerciciosEstruturaCondicionalIfElse;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio08 {

	public static void main(String[] args) {

	//IR
	//0.00 a 2k isento
	//2k+ a 3k 8%
	//3k+ a 4500 18%
	//acima de 4500 28%
		
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	double salario, imposto;
	
	System.out.println("Por favor insira um salário: ");
	salario = sc.nextDouble();
	
	
	if (salario < 0.0) {
		System.out.println("Esta pessoa não esta qualificada para pagar IR...");
	}else if (salario >= 0.0 && salario <= 2000.00) {
		System.out.println("Você esta isento do IR...");
	}else if (salario > 2000.00 && salario <= 3000.00) {
		imposto = ((salario - 2000.00) * 0.08);
		System.out.println("Sua alicota de IR é 8%");
		System.out.printf("%nO seu salário é R$ %.2f e você pagará R$ %.2f de IR." , salario, imposto);
	}else if (salario > 3000.00 && salario <= 4500.00) {
		imposto = ((salario - 2000.00) * 0.18);
		System.out.println("Sua alicota de IR é 18%");
		System.out.printf("%nO seu salário é R$ %.2f e você pagará R$ %.2f de IR." , salario, imposto);
	}else {
		imposto = (salario - 4500.0) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
		System.out.println("Sua alicota de IR é 28%");
		System.out.printf("%nO seu salário é R$ %.2f e você pagará R$ %.2f de IR." , salario, imposto);
	}
	
	
	System.out.println();
	
	
	sc.close();
	}

}
