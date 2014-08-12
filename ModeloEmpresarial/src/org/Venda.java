package org;

public class Venda {

	private Vendedor vendedor;
	private Produto produto;
	private int mes;
	private int ano;
	
	public Venda(Vendedor vendedor, Produto produto, int mes, int ano) {
		this.vendedor = vendedor;
		this.produto = produto;
		this.mes = mes;
		this.ano = ano;
	}

	public Vendedor getVendedor() {
		return vendedor;
	}
	public void setVendedor(Vendedor vendedor) {
		this.vendedor = vendedor;
	}
	public Produto getProduto() {
		return produto;
	}
	public void setProduto(Produto produto) {
		this.produto = produto;
	}
	public int getMes() {
		return mes;
	}
	public void setMes(int mes) {
		this.mes = mes;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
}
