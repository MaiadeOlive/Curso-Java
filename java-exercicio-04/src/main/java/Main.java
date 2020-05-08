import java.util.Scanner;

import sun.security.jgss.GSSCaller;

public class Main {
	public static void main(String[] args) {
//		//01 - faça um programa pra ler um numero inteiro e dizer se ele é negativo ou nao
//
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite um número: ");
		int num = sc.nextInt();

		if (num >= 0){
			System.out.println("Não negativo");
		}
		else {
			System.out.println("Negativo");
		}
//
//		//02 - faça um programa pra ler um num inteiro e dizer se este num é par ou impar
//
		System.out.println("Digite um número: ");
		int num1 = sc.nextInt();

		if (num1 % 2 == 0) {
			System.out.println("Par");
		}
		else {
			System.out.println("Impar");
		}
//
//		//03 - Leia 2 valores inteiros (A e B). Após, o programa deve mostrar uma mensagem "Sao Multiplos" ou "Nao sao
//		//Multiplos", indicando se os valores lidos são múltiplos entre si. Atenção: os números devem poder ser digitados em
//		//ordem crescente ou decrescente
//
		System.out.println("Digite dois números: ");
		int A = sc.nextInt();
		int B = sc.nextInt();

		if (A % B == 0 || B % A == 0) {
			System.out.println("São Multiplos");
		}
		else {
			System.out.println("Não sao Multiplos");
		}
//
//		//04 - Leia a hora inicial e a hora final de um jogo. A seguir calcule a duração do jogo, sabendo que o mesmo pode
//		//começar em um dia e terminar em outro, tendo uma duração mínima de 1 hora e máxima de 24 horas.
//
		System.out.println("Digite o horario inicial e o final do jogo: ");
		int hora_inicio = sc.nextInt();
		int hora_final = sc.nextInt();

		if (hora_inicio <  hora_final) {
			int duracao = hora_final - hora_inicio;
			System.out.printf("O jogo durou %d horas\n", duracao);
		}
		else {
			int duracao = 24 - hora_inicio + hora_final;
			System.out.printf("O jogo durou %d hora(s)\n", duracao);
		}

		//05 - Com base na tabela abaixo, escreva um programa que leia o código de um item e a quantidade deste item. A
		//seguir, calcule e mostre o valor da conta a pagar.
//
		int cachorro_quente = 1;
		double produto1_valor = 4.00;
		int x_salada = 2;
		double produto2_valor = 4.50;
		int x_bacon = 3;
		double produto3_valor = 5.00;
		int torrada_simples = 4;
		double produto4_valor = 2.00;
		int refrigerante = 5;
		double produto5_valor = 1.50;

		System.out.println("Digite o item e a quantidade: ");
		int produto = sc.nextInt();
		int quantidade = sc.nextInt();

		if (produto == cachorro_quente){
			double total = produto1_valor * quantidade;
			System.out.printf("Total: R$%.2f%n",total);
		}
		else if (produto == x_salada) {
			double total = produto2_valor * quantidade;
			System.out.printf("Total: R$%.2f%n",total);
		}
		else if (produto == x_bacon) {
			double total = produto3_valor * quantidade;
			System.out.printf("Total: R$%.2f%n",total);
		}
		else if (produto == torrada_simples) {
			double total = produto4_valor * quantidade;
			System.out.printf("Total: R$%.2f%n",total);
		}
		else if (produto == refrigerante) {
			double total = produto5_valor * quantidade;
			System.out.printf("Total: R$%.2f%n",total);
		}
		else {
			System.out.println("Escolha uma opção valida");
		}

		//06 - Você deve fazer um programa que leia um valor qualquer e apresente
		// uma mensagem dizendo em qual dos seguintes intervalos
		// ([0,25], [25,50], [50,75], [75,100]) este valor se encontra.
		// Obviamente se o valor não estiver em nenhum destes intervalos,
		// deverá ser impressa a mensagem “Fora de intervalo”.

		System.out.println("Digite um valor qualquer:");
		double valor = sc.nextDouble();

		if (valor < 0 || valor > 100.0){
			System.out.println("Fora de Intervalo");
		}
		else if (valor <= 25.0){
			System.out.println("Intervalo [0,25]");
		}
		else if (valor <= 50.0){
			System.out.println("Intervalo [25,50]");
		}
		else if (valor <= 75.0 ){
			System.out.println("Intervalo [75,100]");
		}
		else {
			System.out.println("Intervalo [75,100]");
		}

		//07 - Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas
		//de um ponto em um plano. A seguir, determine qual o quadrante ao qual pertence o
		//ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0)

		System.out.println("Digite dois valores com ponto flutuante:");
		double valor1_X = sc.nextDouble();
		double valor2_Y = sc.nextDouble();

		if (valor1_X < 0 && valor2_Y < 0){
			System.out.println("Q3");
		}
		else if (valor1_X > 0 && valor2_Y < 0){
			System.out.println("Q4");
		}
		else if (valor1_X < 0 && valor2_Y > 0){
			System.out.println("Q2");
		}
		else {
			System.out.println("Q1");
		}

		//08 - Leia um valor com duas casas decimais, equivalente ao salário
		//   de uma pessoa de Lisarb. Em seguida, calcule e
		//mostre o valor que esta pessoa deve pagar de Imposto de Renda

		System.out.println("Digite seu salário para calcular o importo de renda: R$:");
		double salario = sc.nextDouble();

		if (salario < 0) {
			System.out.println("Digite um valor válido!");
		}
		else if (salario <= 2000.00) {
			double total = (salario - 2000.00);
			System.out.println("Isento.");
		}
		else if (salario <= 3000.00){
			double total = (salario - 2000.00) * 0.08;
			System.out.printf("R$%.2f%n", total);
		}
		else if (salario <= 4500.00){
			double total = (salario - 3000.00) * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$%.2f%n", total);
		}
		else {
			double total = (salario - 4500.00) * 0.28 + 1500.0 * 0.18 + 1000.0 * 0.08;
			System.out.printf("R$%.2f%n", total);
		}

		sc.close();
	}
}
