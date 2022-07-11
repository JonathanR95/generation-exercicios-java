package br.com.generation.listaexercicios02;

import java.util.Scanner;

public class ExercicioWhile02 {

	public static void main(String[] args) {
		/*Uma empresa desenvolveu uma pesquisa para saber as características
		psicológicas dos indivíduos de uma região. Para tanto, a cada uma das pessoas
		era perguntado: idade, sexo (1-feminino / 2-masculino / 3-Outros), e as opções
		(1, se a pessoa era calma; 2, se a pessoa era nervosa e 3, se a pessoa era
		agressiva). Pede-se para elaborar um sistema que permita ler os dados de 150
		pessoas, calcule e mostre: (WHILE)
		o número de pessoas calmas;
		o número de mulheres nervosas;
		o número de homens agressivos;
		o número de outros calmos;
		o número de pessoas nervosas com mais de 40 anos;
		o número de pessoas calmas com menos de 18 anos.*/

		Scanner leia = new Scanner(System.in);
	
		int contador = 0,genero,idade, caracteristica; 
		int calmos = 0, mulheresNervosas = 0, homensAgressivos = 0, outrosCalmos = 0, idososNervosos = 0, jovensCalmos = 0;
		
		while(contador <= 150) {
			System.out.println("qual a idade da pessoa: ");
			idade = leia.nextInt();
			System.out.println("qual o genero da pessoa(1- Masculino; 2- Feminino; 3- Outros): ");
			genero = leia.nextInt();
			System.out.println("qual o caracteristica psicológica da pessoa(1- calma; 2- nervosa; 3- agressiva): ");
			caracteristica = leia.nextInt();
			
			if(caracteristica == 1) {
				calmos += 1;
			}
			if(genero == 2 && caracteristica == 2) {
				mulheresNervosas += 1;
			}
			if(genero == 1 && caracteristica == 3) {
				homensAgressivos += 1;
			}
			if(genero == 3 && caracteristica == 1) {
				outrosCalmos += 1;
			}
			if(idade > 40 && caracteristica == 2) {
				idososNervosos += 1;
			}
			if(idade < 18 && caracteristica ==1) {
				jovensCalmos += 1;
			}
			
			contador++;
		}System.out.println("Pessoas calmas: " + calmos);
		 System.out.println("Mulheres Nervosas: " + mulheresNervosas);
		 System.out.println("Homens Agressivos: " + homensAgressivos);
		 System.out.println("Pessoas de outros gêneros que são calmas: " + outrosCalmos);
		 System.out.println("Pessoas com mais de 40 anos que se consideram nervosas: " + idososNervosos);
		 System.out.println("Pessoas com menos de 18 anos que se consideram calmas: " + jovensCalmos);
		
		
	}

}
