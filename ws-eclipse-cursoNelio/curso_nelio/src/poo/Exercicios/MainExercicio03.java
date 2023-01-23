package poo.Exercicios;

import java.util.Locale;
import java.util.Scanner;

public class MainExercicio03 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno = new Aluno();
		
		System.out.print("Por favor insira o nome do aluno: ");
		aluno.nome = sc.nextLine();
		
		System.out.print("Por favor insira a nota do primeiro trimestre: ");
		aluno.nota1 = sc.nextDouble();
		
		System.out.print("Por favor insira a nota do segundo trimestre: ");
		aluno.nota2 = sc.nextDouble();
		
		System.out.print("Por favor insira a nota do terceiro trimestre: ");
		aluno.nota3 = sc.nextDouble();
		
		System.out.println();
		System.out.println("ALUNO: " + aluno.nome);
		System.out.printf("FINAL GRADE: %.2f%n" , aluno.media());
		
		if (aluno.media() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n" , aluno.mediaFaltante());
		}else {
			System.out.println("PASS");
		}
		
		sc.close();
	}

}
