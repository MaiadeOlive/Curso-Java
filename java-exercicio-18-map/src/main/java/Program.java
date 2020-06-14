import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.text.ParseException;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Program {
	public static void main(String[] args) throws ParseException {

		Scanner sc = new Scanner(System.in);
		Map<String, Integer> election = new HashMap<>();

		System.out.println("/home/bridge/Curso-Java/java-exercicio-18-map/src/main/java/in.txt");

		System.out.println("Digite o path do caminho");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))){

			String line = br.readLine();
			while(line != null){

				System.out.println(line);

				String[] fields = line.split(",");
				String candidate = fields[0];
				int votes = Integer.parseInt(fields[1]);

				if(election.containsKey(candidate)){
					int votesUntilNow = election.get(candidate);
					election.put(candidate, votes + votesUntilNow);
				}
				else{
					election.put(candidate,votes);
				}
				line = br.readLine();
			}

			for (String key : election.keySet()){
				System.out.println(key + ": " + election.get(key));
			}

		}
		catch (IOException e){
			System.out.println("Error: " + e.getMessage());
		}

		sc.close();
	}
}
