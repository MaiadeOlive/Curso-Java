//import java.util.Locale;

import java.util.Scanner;

import sun.awt.geom.AreaOp;

public class Main {
	public static void main(String[] args){
		String produto_1 = "Computer";
		String produto_2 = "Office desk";
		int age = 30;
		int code = 5290;
		char gender = 'F';
		double preco_1 = 2100.0;
		double preco_2 = 650.50;
		double measure = 53.234567;

		System.out.printf("%s which price is $ %.2f%n", produto_1, preco_1);
		System.out.printf("%s which price is $ %.2f%n", produto_2, preco_2);

		System.out.printf("Record: %d years old, code %d and gender: %s", age, code, gender);

		System.out.printf("Mesure with eight decimal places: %f%n", measure);
		System.out.printf("Rounded (three decimal places): %.3f%n", measure);
		System.out.printf("US decimal point: %.3f%n", measure);

		Scanner sc = new Scanner(System.in);
		String x, h ;
		int y;
		double z;
		char w;
		x = sc.next();
		y = sc.nextInt();
		z = sc.nextDouble();
		w = sc.next().charAt(0);
		sc.nextLine();
		h = sc.nextLine();
		System.out.println("Foi digitado a palavra: " + x);
		System.out.println("Foi digitado o numero : " + y);
		System.out.println("Foi digitado o float: " + z);
		System.out.println("Foi digitado o char: " + w);
		System.out.println("Foi digitado a linha: " + h);

		sc.close();

	}
}
