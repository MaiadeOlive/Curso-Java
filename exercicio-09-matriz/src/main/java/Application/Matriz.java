package Application;

import java.util.Scanner;

import sun.awt.geom.AreaOp;

public class Matriz {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite dois números referentes a quantidade de linhas e colunas da matriz");
		System.out.print("Quantidade de linhas: ");
		int l = sc.nextInt();
		System.out.print("Quantidade de colunas: ");
		int c = sc.nextInt();

		int[][] matriz = new int[l][c];

		System.out.println("Digite os números separados por espaço: ");

		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Digite o número que deseja encontrar a posição: ");
		int position = sc.nextInt();

		for(int i = 0; i < matriz.length; i++){
			for(int j = 0; j < matriz[i].length; j++){
				if(position == matriz[i][j]){
					System.out.printf("Position %d,%d%n",i,j);
					if (i > 0) {
						System.out.println("Up: " + matriz[i-1][j]);
					}
					if (l > 0) {
						System.out.println("Left: " + matriz[i][j-1]);
					}
					if (j < matriz[i].length -1) {
						System.out.println("Right: " + matriz[i][j+1]);
					}
					if (i < matriz.length-1)
					System.out.println("Down: " + matriz[i+1][j]);
				}
			}
		}


		sc.close();
	}
}
