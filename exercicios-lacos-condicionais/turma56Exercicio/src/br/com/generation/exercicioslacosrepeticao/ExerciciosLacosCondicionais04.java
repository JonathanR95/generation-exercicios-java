package br.com.generation.exercicioslacosrepeticao;

import java.util.Scanner;

public class ExerciciosLacosCondicionais04 {
	public static void main(String[] args) {
		/*4- Faça um programa em que permita a entrada de um número qualquer e exiba se este
		número é par ou ímpar. Se for par exiba também a raiz quadrada do mesmo; se for
		ímpar exiba o número elevado ao quadrado.*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite um numero: ");
		double numero = leia.nextDouble();
		
		double guardarNumero;
		
		if(numero % 2 == 0) {
			numero = Math.sqrt(numero);
			System.out.println("O número é par e sua raiz quadrada é: "+ numero);
		}else {
			guardarNumero = numero;
			numero *= numero;
			System.out.println("O numero é impar e "+ guardarNumero +" elevado ao quadrado é: "+ numero );
		}
	}
}
