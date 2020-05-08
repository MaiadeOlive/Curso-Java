import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//ESTRUTURA WHILE

		//1 - Escreva um programa que repita a leitura de uma senha até que ela seja válida.
		// Para cada leitura de senha incorreta informada, escrever a mensagem "Senha Invalida".
		// Quando a senha for informada corretamente deve ser impressa a mensagem "Acesso Permitido"
		// e o algoritmo encerrado. Considere que a senha correta é o valor 2002.

//		System.out.println("Digite uma senha de 4 digitos:");
//		int senha = sc.nextInt();
//		while (senha != 2002){
//			System.out.println("Senha inválida");
//			senha = sc.nextInt();
//		}
//		System.out.println("Acesso Permitido");
//
//		//02 - Escreva um programa para ler as coordenadas (X,Y) de uma quantidade indeterminada
//		// de pontos no sistema cartesiano. Para cada ponto escrever o quadrante a que ele pertence.
//		// O algoritmo será encerrado quando pelo menos uma de duas coordenadas for NULA
//		// (nesta situação sem escrever mensagem alguma).
//
//		System.out.println("Digite dois numeros inteiros:");
//
//		int x = sc.nextInt();
//		int y = sc.nextInt();
//
//		while( x != 0 && y != 0){
//			if ( x > 0 && y > 0){
//				System.out.println("primeiro");
//				break;
//			}
//			else if ( x < 0 && y > 0){
//				System.out.println("segundo");
//				break;
//			}
//			else if ( x < 0 && y < 0){
//				System.out.println("terceiro");
//				break;
//			}
//			else {
//				System.out.println("quarto");
//				break;
//			}
//		}
//
//		//03 - Um Posto de combustíveis deseja determinar qual de seus produtos tem a preferência
//		// de seus clientes. Escreva um algoritmo para ler o tipo de combustível abastecido
//		// (codificado da seguinte forma: 1.Álcool 2.Gasolina 3.Diesel 4.Fim).
//		// Caso o usuário informe um código inválido (fora da faixa de 1 a 4) deve ser solicitado
//		// um novo código (até que seja válido). O programa será encerrado quando o código informado
//		// for o número 4. Deve ser escrito a mensagem: "MUITO OBRIGADO" e a quantidade de clientes
//		// que abasteceram cada tipo de combustível, conforme exemplo.
//
//		System.out.println("1.Álcool");
//		System.out.println("2.Gasolina");
//		System.out.println("3.Diesel");
//		System.out.println("4.Fim");
//		System.out.println("Digite sua opção de abastecimento:  ");
//		int alcool = 0;
//		int gasolina = 0;
//		int diesel = 0;
//		int escolha = sc.nextInt();
//
//		while( escolha != 4){
//			if (escolha == 1) {
//				alcool += 1;
//			}
//			else if (escolha == 2) {
//				gasolina += 1;
//			}
//			else if (escolha == 3) {
//				diesel += 1;
//			}
//			escolha = sc.nextInt();
//
//		}
//		System.out.println("MUITO OBRIGADA");
//		System.out.printf("Alcool: %d%n", alcool);
//		System.out.printf("Gasolina: %d%n", gasolina);
//		System.out.printf("Diesel: %d%n", diesel);

		//ESTRUTURA FOR

		//01 - Leia um valor inteiro X (1 <= X <= 1000). Em seguida mostre os ímpares
		// de 1 até X, um valor por linha, inclusive o X, se for o caso.

		System.out.println("Digite um número de 1 a 1000:");
		int X = sc.nextInt();

		for (int i = 0; i <= X; i++){
			if (i % 2 != 0){
				System.out.printf("%d%n", i);
			}
		}

		//02 - Leia um valor inteiro N. Este valor será a quantidade
		// de valores inteiros X que serão lidos em seguida.
		//Mostre quantos destes valores X estão dentro do intervalo [10,20]
		// e quantos estão fora do intervalo, mostrando essas informações conforme
		// exemplo (use a palavra "in" para dentro do intervalo, e "out" para fora do intervalo).

		System.out.println("Digite a quantidade de repetições");
		int Y = sc.nextInt();
		int out = 0;
		int in = 0;

		for (int i = 0; i < Y; i++){
			System.out.println("Digite um número:");
			int x = sc.nextInt();
			if (x < 10 || x > 20){
				out += 1;
			}
			else {
				in += 1;
			}
		}
		System.out.printf("%d%n IN",in);
		System.out.printf("%d%n OUT",out);

		//03 - Leia 1 valor inteiro N, que representa o número de casos de teste
		// que vem a seguir. Cada caso de teste consiste de 3 valores reais,
		// cada um deles com uma casa decimal. Apresente a média ponderada para cada um destes
		//conjuntos de 3 valores, sendo que o primeiro valor tem peso 2, o segundo valor tem
		// peso 3 e o terceiro valor tem peso 5.

			System.out.println("Digite a quantidade de repetições");
			int r = sc.nextInt();

			double a = 0.0;
			double b = 0.0;
			double c = 0.0;

			double media = 0.0;

			System.out.println("Digite três numeros separados por virgula");
			for(int i = 0; i < r; i++){
				a = sc.nextDouble();
				b = sc.nextDouble();
				c = sc.nextDouble();
				media = (2*a + 3*b + 5*c) / 10;
				System.out.printf("%.1f%n", media);
//			}

			//04 - Fazer um programa para ler um número N. Depois leia N
			// pares de números e mostre a divisão do primeiro pelo segundo.
			// Se o denominador for igual a zero, mostrar a mensagem "divisao impossivel".

			System.out.println("Digite a quantidade de repetições");
			int rep = sc.nextInt();

			for (int i = 0; i < rep; i++){
				int n1 = sc.nextInt();
				int n2 = sc.nextInt();

				if (n2 == 0){
					System.out.println("Divisão impossivel");
				}
				else{
					double result = (double) n1 / n2;
					System.out.printf("%.1f%n",result);
				}
			}

		//05 - Ler um valor N. Calcular e escrever seu respectivo fatorial.
		// Fatorial de N = N * (N-1) * (N-2) * (N-3) * ... * 1.
		//Lembrando que, por definição, fatorial de 0 é 1

		System.out.println("Digite um número");
		int N = sc.nextInt();

		int fatorial = 1;

		for (int i = 1; i <= N; i++){
			 fatorial = fatorial * i;
		}

		System.out.println(fatorial);

		//06 - Ler um número inteiro N e calcular todos os seus divisores.

		System.out.println("Digite um número");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++){
			if (n % i == 0) {
				System.out.printf("%d%n", i);
			}
		}

		//07 - Fazer um programa para ler um número inteiro positivo N.//
		// O programa deve então mostrar na tela N linhas, começando de 1 até N.
		// Para cada linha, mostrar o número da linha, depois o quadrado
		// e o cubo do valor, conforme exemplo.

		System.out.println("Digite um número");
		int n = sc.nextInt();

		for (int i = 1; i <= n; i++){
			System.out.printf("%d ", i);
			System.out.printf("%d ", (i * i));
			System.out.printf("%d %n", (i * i * i));
		}

		sc.close();
	}
}
