/*
2.	Classe ContaCorrente
a.	Contém os seguintes atributos privados:
i.	agencia, do tipo int
ii.	numero, do tipo int
iii.	array do tipo ArrayList de Transacao
iv.	cliente, do tipo Cliente
b.	Contém os seguintes métodos públicos:
i.	Construtor, getters e setters (verificando se os dados estão validos)
ii.	depositar um valor na conta (adicionar uma transação)
iii.	retirar um valor da conta (adicionar uma transação), desde que o saldo não fique negativo; deve retornar o valor efetivamente retirado. 
Ex. Saldo R$10,00 – retirar $25,00 – Transação criada vai ser de $-10. Saldo ficar 0
iv.	retornar o saldo da conta (somando todas as transações)
v.	extrato todos os dados da conta corrente, suas transações 
c.	Possui a seguinte invariante: o saldo nunca é negativo.
*/

import java.util.ArrayList;

public class ContaCorrente {

	private int agencia;
	private int numero;
	private ArrayList<Transacao> transacao;
	private Cliente cliente;

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numero) {
		this.numero = numero;
	}

	public ArrayList<Transacao> getTransacao() {
		return this.transacao;
	}

	public void setTransacao() {
		this.transacao = new ArrayList<Transacao>();
	}

	public String getCliente() {
		return this.cliente.getNome();
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	// CONSTRUCTOR
	public ContaCorrente(int agencia, int numero, Cliente cliente) {
		this.transacao = new ArrayList<>();
		this.agencia = agencia;
		this.numero = numero;
		this.cliente = cliente;
	}

	/*
	 * 
	 * public void depositar(ContaCorrente conta, Transacao transacao) {
	 * 
	 * }
	 * 
	 */

	public void depositar(float v) {
		float deposito = v;
		Transacao trans = new Transacao("pudim", deposito);
		this.transacao.add(trans);

	}

	public void retirar(float valor) {
		int saldo = 0;
		// um valor da conta (adicionar uma transação), desde que o saldo não fique
		// negativo; deve retornar o valor efetivamente retirado.
		// Ex. Saldo R$10,00 – retirar $25,00 – Transação criada vai ser de $-10. Saldo
		// ficar 0

		/*
		 * if (0 < valor && getSaldo() > valor){ setSaldo( getSaldo() - valor);
		 */
	}

	public float retornar(ArrayList<Transacao> array) {
		return 0;
		// o saldo da conta (somando todas as transações)
	}

	public void extrato() {
		// return this.transacao.get(0).getDescricao().toString();

		System.out.println("numero da agencia:" + getAgencia());
		System.out.println("Numero da conta: " + getNumero());
		System.out.println("Cliente:" + cliente.getNome());

		// System.out.println(getCliente());

		for (Transacao t : transacao) {
			System.out.println("Valor da transação: " + t.getValor());
			System.out.println("Descrição da transação: " + t.getDescricao());
		}
	}

}
