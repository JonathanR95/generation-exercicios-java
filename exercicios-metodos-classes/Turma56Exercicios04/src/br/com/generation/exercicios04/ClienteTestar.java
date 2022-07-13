package br.com.generation.exercicios04;

public class ClienteTestar {

	public static void main(String[] args) {

		Cliente c1 = new Cliente();
		
		c1.nome = "João";
		c1.pedido = "Dobradinha";
		c1.conta = 53;
		
		
		System.out.println("A conta do cliente deu: "+ c1.conta + " reais");
		
		int pagamento = 50;
		System.out.println("ele pagou: " + pagamento);
		
		c1.pagarConta(pagamento);
		System.out.println("Ainda falta pagar: " + c1.conta);
		

	}

}
