package poo.Exercicios;

import java.util.Locale;
import java.util.Scanner;
import java.util.jar.Attributes.Name;

public class MainExercicio02 {

	public static void main(String[] args) {
		/*Fazer um programa para ler os dados de um funcionário (nome, salário bruto e imposto). Em seguida, 
		 mostrar os dados do funcionário (nome e salário líquido). Em seguida, aumentar o salário do funcionário 
		 com base em uma porcentagem dada (somente o salário bruto é afetado pela porcentagem) e mostrar
		 novamente os dados do funcionário. Use a classe projetada abaixo. */
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Employee employee = new Employee();
		
		System.out.print("Name: ");
		employee.name = sc.nextLine();
		System.out.print("Gross salary: ");
		employee.grossSalary = sc.nextDouble();
		System.out.print("Tax: ");
		employee.tax = sc.nextDouble();
		
		System.out.println();
		System.out.println("Employee: " + employee);
		System.out.println();
		System.out.print("Which percentage to increase salary? ");
		double percentage = sc.nextDouble();
		employee.increaseSalary(percentage);
		
		System.out.println();
		System.out.println("Updated data: " + employee);
		
		sc.close();
		

	}

}
