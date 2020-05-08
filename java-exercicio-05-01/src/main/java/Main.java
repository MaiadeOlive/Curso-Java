import java.util.Scanner;

import entities.Rectangle;

public class Main {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rectangle rectangle = new Rectangle();

		System.out.println("Digite a largura e a base do retangulo: ");
		rectangle.base = sc.nextDouble();
		rectangle.altura = sc.nextDouble();

		System.out.printf("Area: %.2f%n", rectangle.area());
		System.out.printf("Perimetro: %.2f%n", rectangle.perimetro());
		System.out.printf("Diagonal: %.2f%n", rectangle.diagonal());
	}
}
