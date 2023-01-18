package curso_nelio;

public class Main {

	public static void main(String[] args) {
	//Casting
		
	int a = 5;
	int b = 2;
	
	double resultado;
	
	resultado = a / b;
	System.out.println("Sem casting...");
	System.out.println(resultado);
	
	//Colocar na frente entre parentêses o tipo da variável
	resultado = (double) a / b;
	System.out.println("Com casting...");
	System.out.println(resultado);	
		
	}

}
