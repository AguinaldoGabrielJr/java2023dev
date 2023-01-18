package curso_nelio;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Entrada de dados, ler texto até quebra de linha(Apertar Enter)

		Scanner sc = new Scanner(System.in);
		
		int x;
		String s1, s2,s3;
		
		//Tomar cuidado quando colocar algum next diferente de nextLine(), pois ele irá consumir o mesmo.
		//Para burlar isso posso faço um nextLine() extra... Como na linha 19.
		
		x = sc.nextInt();
		sc.nextLine();
		s1 = sc.nextLine();
		s2 = sc.nextLine();
		s3 = sc.nextLine();
		
		System.out.println("Resultados:\n");
		System.out.println(x);
		System.out.println(s1);
		System.out.println(s2);
		System.out.println(s3);
		
		sc.close();
	}

}
