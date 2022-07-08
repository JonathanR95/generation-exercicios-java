package br.com.generation.exercicioslacosrepeticao;

import java.util.Scanner;

public class ExercicioLacosCondicionais02 {

	public static void main(String[] args) {
		// 2- Faça um programa que entre com três números e coloque em ordem crescente.

		Scanner leia = new Scanner(System.in);
		
		int maior = 0, menor= 0, doMeio= 0;
		
		System.out.println("Digite o primeiro Numero: ");
		int numero1 = leia.nextInt();
		
		System.out.println("Digite o primeiro Numero: ");
		int numero2 = leia.nextInt();
		
		System.out.println("Digite o primeiro Numero: ");
		int numero3 = leia.nextInt();
		
		if(numero1 > numero2 && numero1 > numero3) {
			maior = numero1;
		}
		if(numero2 > numero1 && numero2 > numero3) {
			maior = numero2;
		}
		if(numero3 > numero1 && numero3 > numero2) {
			maior = numero3;
		}
		
		if(numero1 < numero2 && numero1 < numero3) {
			menor = numero1;
		}
		if(numero2 < numero1 && numero2 < numero3) {
			menor = numero2;
		}
		if(numero3 < numero1 && numero3 < numero2) {
			menor = numero3;
		}
		
		if(numero1 != maior && numero1 != menor) {
			doMeio = numero1;
		}
		if(numero2 != maior && numero2 != menor) {
			doMeio = numero2;
		}	
		if(numero3 != maior && numero3 != menor) {
			doMeio = numero3;
		}
		
		System.out.println("O maior numero é: "+ maior +".\nO numero do meio é: "+ doMeio +".\nE o menor é: "+ menor+".");
		
	}

}
