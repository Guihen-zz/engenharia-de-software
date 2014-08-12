package org;

import java.util.LinkedList;
import java.util.List;

public class Empresa {

	private List <Funcionario> funcionarios;
	private Financeiro financeiro;
	
	public Empresa() {
		funcionarios = new LinkedList<Funcionario>();
	}

	public void setFuncionarios(List <Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List <Funcionario> getFuncionarios() {
		return funcionarios;
	}

	public void setFinanceiro(Financeiro financeiro) {
		this.financeiro = financeiro;
	}

	public Financeiro getFinanceiro() {
		return financeiro;
	}
	
	public void contrata(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		
	}

	public void contrata(Financeiro financeiro) {
		this.financeiro = financeiro;
	}
}
