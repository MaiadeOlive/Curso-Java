import java.util.Scanner;

import com.sun.org.apache.xpath.internal.objects.XObject;

import entities.Estudante;

public class Pensionato {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.print("How many rooms will be rented? ");
		int quartos = sc.nextInt();
		Estudante[] rooms = new Estudante[10];

		for (int i = 0; i < quartos; i++){
			System.out.println("Rent #" + (i + 1)+ ":");
			System.out.print("Name: ");
			sc.nextLine();
			String name = sc.nextLine();
			System.out.print("Email: ");
			String email = sc.nextLine();
			System.out.print("Quarto: ");
			int quarto = sc.nextInt();
			rooms[quarto] = new Estudante(name, email, quarto);;
		}
		System.out.println("Busy Rooms:");
		for (int i =0; i < rooms.length; i++){
			if (rooms[i] != null ){
				System.out.println(rooms[i]);
			}
		}
		sc.close();
	}
}
