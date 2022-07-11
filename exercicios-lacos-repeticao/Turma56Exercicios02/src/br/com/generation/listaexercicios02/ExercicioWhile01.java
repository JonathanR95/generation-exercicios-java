package br.com.generation.listaexercicios02;

import java.util.Scanner;

public class ExercicioWhile01 {

	public static void main(String[] args) {
		// Solicitar a idade de várias pessoas e imprimir: Total de pessoas com menos de
		//21 anos. Total de pessoas com mais de 50 anos. O programa termina quando
		//idade for =-99. (WHILE)

		int idade = 0, menosDe21 = 0, maisDe50 = 0, totalPessoas = 0;
		
		Scanner leia = new Scanner(System.in);
		
		while(idade != -99) {
			System.out.println("Digite a idade da pessoa, ou -99 para encerrar o programa: ");
			idade = leia.nextInt();
			if(idade == -99) {
				break;
			}
			if(idade <= 20) {
				menosDe21 += 1;
			}else if(idade > 50) {
				maisDe50 += 1;
			}
		totalPessoas++;
			
		}System.out.println("O total de pessoas é: " + totalPessoas);
		System.out.println(menosDe21 +" pessoas tem menos de 21 anos");
		System.out.println(maisDe50 +" pessoas tem mais de 50 anos");
		
		
	}

}
