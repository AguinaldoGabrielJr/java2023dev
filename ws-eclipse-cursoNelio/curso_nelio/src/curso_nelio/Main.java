package curso_nelio;

import java.util.Locale;

public class Main {

	public static void main(String[] args) {

	//Saida de dados
		
	int x = 36;
	double y = 10.35784;
	
	System.out.println("Teste saida de dados");
	System.out.print("Valor de x: ");
	System.out.println(x);
	
	System.out.print("Valor de y: ");
	System.out.println(y);
	
	System.out.print("Valor de y com máscara para duas casas decimais: ");
	System.out.printf("%.2f%n", y);
	
	System.out.print("Valor de y com máscara para quatro casas decimais: ");
	System.out.printf("%.4f%n", y);
	
	//Os valores saem pelo padrão de lingua do PC, caso eu queira mudar a saida 
	//dados para . por exemplo uso comando Locate a seguir...
	
	Locale.setDefault(Locale.US);
	System.out.print("Valor de y com máscara para quatro casas decimais: ");
	System.out.printf("%.4f%n", y);
	
		
	}

}
