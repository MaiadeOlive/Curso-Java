import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.Scanner;

import entities.Employee;

public class EmployeeRegister {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		List<Employee> registro = new ArrayList<Employee>();

		System.out.println("How many employees will be registered? ");
		int n = sc.nextInt();

		for (int i = 0; i <= n; i++){
			System.out.println("Employee #" + (i + 1)+ ":");
			System.out.print("ID: ");
			int id = sc.nextInt();
			while (hasId(registro, id)) {
				System.out.print("Id already taken. Try again: ");
				id = sc.nextInt();
			}

			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Salary: ");
			double salary = sc.nextDouble();
			registro.add(new Employee(id, name, salary));;
		}

		System.out.println("Enter the employee id that will have salary increase: ");
		int id = sc.nextInt();
		Employee emp = registro.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		System.out.println("Enter the percentage: ");
		double percentage = sc.nextDouble();
		emp.increasySalary(percentage);

		System.out.println("List of Employees: ");
		for ( Employee funcionario : registro) {
			System.out.println(funcionario);
		}
		sc.close();
	}

	private static boolean hasId(List<Employee> registro, int id) {
		Employee emp = registro.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		return emp != null;
	}
}
