package exerciciosEstruturaCondicionalWhile;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		// Um Posto de combustíveis deseja determinar qual de seus produtos tem a
		// preferência de seus clientes. Escreva
		// um algoritmo para ler o tipo de combustível abastecido (codificado da
		// seguinte forma:
		// 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
		// Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser
		// solicitado um novo
		// código (até que seja válido). O programa será encerrado quando o código
		// informado for o número 4.
		// Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes que
		// abasteceram cada
		// tipo de combustível, conforme exemplo.

		int cod = 0;
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		int qualquer = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("Por favor insira qual o númedo do seu combustivel na lista abaixo:");
		System.out.println("1.Álcool - 2.Gasolina - 3.Diesel - 4.Fim.");
		cod = sc.nextInt();
		while (cod != 4) {

			if (cod == 1) {
				alcool = alcool + 1;
			} else if (cod == 2) {
				gasolina = gasolina + 1;
			} else if (cod == 3) {
				diesel = diesel + 1;
			} else if (cod < 1 || cod > 4) {
				qualquer = qualquer + 1;
			}
			System.out.println("Por favor insira qual o númedo do seu combustivel na lista abaixo:");
			System.out.println("1.Álcool - 2.Gasolina - 3.Diesel - 4.Fim.");
			cod = sc.nextInt();
		}
		System.out.println("MUITO OBRIGADO");
		System.out.printf("Alcool: %d%nGasolina: %d%nDiesel: %d%nInválido: %d", alcool, gasolina, diesel, qualquer);

		sc.close();
	}
}