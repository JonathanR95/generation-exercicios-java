package br.com.generation.listaexercicios02;

import java.util.Scanner;

public class ExercicioFor02 {

	public static void main(String[] args) {
		//2- Ler 10 números e imprimir quantos são pares e quantos são ímpares. (FOR)

		Scanner leia = new Scanner(System.in);
		
		int numero = 0, i;
		int pares = 0;
		int impares = 0;
		
		for(i =0; i < 10; i++) {
			System.out.println((i + 1)+ "° número: ");
			numero = leia.nextInt();
			if(numero%2 == 0) {
				pares += 1;	
			}else {
				impares += 1;
			}
		}System.out.println(pares + " numeros são pares");
		System.out.println(impares + " numeros são impares");
	}

}
