package br.com.generation.exercicioherança;

public class TestaAnimais {

	public static void main(String[] args) {
		
		Cachorro c1 = new Cachorro();
		
		c1.setNome("Pipoca");
		c1.setIdade(7);
		
		
		System.out.println("Nome do Cachorro: "+ c1.getNome());
		System.out.println("Idade do Cachorro: "+ c1.getIdade());
		System.out.print("Som do cachorro: ");
		c1.emitirSom();
		System.out.print("Estado do cachorro: ");
		c1.correr();
		//==================================================
		
		Cavalo ca1 = new Cavalo();
		
		ca1.setNome("Furioso");
		ca1.setIdade(15);
		
		System.out.println("\n//==================================================");
		System.out.println("\nNome do Cavalo: "+ ca1.getNome());
		System.out.println("Idade do Cavalo: "+ ca1.getIdade());
		System.out.print("Som do cavalo: ");
		ca1.emitirSom();
		System.out.print("Estado do cavalo: ");
		ca1.correr();
		
		//==================================================
		
		Preguica p1 = new Preguica();
		
		p1.setNome("Dorminhoca");
		p1.setIdade(10);
		
		System.out.println("\n//==================================================");
		System.out.println("\nNome da preguiça: "+ p1.getNome());
		System.out.println("Idade da preguiça: "+ p1.getIdade());
		System.out.print("Som da preguiça: ");
		p1.emitirSom();
		System.out.print("Estado da preguiça: ");
		p1.subirArvore();
		
	}
}
