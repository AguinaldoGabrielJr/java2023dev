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
	}
	
}