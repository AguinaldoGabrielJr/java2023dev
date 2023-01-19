package ExerciciosEstruturaCondicionalIfElse;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {

	//Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
	//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
		
	Scanner sc = new Scanner(System.in);
	
	int inicio, fim, total;
	
	System.out.println("Qual o horário do inicio do jogo?");
	inicio = sc.nextInt();
	
	System.out.println("Qual o horário do término do jogo");
	fim = sc.nextInt();
	
	if (inicio < fim) {
		total = inicio + fim;
	}else {
		total = 24 - ( inicio + fim );
	}
	
	System.out.println("O JOGO DUROU " + total + " HORA(S)");
	
	sc.close();
	}

}
