package poo.listas.exerciciosVetor;

public class PessoaExercicio9 {

	private String nome;
	private int idade;

	public PessoaExercicio9() {
	}

	public PessoaExercicio9(String nome, int idade) {
		this.nome = nome;
		this.idade = idade;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String toString() {
		return "nome: " + nome + ", idade: " + idade;
	}

}
