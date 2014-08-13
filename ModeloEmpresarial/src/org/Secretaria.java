package org;

public class Secretaria extends Funcionario {

	public Secretaria(int matricula, int anoDeContratacao, float salarioBase,
			String nome) {
		super(matricula, anoDeContratacao, salarioBase, nome);
	}
	
	@Override
	public float calculaSalario( int mes, int ano) {
		float adicionalPorTempo = 0;
		// Falta a informacao mesDeContratacao para o calculo exato.
		int tempoDeCasa = ano - getAnoDeContratacao();
		while( tempoDeCasa >= 2 && adicionalPorTempo < 0.25) {
			adicionalPorTempo += 0.05;
			tempoDeCasa -= 2;
		}
		
		return getSalarioBase() + getSalarioBase() * adicionalPorTempo;
	}
	
}
