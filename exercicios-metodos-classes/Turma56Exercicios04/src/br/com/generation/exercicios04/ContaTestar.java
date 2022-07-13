package br.com.generation.exercicios04;

public class ContaTestar {

	public static void main(String[] args) {

		Conta c1 = new Conta();
		
		c1.cliente = "Jonathan";
		c1.banco = "Next";
		c1.numeroConta = "124578-9";
		c1.agencia = 274;
		c1.saldo = 500;
		
		int pagamento = 200;
		int recebido = 700;
		
		System.out.println("Olá "+ c1.cliente + "\nSeja bem-vindo a sua conta "+ c1.banco);
		System.out.println("O número da sua conta conta é: " + c1.numeroConta + "\nE a sua agencia é: "+ c1.agencia);
		System.out.println("\n===================================================");
		System.out.println("     Extrato: ");
		System.out.println("===================================================");
		System.out.println("\nFoi realizado um pagamento de: "+ pagamento);
		
		c1.pagarConta(pagamento);
		System.out.println("Seu novo saldo é: " + c1.saldo);
		System.out.println("===================================================");
		System.out.println("\nVocê recebeu recebeu um valor de: " + recebido);
		c1.receberPagamento(recebido);
		System.out.println("Seu novo saldo é: "+ c1.saldo);
		System.out.println("===================================================");
	}

}
