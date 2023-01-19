package estruturaSequencial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Switch case
		//Domingo dia 1 até segunda dia 7

		Scanner sc = new Scanner(System.in);
		System.out.println("Insira o dia da semana...");
		
		int x = sc.nextInt();
		String dia;
		
		switch (x) {
		case 1: {
			dia = "domingo";
			break;
		}
		case 2: {
			dia = "segunda";
			break;
		}
		case 3: {
			dia = "terça";
			break;
		}
		case 4: {
			dia = "quarta";
			break;
		}
		case 5: {
			dia = "quinta";
			break;
		}
		case 6: {
			dia = "sexta";
			break;
		}
		case 7: {
			dia = "sabado";
			break;
		}
		default:
			dia = "Valor invalido";
		}
		
		System.out.println("Dia da semana é " + dia);
		sc.close();

	}

}
