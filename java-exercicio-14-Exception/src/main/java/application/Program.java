package application;

import java.util.Scanner;

import javax.rmi.ssl.SslRMIClientSocketFactory;

import com.sun.org.apache.xerces.internal.util.SynchronizedSymbolTable;

import model.entities.Account;
import model.exception.DomainException;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		try {
			System.out.println("Enter account data");
			System.out.print("Number: ");
			Integer accNumber = sc.nextInt();
			sc.nextLine();
			System.out.print("Holder: ");
			String holder = sc.nextLine();
			System.out.print("Initial Balance: ");
			Double initialBalance = sc.nextDouble();
			System.out.print("Withdraw limit: ");
			Double withdrawLimit = sc.nextDouble();

			Account acc = new Account(accNumber, holder, initialBalance, withdrawLimit);

			System.out.print("Enter amount for withdraw: ");
			Double amount = sc.nextDouble();
			acc.withdraw(amount);
			System.out.printf("New balance: %.2f%n ", acc.getBalance());

		}
		catch (DomainException e){
			System.out.println("Withdraw error: " + e.getMessage());
		}
//		catch (RuntimeException e){
//			System.out.println("Unexpected error");
//		}
		sc.close();
	}
}
