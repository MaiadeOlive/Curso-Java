import java.util.Scanner;

import entities.Estudante;

public class Main {
	public static void main(String[] args) {

		Estudante aluno = new Estudante();
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o nome do aluno e suas três notas trimestrais: ");

		aluno.name = sc.nextLine();
		aluno.nota1 = sc.nextDouble();
		aluno.nota2 = sc.nextDouble();
		aluno.nota3 = sc.nextDouble();

	if (aluno.notaFinal() < 60.00){
		System.out.println("ALUNO: " + aluno.name);
		System.out.printf("NOTA FINAL %.2f%n", aluno.notaFinal());
		System.out.println("REPROVADO");
		System.out.printf("PONTOS FALTANTES %.2f%n", aluno.pontosFaltantes());
	}
		else {
		System.out.println("ALUNO: " + aluno.name);
		System.out.printf("NOTA FINAL %.2f%n", aluno.notaFinal());
		System.out.println("APROVADO");
	}

		sc.close();
	}
}
