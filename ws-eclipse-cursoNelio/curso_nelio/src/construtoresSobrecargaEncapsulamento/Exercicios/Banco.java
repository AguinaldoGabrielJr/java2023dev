package construtoresSobrecargaEncapsulamento.Exercicios;

public class Banco {

	private int numConta;
	private String nome;
	private double saldo;

	public Banco() {
	}

	public Banco(int numConta, String nome) {
		this.numConta = numConta;
		this.nome = nome;
		saldo = 0;
	}

	public Banco(int numConta, String nome, double saldo) {
		this.numConta = numConta;
		this.nome = nome;
		deposito(saldo);
	}

	public int getNumConta() {
		return numConta;
	}

	public void setNumConta(int numConta) {
		this.numConta = numConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void deposito(double saldo) {
		this.saldo += saldo;
	}

	public void saque(double saque) {
		this.saldo -= saque + 5.0;
	}

	public String toString() {
		return "Account data: " + "\n" + "Account " + numConta + ", Holder: " + nome + ", Balance: $ "
				+ String.format("%.2f", saldo);
	}

}
