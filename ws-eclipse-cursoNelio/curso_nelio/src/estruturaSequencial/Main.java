package estruturaSequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Como usar while
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int soma = 0;
		
		while (num != 0) {
			soma += num;
			num = sc.nextInt();
}
		System.out.println(soma);
		sc.close();
	}

}
