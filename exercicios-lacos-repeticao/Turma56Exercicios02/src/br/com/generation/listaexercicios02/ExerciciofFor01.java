package br.com.generation.listaexercicios02;

public class ExerciciofFor01 {
	public static void main(String[] args) {
		/*1- Informar todos os números de 1000 a 1999 que quando divididos por 11
			obtemos resto = 5. (FOR)*/
	
		int numero = 1000;
		
		for (int contador = 1000; contador < 2000; contador++) {
			if(numero%11 == 5) {
				System.out.println(numero + " | ");
			}
			numero++;
		}
		
	}
}
