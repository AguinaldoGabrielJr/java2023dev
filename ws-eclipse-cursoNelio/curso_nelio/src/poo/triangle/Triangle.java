package poo.triangle;

import java.util.Scanner;

public class Triangle {

	Scanner sc = new Scanner(System.in);

	double a, b, c;
	
	public double area () {
		double p = (a + b + c) / 2.0;
		double area = Math.sqrt(p * (p - a) * (p - b) * (p - c));
		return area;
		
	}

}
