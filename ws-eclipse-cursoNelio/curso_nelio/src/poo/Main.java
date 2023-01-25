package poo;

public class Main {

	public static void main(String[] args) {
		
		//Boxing
		int x = 20;
		Object obj = x; 
		System.out.println(obj);
	
		//Unboxing
		int y = (int) obj;
		System.out.println(y);
		
		/*Classes equivalentes aos tipos primitivos, elas podem receber valor null diferente das primitivas
		Uso para inserir dados em banco, pois as vezes na regra de negocio eles podem ficar vazios.
		Toda classe java é filha de um Object e toda classe númerica é filha de Number
		
	    Boolean = boolean
	    Character = char
	    Byte = byte
	    Short = short
	    Integer = int
	    Long = long
	    Float float
	    Double double    
		
		*/
	}
	
}