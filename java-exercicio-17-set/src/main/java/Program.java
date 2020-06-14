import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

import javax.swing.plaf.synth.SynthLookAndFeel;

import com.sun.org.apache.xml.internal.utils.SystemIDResolver;

import entities.Curso;

public class Program {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		Set<Curso> setA = new HashSet<Curso>();
		Set<Curso> setB = new HashSet<Curso>();
		Set<Curso> setC = new HashSet<Curso>();

		System.out.print("How many students for Course A? ");
		int alunosA = sc.nextInt();
		for (int i = 0; i < alunosA; i++){
			int matricula = sc.nextInt();
			setA.add(new Curso(matricula));
		}

		System.out.print("How many students for Course B? ");
		int alunosB = sc.nextInt();
		for (int i = 0; i < alunosB; i++){
			int matricula = sc.nextInt();
			setB.add(new Curso(matricula));
		}

			System.out.print("How many students for Course C? ");
		int alunosC = sc.nextInt();
		for (int i = 0; i < alunosC; i++){
			int matricula = sc.nextInt();
			setC.add(new Curso(matricula));
		}

		Set<Curso> setTotalAlunos = new TreeSet<Curso>(setA);

		setTotalAlunos.addAll(setB);
		setTotalAlunos.addAll(setC);

		System.out.println("Total Students " + setTotalAlunos.size() );

			sc.close();
	}
}
