package org;

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
}
