package org;

import java.util.LinkedList;
import java.util.List;

public class Financeiro {
	private List<Venda> vendas;
	
	public Financeiro() {
		vendas = new LinkedList<Venda>();
	}

	public void setVendas(List<Venda> vendas) {
		this.vendas = vendas;
	}

	public List<Venda> getVendas() {
		return vendas;
	}

	public void registraVenda(Venda venda) {
		this.vendas.add(venda);
	}
	
}
