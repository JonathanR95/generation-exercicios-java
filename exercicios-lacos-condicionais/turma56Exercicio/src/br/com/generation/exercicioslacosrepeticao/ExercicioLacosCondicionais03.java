package br.com.generation.exercicioslacosrepeticao;

import java.util.Scanner;

public class ExercicioLacosCondicionais03 {
	public static void main(String[] args) {
		/*3- Faça um programa que receba a idade de uma pessoa e mostre na saída em qual
			categoria ela se encontra:
				 10-14 infantil
				 15-17 juvenil
				 18-25 adulto*/
		
		Scanner leia = new Scanner(System.in);
		
		System.out.println("Digite a sua idade: ");
		int idade = leia.nextInt();
		
		if(idade > 10 && idade <= 14) {
			System.out.println("Categoria: infantil");
		}else if(idade > 14 && idade <= 17) {
			System.out.println("Categoria: juvenil");
		}else if(idade > 17 && idade <= 25) {
			System.out.println("Categoria: adulto");
		}
			
		
		
		
	}
	
	
}
