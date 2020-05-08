import java.util.Scanner;

import entities.CadastroBancario;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		CadastroBancario conta;

		System.out.print("Enter account number: ");
		int account_number = sc.nextInt();
		String x = sc.nextLine();
		System.out.print("Enter account holder: ");
		String account_name = sc.nextLine();
		System.out.print("Is there an initial deposit (y/n)? ");
		char choise = sc.next().charAt(0);
		if (choise == 'y'){
			System.out.print("Enter initial deposit value: ");
			double deposit = sc.nextDouble();
			conta = new CadastroBancario(account_number, account_name, deposit);
		}
		else {
			conta = new CadastroBancario(account_number, account_name);
		}
		System.out.println("Account Data:");
		System.out.println(conta);
		System.out.print("Enter a deposit value: R$");
		double value = sc.nextDouble();
		conta.deposit(value);
		System.out.println("Updated Account Data:");
		System.out.println(conta);
		System.out.print("Enter a withdraw value: R$");
		value = sc.nextDouble();
		conta.withdraw(value);
		System.out.println("Updated Account Data:");
		System.out.println(conta);

		sc.close();
	}
}
