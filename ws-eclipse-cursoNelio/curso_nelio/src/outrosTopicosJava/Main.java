package outrosTopicosJava;

public class Main {
	public static void main(String[] args) {
		//Split
		
		String s = "potato apple lemon";
		String p = "potato_apple_lemon_orange";
		
		String[] vetor = s.split(" "); //Separador/split
		String s1 = vetor[0];
		String s2 = vetor[1];
		String s3 = vetor[2];
		
		System.out.println(vetor[0]);
		System.out.println(vetor[1]);
		System.out.println(vetor[2]);
		
		String[] vetor2 = p.split("_"); //Separador/split
		String p1 = vetor2[0];
		String p2 = vetor2[1];
		String p3 = vetor2[2];
		String p4 = vetor2[3];
		
		System.out.println(vetor2[0]);
		System.out.println(vetor2[1]);
		System.out.println(vetor2[2]);
		System.out.println(vetor2[3]);
		
	}
	
}
