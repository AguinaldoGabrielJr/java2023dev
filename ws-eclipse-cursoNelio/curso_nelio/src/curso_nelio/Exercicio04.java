package curso_nelio;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

	//Fazer um programa que leia o número de um funcionário, seu número de horas
	//trabalhadas, o valor que recebe por hora e calcula o salário desse
	//funcionário. Mostre o número e o salário do funcionário, com duas casas decimais.
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int numFuncionario;
	int horas;
	double salario, total;
	
	System.out.println("Por favor entre com o número de identificação do funcionário:");
	numFuncionario = sc.nextInt();
	
	System.out.println("Por favor insira a quantidade de horas extras: ");
	horas = sc.nextInt();
	
	System.out.println("Por favor insira o valor do salário do funcionário: ");
	salario = sc.nextDouble();
	
	total = salario * horas;
	System.out.printf("NUMBER = %d%nSALARY = U$ %.2f", numFuncionario, total);
	sc.close();
	}

}
