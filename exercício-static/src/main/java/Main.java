import java.util.ConcurrentModificationException;
import java.util.Scanner;

import util.Conversor;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Qual o preco do dolar? ");
		double dolar_price = sc.nextDouble();
		System.out.print("Quantos dolares vai comprar? ");
		double dolar_quantidade = sc.nextDouble();
		System.out.printf("Valor a ser pago em reais: R$%.2f", Conversor.conversaoDolar(dolar_price, dolar_quantidade));

	}
}
