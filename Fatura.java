package com.catolica;

public class Fatura {

	private String codigo;
	private String descricao;
	private Integer qtd;
	private double preco;
	
	
	public Fatura(String codigo, String descricao, Integer qnt, double preco) {
		super();
		this.codigo = codigo;
		this.descricao = descricao;
		this.qtd = qnt;
		this.preco = preco;
	}
	
	
	public double totalFaturado() {
		
		double total = qtd * preco;
			return total;
	}
	
	
	
}



