package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entities.enums.OrderStatus;

public class Program {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		Date date = new Date();

		//CLIENT

		System.out.println("Enter client Data: ");
		System.out.print("Name: ");
		String name = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Birth date (DD/MM/YYYY): ");
		Date birthday = sdf.parse(sc.next());

		Client client = new Client(name, email, birthday);

		//ORDER ITEM

		System.out.println("Enter order data: ");
		System.out.print("Status: ");
		OrderStatus status = OrderStatus.valueOf(sc.next());

		Order order = new Order(date, status, client);

		System.out.print("How many items to this order? ");
		Integer items = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= items; i++) {
			System.out.printf("Enter #%d item data:\n", i);
			sc.nextLine();
			System.out.print("Product name: \n");
			String name_item = sc.nextLine();
			System.out.print("Product price: \n");
			Double price_item = sc.nextDouble();

			Product product = new Product(name_item, price_item);

			System.out.print("Quantity: \n");
			Integer item_quantity = sc.nextInt();

			OrderItem orderItem = new OrderItem(item_quantity, price_item, product);

			order.addItem(orderItem);
		}

		//ORDER
		System.out.println();
		System.out.println(order);


















		sc.close();
	}
}
