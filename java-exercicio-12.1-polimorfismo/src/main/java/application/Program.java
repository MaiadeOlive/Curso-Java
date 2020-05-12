package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

		List<Product> productsList = new ArrayList<Product>();

		System.out.print("Enter the number of products: ");
		Integer numProd = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i<= numProd; i++){
			System.out.printf("Product %d data:\n ", i);
			System.out.print("Common, used or imported (c/u/i)? ");
			char ch = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Name: ");
			String name = sc.nextLine();
			System.out.print("Price: ");
			Double price = sc.nextDouble();
			if (ch == 'i'){
				System.out.print("Customs fee: ");
				Double customFee = sc.nextDouble();
				productsList.add(new ImportedProduct(name, price, customFee));
			}
			else if (ch == 'u'){
				System.out.print("Manufacture date (DD/MM/YYYY): ");
				Date data = sdf.parse(sc.next());
				productsList.add(new UsedProduct(name, price, data));
			}
			else{
				productsList.add(new Product(name,price));
			}
		}
		sc.nextLine();
		System.out.println("PRICE TAGS: ");
		for (Product product : productsList ){
			System.out.println(product.priceTag());
		}








		sc.close();
	}
}
