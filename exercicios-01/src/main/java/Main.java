import javax.swing.plaf.synth.SynthConstants;

public class Main {
	public static void main(String[] args) {
		//01 - Faça um programa para ler dois valores inteiros e
		//imprima na tela a soma desses números com uma msg
		//explicativa conforme exemplos.

		int a = 10;
		int b = 30;
		int c = -30;
		int d = 0;

		System.out.println("Soma = " + (a + b));
		System.out.println("Soma = " + (a + c));
		System.out.println("Soma = " + (d + d));

		//02 - Faça um programa para ler o valor do raio de um círculo
		// e depois mostrar o valor da area deste circulo com quatro casas decimais

		//formula = area = 3,14159 . raio²

		double x = 2.00;
		double y = 100.64;
		double z = 150.00;
		double w = 3.14159;

		double A = w * (x*x);
		double B = w * (y*y);
		double C = w * (z*z);

		System.out.printf("A = %.4f%n", A);
		System.out.printf("A = %.4f%n", B);
		System.out.printf("A = %.4f%n", C);

		//03 - Fazer um programa pra ler quatro valores inteiros A,B,C e D.
		//Calcule e mostre a diretença do produto A e B pelo produto de C e D
		//segundo a formula => DIFERENÇA = (A * B - C * D)

		int A1 = 5;
		int B1 = 6;
		int C1 = 7;
		int D1 = 8;

		int produto_1 = (A1 * B1 - C1 * D1);
		System.out.printf("DIFERENÇA = %d%n", produto_1);

		int A2 = 5;
		int B2 = 6;
		int C2 = -7;
		int D2 = 8;

		int produto_2 = (A2 * B2 - C2 * D2);
		System.out.printf("DIFERENÇA = %d%n", produto_2);

		//04 - Fazer um programa que leia o número de um funcionário,
		// seu numero de horas trabalhadas, o valor que recebe por hora
		// e calcule o salário desse funcionario, mostre o numero e o salario do funcionario

		int funcionario1 = 25;
		int  horas_trabalhadas1 = 100;
		double valor_por_hora1 = 5.50;

		int funcionario2 = 1;
		int  horas_trabalhadas2 = 200;
		double valor_por_hora2 = 20.50;

		int funcionario3 = 6;
		int  horas_trabalhadas3 = 145;
		double valor_por_hora3 = 15.55;

		double salario_fun1 = horas_trabalhadas1 * valor_por_hora1;
		double salario_fun2 = horas_trabalhadas2 * valor_por_hora2;
		double salario_fun3 = horas_trabalhadas3 * valor_por_hora3;

		System.out.printf("NUMBER = %d%n", funcionario1);
		System.out.printf("SALARY = U$%.2f%n", salario_fun1);

		System.out.printf("NUMBER = %d%n", funcionario2);
		System.out.printf("SALARY = U$%.2f%n", salario_fun2);

		System.out.printf("NUMBER = %d%n", funcionario3);
		System.out.printf("SALARY = U$%.2f%n", salario_fun3);

		//05 - Fazer um programa para ler o código de uma peça 1, o numero de peças 1
		// o valor unitario de cada peça 1,
		//o codigo de uma peca 2 o numero de peças 2 e o valor unitario de cada peça dois
		//calcular e mostrar o valor a ser pago

		int peca_1_num = 1;
		int peca_2_num = 2;
		int peca_12_num = 12;
		int peca_13_num = 13;
		int peca_16_num = 16;
		int peca_161_num = 161;

		double peca_1_valor = 15.10;
		double peca_2_valor = 15.10;
		double peca_12_valor = 5.30;
		double peca_13_valor = 15.30;
		double peca_16_valor = 5.10;
		double peca_161_valor = 5.20;

		double pagamento_1 = peca_1_valor * 1 + peca_2_valor * 1;
		double pagamento_2 = peca_13_valor * 2 + peca_161_valor * 4;
		double pagamento_3 = peca_12_valor * 1 + peca_16_valor * 2;

		System.out.printf("Valor a Pagar: R$%.2f%n", pagamento_1);
		System.out.printf("Valor a Pagar: R$%.2f%n", pagamento_2);
		System.out.printf("Valor a Pagar: R$%.2f%n", pagamento_3);

		//Fazer um programa que leia tres valores com ponto flutuante de dupla precisaoA,B,C
		//Calcule e mostre:
		//a) a área do triângulo retângulo que tem A por base e C por altura.
		//b) a área do círculo de raio C. (pi = 3.14159)
		//c) a área do trapézio que tem A e B por bases e C por altura.
		//d) a área do quadrado que tem lado B.
		//e) a área do retângulo que tem lados A e B.

		double a_1 = 3.0;
		double b_1 = 4.0;
		double c_1 = 5.2;

		double triangulo_1 = a_1 * c_1 / 2;
		double circulo_1 = 3.14159 * (c_1 * c_1);
		double trapezio_1 = ((a_1 + b_1) / 2) * c_1;
		double quadrado_1 = b_1 * b_1;
		double retangulo_1 = a_1 * b_1;

		System.out.printf("TRIANGULO: %.3f%n", triangulo_1);
		System.out.printf("CIRCULO: %.3f%n", circulo_1);
		System.out.printf("TRAPEZIO: %.3f%n",trapezio_1);
		System.out.printf("QUADRADO: %.3f%n", quadrado_1);
		System.out.printf("RETANGULO: %.3f%n", retangulo_1);

		double a_2 = 12.7;
		double b_2 = 10.4;
		double c_2 = 15.2;

		double triangulo_2 = a_2 * c_2 / 2;
		double circulo_2 = 3.14159 + (c_2 * c_2);
		double trapezio_2 = ((a_2 + b_2) / 2) * c_2;
		double quadrado_2= b_2 * b_2;
		double retangulo_2 = a_2 * b_2;

		System.out.printf("TRIANGULO: %.3f%n", triangulo_2);
		System.out.printf("CIRCULO: %.3f%n", circulo_2);
		System.out.printf("TRAPEZIO: %.3f%n", trapezio_2);
		System.out.printf("QUADRADO: %.3f%n", quadrado_2);
		System.out.printf("RETANGULO: %.3f%n",retangulo_2);
	}
}
