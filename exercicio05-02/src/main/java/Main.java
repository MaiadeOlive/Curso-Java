import java.util.Scanner;

import entities.Funcionario;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Funcionario func = new Funcionario();
		System.out.println("Digite os dados do funcionário");

		System.out.print("Name: ");
		func.name = sc.nextLine();
		System.out.print("Salário Bruto: ");
		func.salarioBruto = sc.nextDouble();
		System.out.print("Imposto: ");
		func.imposto = sc.nextDouble();

		System.out.println();
		System.out.println("Funcionário: " + func );
		System.out.println();
		System.out.print("Qual a porcentagem de aumento de salário? ");
		double porcentagem = sc.nextDouble();
		func.aumentoSalario(porcentagem);
		System.out.println(func);
		System.out.println("Dados atualizados: " + func);
		sc.close();
	}
}
