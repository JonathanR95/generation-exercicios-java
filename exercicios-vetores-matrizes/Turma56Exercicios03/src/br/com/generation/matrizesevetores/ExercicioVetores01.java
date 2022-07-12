package br.com.generation.matrizesevetores;

import java.util.Scanner;

public class ExercicioVetores01 {

	public static void main(String[] args) {
		
		/* 1. Faça um programa que crie um vetor por leitura com 5 valores de pontuação de uma
		atividade e o escreva em seguida. Encontre após a maior pontuação e a apresente. */

		int[] numeros = new int[5];
		int maior = 0;
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Insira 5 número: ");
		
		for(int i = 0; i < 5; i++) {
			System.out.print((i + 1)+ " ° numero: ");
			numeros[i] = leia.nextInt();
			if(numeros[i] > maior) {
				maior = numeros[i];
			}
		}
		System.out.println("O maior numero é: " + maior);
	}

}
