package poo.Exercicios;

public class Rectangle {

	double width;
	double height;

	public double area() {
		double area = width * height;
		return area;
	}

	public double perimeter() { //
		double perimetro = 2 * (width + height);
		return perimetro;
	}

	public double diagonal() {
		double diagonal = Math.sqrt(width * width + height * height);
		return diagonal;
	}

	public String toString() {
		return "AREA = " + String.format("%.2f%n", area()) + 
			   "PERIMETER = " + String.format("%.2f%n", perimeter()) + 
			   "DIAGONAL = " + String.format("%.2f%n", diagonal());
	}

}
