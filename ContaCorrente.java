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

import java.util.Random;

public class ContaCorrente {

	private int agencia;
	private int numero;
	private ArrayList<Transacao> transacao;
	private Cliente cliente;
	private float saldo;


		// CONSTRUCTOR
	public ContaCorrente( Cliente cliente) {
		Random random = new Random();
		this.transacao = new ArrayList<>();
		this.agencia = random.nextInt(100) +10;
		this.numero = random.nextInt(10000) + 1000;
		this.cliente = cliente;
	}


	//Metodos get e set

	public int getAgencia() {
		return this.agencia;
	}

	public void setAgencia(int agencia) {
		this.agencia = agencia;
	}

	public int getNumero() {
		return this.numero;
	}

	public void setNumero(int numeroDaConta) {
		this.numero = numeroDaConta;
	}

	public ArrayList<Transacao> getTransacao() {
		return this.transacao;
	}

	public void setTransacao(ArrayList<Transacao> transacao) {
		this.transacao = transacao;
	}

	public String getCliente() {
		return this.cliente.getNome();
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public float getSaldo(){
		return saldo;
	}
	



 //Metodos


	public void depositar(String descricao, float valor) {
		
		Transacao trans = new Transacao(descricao, valor);
		this.transacao.add(trans);

		this.setSaldo(this.getSaldo() +valor);



		if (descricao.isEmpty()) {
		String autoDescricao = "Transação realizada no dia:"+ trans.getData();

			// String autoDescricao = "Transação realizada no dia:" +Integer.toString( trans.getData().getDayOfMonth()) + "/" + trans.getData().getMonthValue() + "/" + trans.getData().getgetgetYear();
			
		System.out.println("Descrição da transferencia: "+ autoDescricao);
			
		}else{
			
		System.out.println("Descrição da transferencia: "+ descricao);
		}

		
		System.out.println("Foi depositado o valor de: "+ valor);
	

	}

	public void retirar(float valor, String descricao) {
		float valorCorrigido;
		
		if(valor < 0){
		
			valorCorrigido = valor *(-1);

		}else{ valorCorrigido = valor;}
		
		if (this.getSaldo() < valorCorrigido){
				float value = this.getSaldo();
				Transacao trans = new Transacao(descricao, value);
				this.transacao.add(trans);
				this.setSaldo(this.getSaldo() - value);
				System.out.println("Não foi possível realizar a transferencia de: "+ valorCorrigido);
				System.out.println("Então fora transferido um total de: "+ value);

				if (descricao.isEmpty()) {
					String autoDescricao = "Transação realizada no dia:"+ trans.getData();

					System.out.println("Descrição da transferencia: "+ autoDescricao);
				}	
	

				System.out.println("Descrição da transferencia: "+ descricao);

			}else{
			
			Transacao trans = new Transacao(descricao, valorCorrigido);
			this.transacao.add(trans);
			this.setSaldo(this.getSaldo() - valorCorrigido );
			System.out.println("Fora transferido um total de: "+ valorCorrigido*(-1));
			System.out.println("Descrição da transferencia: "+ descricao);
			
		}
		
		
		

		
	}



	public void extrato() {
		// return this.transacao.get(0).getDescricao().toString();
		System.out.println("==========================================");
		System.out.println(" EXTRATO	" );
		System.out.println("numero da agencia:" + getAgencia());
		System.out.println("Numero da conta: " + getNumero());
		System.out.println("Cliente:" + cliente.getNome());
		System.out.println("Saldo: "+ this.getSaldo());
		System.out.println("==========================================");

		// System.out.println(getCliente());

		for (Transacao t : transacao) {
			System.out.println("Valor da transação: " + t.getValor());
			System.out.println("Data da transação: "+ t.getData());
			System.out.println("Descrição da transação: " + t.getDescricao());
			System.out.println("============================================");
			System.out.println("AQUI TERMINA O EXTRATO");
		}

	
	}

}


	