//i.	cria três instâncias de Cliente (e, consequentemente, 
//as respectivas instâncias de ContaCorrente com pelo menos 2 contas cada cliente)
// //ii.	chama o método operar para cada instância de Cliente
// //iii.	imprime os resultados

public class Banco {

	public static void main(String[] args) {

			Cliente andre = new Cliente("Andre");

			Cliente giulia = new Cliente("Giulia");

			Cliente luca = new Cliente("Luca");
	

		ContaCorrente um = new ContaCorrente( andre);
		// ContaCorrente toto = new ContaCorrente( andre);
		
		ContaCorrente dois = new ContaCorrente( giulia);
		ContaCorrente doisA = new ContaCorrente( giulia);

		ContaCorrente tres = new ContaCorrente( luca);
		ContaCorrente a = new ContaCorrente( luca);
		
		 andre.setContaCorrentes(um);
		//  andre.setContaCorrentes(toto);
		 
		 giulia.setContaCorrentes(dois);
		 giulia.setContaCorrentes(doisA);

		 luca.setContaCorrentes(tres);
		 luca.setContaCorrentes(a);


		 andre.operar();
		 andre.imprimir();

		 
		

	//Validações q temos que fazer: depositar não pode ser negativo 
	//aparecer o horario no fim do cartao


		



	
		


		

	
		
		


	}
}
