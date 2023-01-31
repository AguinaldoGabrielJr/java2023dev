package poo.lista;

public class ExercicioFuncionario {

	private Integer id;
	private String nome;
	private Double salario;

	public ExercicioFuncionario() {
		super();
	}

	public ExercicioFuncionario(Integer id, String nome, Double salario) {
		this.id = id;
		this.nome = nome;
		this.salario = salario;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public void aumentoSalario(double aumento) {
		this.salario += salario * aumento / 100.0;
	}

	public String toString() {
		return "\nId: " + id + "\nNome: " + nome + "\nSalário: " + String.format("%.2f", salario) + "\n ";
	}

}
