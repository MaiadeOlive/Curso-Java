package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import entities.Comment;
import entities.Post;

public class Program {
	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);

		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

		Comment c1 = new Comment("HAVE A NICE TRIP!");
		Comment c2 = new Comment("WOW THAT'S AWESOME!");
		Post p1 = new Post(sdf.parse("21/06/2018 13:05:44"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderfull country",
				12);
		p1.addComment(c1);
		p1.addComment(c2);

		Comment c3 = new Comment("May the force be with you!");
		Comment c4 = new Comment("With great power comes great responsibility!");
		Post p2 = new Post(sdf.parse("28/11/2019 22:12:03"),
				"Good Night Java!",
				"I'm going to finish the module",
				42);
		p2.addComment(c3);
		p2.addComment(c4);

		System.out.print(p1);
		System.out.println();
		System.out.println("------------------------------");
		System.out.println();
		System.out.print(p2);
		sc.close();
	}
}
