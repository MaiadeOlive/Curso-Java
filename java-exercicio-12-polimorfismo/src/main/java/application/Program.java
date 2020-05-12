package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Employee;
import entities.OutSorcedEmployee;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		List<Employee> list = new ArrayList<Employee>();

		System.out.print("Enter the number of employees: ");
		Integer num = sc.nextInt();

		for (int i = 1; i <= num; i++) {
			System.out.print("Outsorced (y/n): ");
			char ch = sc.next().charAt(0);

			System.out.printf("Employee %d:%n ", i);
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();

			System.out.print("Hours: ");
			Integer hour = sc.nextInt();

			System.out.print("Value per Hour: ");
			Double valuePerHour = sc.nextDouble();

			if (ch == 'y') {
				System.out.print("Additional Charge: ");
				Double additionalCharge = sc.nextDouble();
				list.add(new OutSorcedEmployee(name, hour,valuePerHour,additionalCharge));
			}
			else {
				list.add(new Employee(name, hour,valuePerHour));
			}
		}
		System.out.println();
		System.out.println("Payments: ");

		for (Employee emp : list ){
			System.out.println(emp.getName() + " - $" +  );
		}

		sc.close();
	}
}
