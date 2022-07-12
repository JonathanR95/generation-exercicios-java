package br.com.generation.matrizesevetores;

import java.util.Scanner;

public class ExercicioMatriz02 {

	public static void main(String[] args) {
		/* 4. Crie um programa que receba valores do usuário para preencher uma matriz 3X3, e
			em seguida, exiba a soma dos valores dela e a soma dos valores da primeira
			diagonal, ou seja, diagonal principal. */

		int[][] matriz = new int[3][3];
		double soma = 0,somaDiagonal = 0;
		
		Scanner leia = new Scanner(System.in); 
		
		System.out.println("Insira os dados da Matriz: ");
		for(int l = 0; l < matriz.length; l++) {
			for( int c = 0; c < matriz[l].length; c++) {
				System.out.printf("Insira o Número da posição[%d][%d]:", l,c);
				matriz[l][c] = leia.nextInt();
				soma += matriz[l][c];
				
				somaDiagonal = matriz[0][0] + matriz[1][1] + matriz[2][2];
			}
		}
		System.out.println("A soma dos numeros da matriz é: " + soma);
		System.out.println("A soma dos numeros da diagonal da matriz é: " + somaDiagonal);
	}

}
