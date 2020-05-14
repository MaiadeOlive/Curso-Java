package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		StringBuilder sb = new StringBuilder();

		List<Pessoa> payerList = new ArrayList<Pessoa>();

		System.out.print("Enter the number of tax payers: ");
		Integer n = sc.nextInt();

		for ( int i = 1; i <= n; i++) {
			System.out.printf("Tax payer #%d data:%n", i);
			System.out.print("Individual or Company (i/c)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Anual Income: ");
			Double rendaAnual = sc.nextDouble();
			if (ch == 'i') {
				System.out.print("Health expenditures: ");
				Double medicalBills = sc.nextDouble();
				payerList.add(new PessoaFisica(name, rendaAnual, medicalBills));
			} else {
				System.out.print("Number of employees: ");
				Integer numFuncionarios = sc.nextInt();
				payerList.add(new PessoaJuridica(name, rendaAnual, numFuncionarios));
			}
		}
			System.out.println("TAXES PAID");

			for (Pessoa pessoa : payerList){
				System.out.println(pessoa.getName() + String.format(": $%.2f", pessoa.totalTaxes()));
			}
		sc.nextLine();
		double sum = 0.0;
			for (Pessoa pessoa : payerList) {
				sum += pessoa.totalTaxes();
			}
		sc.nextLine();
		System.out.printf("TOTAL TAXES: $%.2f", sum);

		sc.close();
	}
}
