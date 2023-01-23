package construtoresSobrecargaEncapsulamento.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Banco banco;

		System.out.print("Enter account number: ");
		int numConta = sc.nextInt();
		System.out.print("Enter account holder: ");
		sc.nextLine();
		String nome = sc.nextLine();
		System.out.print("Is there na initial deposit (y/n)? ");
		char auxConfirma = sc.next().charAt(0);

		if (auxConfirma =='y') {
			System.out.println("Enter initial deposite value: ");
			double depositoInicial = sc.nextDouble();
			banco = new Banco(numConta, nome, depositoInicial);

		} else {
			banco = new Banco(numConta, nome);
		}
		System.out.println();
		System.out.println("Account data: ");
		System.out.println(banco);
		
		System.out.println();
		System.out.println("Enter a deposit value:");
		double deposito = sc.nextDouble();
		banco.deposito(deposito);
		System.out.println("Updated account data:");
		System.out.println(banco);

		System.out.println();
		System.out.println("Enter a withdraw value: ");
		double retirada = sc.nextDouble();
		banco.saque(retirada);
		System.out.println("Updated account data:");
		System.out.println(banco);

		sc.close();
	}

}
