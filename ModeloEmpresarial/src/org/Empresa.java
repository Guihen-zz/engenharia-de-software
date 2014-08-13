package org;

import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class Empresa {

	private List <Funcionario> funcionarios;
	
	public Empresa() {
		funcionarios = new LinkedList<Funcionario>();
	}

	public void setFuncionarios(List <Funcionario> funcionarios) {
		this.funcionarios = funcionarios;
	}

	public List <Funcionario> getFuncionarios() {
		return funcionarios;
	}
	
	public void contrata(Funcionario funcionario) {
		this.funcionarios.add(funcionario);
		
	}

	public float calculaValorDaFolhaDePagamento() {
	    float folhaDePagamento = 0;
	    Calendar calendar = Calendar.getInstance();
	    int ano = calendar.get(Calendar.YEAR);  
	    int mes = calendar.get(Calendar.MONTH)+1;
	    
	    ListIterator<Funcionario> iteradorDeFuncionarios = funcionarios.listIterator();
	    while( iteradorDeFuncionarios.hasNext()) {
			folhaDePagamento += iteradorDeFuncionarios.next().calculaSalario( mes, ano); 
		}
		return folhaDePagamento;
	}

	
}
