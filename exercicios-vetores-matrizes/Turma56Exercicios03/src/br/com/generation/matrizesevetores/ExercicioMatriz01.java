package br.com.generation.matrizesevetores;

import java.util.Scanner;

public class ExercicioMatriz01 {

	public static void main(String[] args) {
		/* 3. Escreve um programa que lê duas matrizes N1 (4,6) e N2(4,6) e cria:
			a) Uma matriz M1 cujos elementos serão as somas dos elementos de mesma posição
		das matrizes N1 e N2;
			b) Uma matriz M2 cujos elementos serão as diferenças dos elementos de mesma
		posição das matrizes N1 e N2.*/

		int nLinha = 2;
		int nColuna = 4;
		int[][] N1 = new int[nLinha][nColuna];
		int[][] N2 = new int[nLinha][nColuna];
		int[][] M1 = new int[nLinha][nColuna];
		int[][] M2 = new int[nLinha][nColuna];
		
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira os numeros da Matriz N1 ");
		for(int l = 0; l < nLinha; l++){
			for(int c = 0; c < nColuna; c++) {
				System.out.printf("Numero na posição[%d][%d]: ",l,c);
				N1[l][c] = leia.nextInt();
			}
		}
		System.out.println("\nInsira os numeros da Matriz N2 ");
		for(int l = 0; l < nLinha; l++){
			for(int c = 0; c < nColuna; c++) {
				System.out.printf("Numero na posição[%d][%d]: ",l,c);
				N2[l][c] = leia.nextInt();
			}
		}
		System.out.println("\nA matriz M1 será: ");
		for(int l = 0; l < nLinha; l++){
			System.out.println(" ");
			for(int c = 0; c < nColuna; c++) {
				M1[l][c] = N1[l][c] + N2[l][c]; 
				System.out.print(M1[l][c]+ " | ");
			}
		}
		System.out.println("\nA matriz M2 será: ");
		for(int l = 0; l < nLinha; l++){
			System.out.println(" ");
			for(int c = 0; c < nColuna; c++) {
				M2[l][c] = N1[l][c] - N2[l][c]; 
				System.out.print(M2[l][c]+ " | ");
			}
		}
		
	}

}
