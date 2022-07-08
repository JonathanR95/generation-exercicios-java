package br.com.generation.exercicioslacosrepeticao;

import java.util.Scanner;

public class ExercicioLacosCondicionais {

	public static void main(String[] args) {
		// 1- Faça um programa que receba três inteiros e diga qual deles é o maior.
		
		Scanner leia = new Scanner(System.in);
		
		int maior = 0;
		
		System.out.println("Digite o primeiro Numero: ");
		int numero1 = leia.nextInt();
		
		System.out.println("Digite o primeiro Numero: ");
		int numero2 = leia.nextInt();
		
		System.out.println("Digite o primeiro Numero: ");
		int numero3 = leia.nextInt();
		
		if(numero1 > maior) {
			maior = numero1;
		}
		if(numero2 > maior) {
			maior = numero2;
		}
		if(numero3 > maior) {
			maior = numero3;
		}
		
		System.out.println("O maior número digitado foi: " + maior);
	}

}
