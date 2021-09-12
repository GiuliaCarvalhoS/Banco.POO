/*3.	Classe Cliente
a.	Contém os seguintes atributos privados:
i.	nome, do tipo String
ii.	conta correntes , do tipo ArrayList de ContaCorrente
b.	Contém os seguintes métodos públicos:
i.	construtor (que também constrói o array de ContaCorrente), getters e setters
ii.	operar, que chama ao menos 3 vezes os métodos para depositar, retirar, verificar saldo e imprimir os dados da respectiva conta corrente
iii.	saldo total, com o da conta correntes.
iv.	Imprimir: que imprime todos os dados do cliente e das respectivas contas.

*/

import java.util.ArrayList;

public class Cliente {

	private String nome;
	private ArrayList<ContaCorrente> contaCorrentes;

	public Cliente(String nome) {
		this.nome = nome;
		this.contaCorrentes = new ArrayList<ContaCorrente>();
	}

	public String getNome() {
		return this.nome;
	}

	public void setNome(String nome) {
		this.nome = nome;

	}

	public ArrayList<ContaCorrente> getContaCorrentes() {
		return this.contaCorrentes;
	}

	public void setContaCorrentes(ContaCorrente conta) {
		// ContaCorrente cont = new ContaCorrente();
		this.contaCorrentes.add(conta));
	}

	public void operar() {

	}

	public void saldoTotal() {

	}

	public void imprimir() {
		System.out.println("Dados" + getContaCorrentes());

	}

}
