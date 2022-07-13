package br.com.generation.exercicios04;

public class Conta {

	//atributos
	String cliente;
	String banco;
	String numeroConta;
	int agencia;
	double saldo;
	
	//metodos
	
	void pagarConta(int valor) {
		saldo -= valor;
	}
	
	void receberPagamento(double valor) {
		saldo += valor;
	}
	
}
