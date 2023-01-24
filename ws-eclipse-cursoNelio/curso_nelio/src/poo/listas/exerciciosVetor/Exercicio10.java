package poo.listas.exerciciosVetor;

import java.util.Locale;
import java.util.Scanner;

public class Exercicio10 {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Quantos alunos serão inseridos? ");
		
		int n = sc.nextInt();
		double media = 0f;
		sc.nextLine();
		
		AlunoExercicio10[] vetor = new AlunoExercicio10[n];
		
		for (int i = 0; i < vetor.length; i++) {
			System.err.println("Digite nome, primeira e segunta nota do " + (i + 1) + "º aluno:" );
			String nome = sc.nextLine();
			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			sc.nextLine();
			
			vetor[i] = new AlunoExercicio10(nome, nota1, nota2);
		}
		
		System.out.println("Alunos aprovados:");
		for (int i = 0; i < vetor.length; i++) {
			media = (vetor[i].getNota() + vetor[i].getNota2())/ 2 ;
			if (media >= 6.0) {
				System.out.println(vetor[i]);
			}
		}
		sc.close();

	}

}
