package org;

import java.util.List;
import java.util.ListIterator;

public class Vendedor extends Funcionario {
	
	private float percentualDeComicao;

	public Vendedor(int matricula, int anoDeContratacao, float salarioBase,	float percentualDecomissao, String nome) {
		super(matricula, anoDeContratacao, salarioBase, nome);
		this.percentualDeComicao = percentualDecomissao;
	}

	public void setPercentualDeComicao(float percentualDeComicao) {
		this.percentualDeComicao = percentualDeComicao;
	}

	public float getPercentualDeComicao() {
		return percentualDeComicao;
	}
	
	public float calculaSalario( int mes, int ano) {
		float vendasDoMesDoFuncionario = calculaVendasDoMes( 
				Financeiro.getInstancia().getVendasDeFuncionario( this), mes, ano);
		return getSalarioBase() + vendasDoMesDoFuncionario * percentualDeComicao;
	}
	
	private float calculaVendasDoMes(List<Venda> vendas, int mes, int ano) {
		float vendasDoMes = 0;
	    ListIterator<Venda> iteradorDeVendas = vendas.listIterator();
	    while( iteradorDeVendas.hasNext()) {
	    	Venda venda = iteradorDeVendas.next();
	    	if( venda.getAno() == ano && venda.getMes() == mes) {
	    		vendasDoMes += venda.getProduto().getValor();
	    	}
	    }
		return vendasDoMes;
	}
}
