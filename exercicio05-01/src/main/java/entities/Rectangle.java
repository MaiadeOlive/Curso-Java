package entities;

public class Rectangle {
	public double altura;
	public double base;

	public double area(){
		double area = base * altura;
		return area;
	};
	public double perimetro(){
		double perimetro = 2 * (base * altura);
		return perimetro;
	}
	public double diagonal(){
		double diagonal = Math.sqrt((base * base + altura * altura));
		return diagonal;
	}
}
