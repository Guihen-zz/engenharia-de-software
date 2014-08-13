package org;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Financeiro {

	private List<Venda> vendas;
	private static Financeiro instancia = null;

	private Financeiro() {
		vendas = new LinkedList<Venda>();
	}
   
	public static Financeiro getInstancia() {
      if(instancia == null) {
         instancia = new Financeiro();
      }
      return instancia;
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

	public List<Venda> getVendasDeFuncionario(Funcionario funcionario) {
		LinkedList<Venda> vendasDoFuncionario = new LinkedList<Venda>();
		ListIterator<Venda> iteradorDeVendas = vendas.listIterator();
		while( iteradorDeVendas.hasNext()) {
			Venda venda = iteradorDeVendas.next();
			if( venda.getVendedor().getNome().equals( funcionario.getNome())) {
				vendasDoFuncionario.add( venda);
			}
		}
		return vendasDoFuncionario;
	}
	
}
