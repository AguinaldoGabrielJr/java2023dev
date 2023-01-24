package poo.listas.exerciciosVetor;

public class AlunoExercicio10 {

	private String nome;
	private double nota;
	private double nota2;

	public AlunoExercicio10(String nome, double nota, double nota2) {
		super();
		this.nome = nome;
		this.nota = nota;
		this.nota2 = nota2;
	}


	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getNota() {
		return nota;
	}

	public void setNota(double nota) {
		this.nota = nota;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(int nota2) {
		this.nota2 = nota2;
	}

	public String toString() {
		return getNome();
	}
}
