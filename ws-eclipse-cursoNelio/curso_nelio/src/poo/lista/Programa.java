package poo.lista;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {

	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);
	
	int qtdFuncionarios;
	List<Funcionario> funcionarios = new ArrayList<>();
	
	System.out.println("Quantos funcionários serão registrados? ");
	qtdFuncionarios = sc.nextInt();
	
	//Adicionar funcionário
	for (int i = 0; i < qtdFuncionarios; i++) {
		System.out.println("Funcionário #" + i + 1 + ":");
		System.out.printf("Id: ");
		int id = sc.nextInt();
		
		while (hasId(funcionarios, id)) {
			System.out.print("Id existente, tente novamente: ");
			id = sc.nextInt();
		}
		sc.nextLine();
		System.out.printf("Nome: ");
		String nome = sc.nextLine();
		System.out.printf("Salário: ");
		double salario = sc.nextDouble();
		sc.nextLine();
		Funcionario funcionario = new Funcionario(id, nome, salario);
		funcionarios.add(funcionario);
		System.out.println();
	}
	
	System.out.print("Digite o Id do funcionário que vai ganhar aumento: ");
	int idAumento = sc.nextInt();
	sc.nextLine();
	Funcionario emp = funcionarios.stream().filter(x -> x.getId() == idAumento).findFirst().orElse(null);
	
	if (emp == null) {
		System.out.println("Esse funcionário não existe....");
		System.out.println();
		System.out.println("Gostaria de tentar novamente? (S)sim e (N)não!!!");
		System.out.println();
		String tentativa = sc.nextLine();
		
		
		if (tentativa.equals("S")) {
			int idAumento2 = sc.nextInt();
			Funcionario emp2 = funcionarios.stream().filter(x -> x.getId() == idAumento2).findFirst().orElse(null);
		}
		System.out.print("Digite o Id do funcionário que vai ganhar aumento: ");
		
	}else {
		System.out.println("Qual a porcentagem do aumento?");
		double porcentagem = sc.nextDouble();
		emp.aumento(porcentagem);
	}
	
	//Mostrar funcionário
	System.out.println("Lista de funcionários: ");
	
	for (Funcionario objSaida : funcionarios) {
		System.out.println(objSaida);
	}
	
	
	
	sc.close();
	}

	private static boolean hasId(List<Funcionario> funcionarios, int id) {
		Funcionario emp = funcionarios.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}

}
