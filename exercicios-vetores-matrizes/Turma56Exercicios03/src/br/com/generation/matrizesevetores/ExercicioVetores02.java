package br.com.generation.matrizesevetores;

import java.util.Random;

public class ExercicioVetores02 {
	
	public static void main(String[] args) {
	
		/*
		 * Um dado é lançado 10 vezes e o valor correspondente é anotado. Faça um programa
		que gere um vetor com os lançamentos, escreva esse vetor. A seguir determine e
		imprima a média aritmética dos lançamentos, contabilize e apresente também
		quantas foram as ocorrências da maior pontuação.*/
		
		int[] sorteio = new int[10];
		int ocorrencia = 0, maior = 0;
		double soma = 0.0, media = 0.0;
		
		Random gerador = new Random();
		
		for(int i = 0; i < 10; i++) {
			sorteio[i] = gerador.nextInt(6)+1;
			soma += sorteio[i];
			media = soma / sorteio.length;
			System.out.print(sorteio[i]+ " | ");
			
			for(int x = 0; x< 10;x++) {
				if(maior < sorteio[i]) {
					maior = sorteio[i]; 
				}
				
			}
			if(sorteio[i] == 6 && maior == 6) {
				ocorrencia++;
			}else if(sorteio[i] == 5 && maior == 5) {
				ocorrencia++;
			}
		}
		System.out.println("\n==========================================");
		System.out.println("A media dos numero é igual a: "+ media);
		System.out.println("O maior número é : " + maior);
		System.out.println("E Ele apareceu "+ ocorrencia+ " vezes");
	}
}








