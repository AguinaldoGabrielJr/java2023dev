package poo.Exercicios;

public class Aluno {
	
	String nome;
	double nota1, nota2, nota3;
	
	public double media() {
		return (nota1 + nota2 + nota3) ;
	}
	
	public double mediaFaltante() {
		
		if (media() < 60.0) {
			return 60.0 - media();
		}else {
			return 0.0;
		}
	}
	
	
	
}
