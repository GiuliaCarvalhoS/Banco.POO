//i.	cria três instâncias de Cliente (e, consequentemente, 
//as respectivas instâncias de ContaCorrente com pelo menos 2 contas cada cliente)
//ii.	chama o método operar para cada instância de Cliente
//iii.	imprime os resultados

public class Banco {

	public static void main(String[] args) {

			Cliente andre = new Cliente("Andre");

			Cliente giulia = new Cliente("Giulia");

			Cliente luca = new Cliente("Luca");
	

		ContaCorrente BancoBrasil = new ContaCorrente( andre);
		ContaCorrente Next = new ContaCorrente(andre);

		ContaCorrente Nubak = new ContaCorrente( giulia);
		ContaCorrente Neon = new ContaCorrente( giulia);

		ContaCorrente  Itau = new ContaCorrente( luca);
		ContaCorrente Santander = new ContaCorrente( luca);
		
		 andre.setContaCorrentes(BancoBrasil);
		 andre.setContaCorrentes(Next);
		 
		 giulia.setContaCorrentes(Nubak);
		 giulia.setContaCorrentes(Neon);

		 luca.setContaCorrentes(Itau);
		 luca.setContaCorrentes(Santander);


		 andre.operar();
		 giulia.operar();
		 luca.operar();
		//  andre.imprimir();


	//Deus Esta Morto!!!

		 
		




		



	
		


		

	
		
		


	}
}
