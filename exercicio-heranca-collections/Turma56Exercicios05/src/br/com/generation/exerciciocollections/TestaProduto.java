package br.com.generation.exerciciocollections;

import java.util.ArrayList;
import java.util.Scanner;

public class TestaProduto {

	public static void main(String[] args) {

		Scanner leia = new Scanner(System.in);
		ArrayList<Produto> produtos = new ArrayList<>();
		
		System.out.println("Quantos produtos deseja inserir? ");
		int numeroProdutos = leia.nextInt();
		
		for (int i = 0; i < numeroProdutos; i++) {
			System.out.println("Digite o nome do produto: ");
			String nome = leia.next();
			leia.nextLine();
			
			System.out.println("Digite o valor do produto: ");
			int valor = leia.nextInt();
			
			produtos.add(new Produto(nome, valor));
		}
		
		System.out.println("Deseja remover algum produto?\n [1]- sim | [2]- não : ");
		int resposta = leia.nextInt();
		
		while(resposta == 1 ) {
			for(int i = 0; i < produtos.size(); i++) {
				System.out.println("["+i +"] " + produtos.get(i));	
			}
			System.out.println("Qual o id do produto que deseja remover remover? ");
			int removeProdutos = leia.nextInt();
		
			produtos.remove(produtos.get(removeProdutos));
			
			System.out.println("Lista atualizada:\n");
			//System.out.println(produtos);
		} 
			System.out.println("Fim do Programa...");		
		
	}

		
}
