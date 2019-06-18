package application;

import java.util.Scanner;

public class Program {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Numero de linhas: ");
		int m = sc.nextInt();
		System.out.print("Numero de colunas: ");
		int n = sc.nextInt();

		System.out.println();

		// INICIO MATRIZ
		int[][] mat = new int[m][n];

		// PERCORRER MATRIZ e ADICIONAR ENTRADA DE DADOS
		System.out.print("Digite o numero: ");
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				mat[i][j] = sc.nextInt();
			}
		}

		System.out.println();

		// NUMERO PARA SELECIONAR
		System.out.print("Digite o numero que precisa encontrar na tabela: ");
		int x = sc.nextInt();

		// VIEW
		for (int i = 0; i < mat.length; i++) {
			for (int j = 0; j < mat[i].length; j++) {
				if (mat[i][j] == x) {
					System.out.println("Position " + i + "," + j + ":");
					if (j > 0) {
						System.out.println("Esquerda: " + mat[i][j - 1]);
					}
					if (i > 0) {
						System.out.println("Acima: " + mat[i - 1][j]);
					}
					if (j < mat[i].length - 1) {
						System.out.println("Direita: " + mat[i][j + 1]);
					}
					if (i < mat.length - 1) {
						System.out.println("Direita: " + mat[i + 1][j]);
					}
				}
			}
		}

		sc.close();
	}

}
