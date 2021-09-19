

public class Banco {

	//Método main
	public static void main(String[] args) {

		//Cria três instâncias de Cliente
			Cliente andre = new Cliente("Andre");

			Cliente giulia = new Cliente("Giulia");

			Cliente luca = new Cliente("Luca");
	
		// Cria as respectivas instâncias de ContaCorrente com pelo menos duas contas cada cliente

		ContaCorrente BancoBrasil = new ContaCorrente( andre);
		ContaCorrente Next = new ContaCorrente(andre);

		ContaCorrente Nubak = new ContaCorrente( giulia);
		ContaCorrente Neon = new ContaCorrente( giulia);

		ContaCorrente  Itau = new ContaCorrente( luca);
		ContaCorrente Santander = new ContaCorrente( luca);
		
		// Getters e setters de ContaCorrentes  
		 andre.setContaCorrentes(BancoBrasil);
		 andre.setContaCorrentes(Next);
		 
		 giulia.setContaCorrentes(Nubak);
		 giulia.setContaCorrentes(Neon);

		 luca.setContaCorrentes(Itau);
		 luca.setContaCorrentes(Santander);

		//Chama o método operar (input de descicao e valor e dados da transação)  e imprimir (extrato) para cada instância de Cliente

		andre.operar();
		giulia.operar();
		luca.operar();
		giulia.imprimir();
		andre.imprimir();
		luca.imprimir();


		 
		




		



	
		


		

	
		
		


	}
}
