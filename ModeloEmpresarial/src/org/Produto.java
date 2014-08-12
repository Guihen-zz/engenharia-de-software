package org;

public class Produto {
	
	private int codigo;
	private float valor;
	
	public Produto(int codigo, float valor) {
		this.codigo = codigo;
		this.valor = valor;
	}
	public int getCodigo() {
		return codigo;
	}
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	public float getValor() {
		return valor;
	}
	public void setValor(float valor) {
		this.valor = valor;
	}

}
