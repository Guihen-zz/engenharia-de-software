package org;

public class Experimento {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Secretaria 	secretaria = new Secretaria( 123, 2000, 1850, "Amanda");
		Vendedor 	vendedor1 = new Vendedor(12341, 2010, 1350, (float) 0.05, "Gustavão"),
					vendedor2 = new Vendedor(12342, 2012, 1150, (float) 0.08, "Adolfo");
		Empresa empresa = new Empresa();
		Financeiro financeiro = Financeiro.getInstancia();
		empresa.contrata( secretaria);
		empresa.contrata( vendedor1);
		empresa.contrata( vendedor2);
		
		financeiro.registraVenda( new Venda( vendedor1, new Produto( 90, (float) 12.5), 12, 2013));
		financeiro.registraVenda( new Venda( vendedor1, new Produto( 12, (float) 7.15), 1, 2014));
		financeiro.registraVenda( new Venda( vendedor1, new Produto( 102, (float) 70.10), 4, 2014));
		financeiro.registraVenda( new Venda( vendedor2, new Produto( 109, (float) 42), 2, 2014));
		financeiro.registraVenda( new Venda( vendedor2, new Produto( 109, (float) 42), 8, 2014));
		
		System.out.println("A folha de pagamento deste mes corresponde a: " + 
				empresa.calculaValorDaFolhaDePagamento() + " reais.");
	}

}
