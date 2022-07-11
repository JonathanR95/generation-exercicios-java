package br.com.generation.listaexercicios02;

import java.util.Scanner;

public class ExercicioDoWhile01 {

	public static void main(String[] args) {
		/*5- Crie um programa que leia um número do teclado até que encontre um
		número igual a zero. No final, mostre a soma dos números
		digitados.(DO...WHILE)*/

		int numero, soma = 0;
		
		Scanner leia = new Scanner(System.in);
		
		do {
			System.out.println("Digite um número para somar ou zero para finalizar o programa: ");
			numero = leia.nextInt();
			soma +=numero;
		}while(numero != 0);
			System.out.println("A soma do numeros é: " + soma);
		
	}

}
