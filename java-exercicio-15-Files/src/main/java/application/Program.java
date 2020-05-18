package application;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entities.Product;

public class Program {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("Digite o path do arquivo: ");
		String pathIn = sc.nextLine();

		//home/bridge/Desktop/products.csv

		File fileIn = new File(pathIn);
		String folderFileIn = fileIn.getParent();
		System.out.println(folderFileIn);

		boolean success = new File(folderFileIn + "/out").mkdir();
		String folderFileOut = folderFileIn + "/out/finalSummary.csv";
		System.out.println("New folder created: " + success);

		List<Product> productsList = new ArrayList<>();

		try (BufferedReader br = new BufferedReader(new FileReader(pathIn))){
			String itemFileCsv = br.readLine();
			System.out.println("Products: ");

			while(itemFileCsv != null){
				System.out.println(itemFileCsv);
				String[] item = itemFileCsv.split(",");
				String name = item[0];
				Double value = Double.parseDouble(item[1]);
				Integer quantity = Integer.parseInt(item[2]);

				productsList.add(new Product(name,value,quantity));
				itemFileCsv = br.readLine();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}

		System.out.println("Products Sumary: ");

		try (BufferedWriter bw = new BufferedWriter(new FileWriter(folderFileOut))){

			for(Product product : productsList){
				bw.write(product.getName() + ", " + String.format("%.2f",product.totalValue()));
				bw.newLine();
			}
			System.out.println(folderFileOut + ": Created Succesfully!");
		}
		catch (IOException e){
			e.printStackTrace();
		}

		try (BufferedReader br = new BufferedReader(new FileReader(folderFileOut))){
			String itemFileCsv = br.readLine();
			System.out.println("Products Summary: ");

			while(itemFileCsv != null){
				System.out.println(itemFileCsv);
				itemFileCsv = br.readLine();
			}
		}
		catch (IOException e){
			e.printStackTrace();
		}

	}
}
