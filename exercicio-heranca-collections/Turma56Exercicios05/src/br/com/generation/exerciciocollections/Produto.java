package br.com.generation.exerciciocollections;

public class Produto {

	private String nome;
	private int valor;

	
	
	public Produto(String nome, int valor) {
		super();
		this.nome = nome;
		this.valor = valor;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public int getValor() {
		return valor;
	}


	public void setValor(int valor) {
		if(valor > 0) {
		this.valor = valor;
		}
	}


	@Override
	public String toString() {
		return "Produto: " + nome + "|  Valor: " + valor;
	}
	
	
	
	
}
