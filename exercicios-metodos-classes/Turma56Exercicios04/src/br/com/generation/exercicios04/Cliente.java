package br.com.generation.exercicios04;

public class Cliente {

	//atributos
	String nome;
	String pedido;
	int conta;
	
	//métodos
	void pagarConta(int valorPago) {
		conta -= valorPago;
	}
	
}
