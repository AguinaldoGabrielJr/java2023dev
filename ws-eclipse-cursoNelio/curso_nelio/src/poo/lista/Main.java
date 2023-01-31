package poo.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Quantos funcionários serão inseridos: ");
		int num = sc.nextInt();

		List<ExercicioFuncionario> funcionarios = new ArrayList<>();

		for (int i = 0; i < num; i++) {
			System.out.print("Funcinário código #" + (i + 1) + ":\n");
			System.out.print("Id: ");
			int id = sc.nextInt();
			sc.nextLine();

			while (idExistente(funcionarios, id)) {
				System.out.print("Id existente, tente novamente:  ");
				id = sc.nextInt();
				sc.nextLine();
			}

			System.out.print("Nome: ");
			String nome = sc.nextLine();
			System.out.print("Salário: ");
			double salario = sc.nextDouble();

			funcionarios.add(new ExercicioFuncionario(id, nome, salario));
		}
		
		System.out.print("Qual o código do funcionário que receberá aumento: ");
		int id = sc.nextInt();
		
		ExercicioFuncionario emp = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			System.out.println("Esse id não existe!");
		}else {
			System.out.print("Qual a porcentagem do aumento do funcionário? ");
			double aumento = sc.nextDouble();
			emp.aumentoSalario(aumento);
			
		}
		
		for (ExercicioFuncionario objSaida : funcionarios) {
			System.out.println(objSaida);
		}
		
		sc.close();

	}

	public static boolean idExistente(List<ExercicioFuncionario> list, int id) {
		ExercicioFuncionario func = list.stream().filter(x -> x.getId() == id).findAny().orElse(null);
		return func != null;
	}
	
	
}
