//i.	cria três instâncias de Cliente (e, consequentemente, 
//as respectivas instâncias de ContaCorrente com pelo menos 2 contas cada cliente)
// //ii.	chama o método operar para cada instância de Cliente
// //iii.	imprime os resultados

public class Banco {

	public static void main(String[] args) {

		Cliente andre = new Cliente("Andre");

		ContaCorrente um = new ContaCorrente(222, 121212, andre);

		Transacao trans = new Transacao("oioioi", 0.55f);

		andre.setContaCorrentes(um);

		um.depositar(0.505f);

		um.extrato();

		// System.out.println(scoror);

	}

}
