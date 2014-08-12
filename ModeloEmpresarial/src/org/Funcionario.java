package org;

public class Funcionario {

	private int matricula;
	private int anoDeContratacao;
	private float salarioBase;
	private String nome;
	
	public Funcionario(int matricula, int anoDeContratacao, float salarioBase, String nome) {
		this.matricula = matricula;
		this.anoDeContratacao = anoDeContratacao;
		this.salarioBase = salarioBase;
		this.nome = nome;
	}

	public int getMatricula() {
		return matricula;
	}
	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	public int getAnoDeContratacao() {
		return anoDeContratacao;
	}
	public void setAnoDeContratacao(int anoDeContratacao) {
		this.anoDeContratacao = anoDeContratacao;
	}
	public float getSalarioBase() {
		return salarioBase;
	}
	public void setSalarioBase(float salarioBase) {
		this.salarioBase = salarioBase;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
}
