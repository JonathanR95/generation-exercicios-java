package br.com.generation.listaexercicios02;

import java.util.Scanner;

public class ExercicioDoWhile02 {
	public static void main(String[] args) {
		/*Escrever um programa que receba vários números inteiros no teclado. E no
		final imprimir a média dos números múltiplos de 3. Para sair digitar
		0(zero).(DO...WHILE)*/
		
		Scanner leia = new Scanner(System.in);
		
		double media = 0.0, numero = 0.0, i = 0.0;		
		do {
			System.out.println("Insira um número ou zero para sair do programa: ");
			numero = leia.nextInt();
			
			if(numero%3 == 0 && numero != 0) {
				i++;
				numero += numero;
				media = numero / i;	
			}
			
		}while(numero != 0);
		System.out.println("A média dos número multiplos de 3 é: " + media);
	}
}
