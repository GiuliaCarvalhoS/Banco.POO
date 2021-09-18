
import java.util.ArrayList;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Random;

public class ContaCorrente {
	

	private int agencia;
	private int numero;
	private ArrayList<Transacao> transacao;
	private Cliente cliente;
	private float saldo;

	DateTimeFormatter formatoDataHora = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");


		// CONSTRUCTOR  
	public ContaCorrente( Cliente cliente) {
		Random random = new Random(); //para gerar de forma pseudo aleatoria os numeros das conta corrente
		this.transacao = new ArrayList<>(); 
		this.agencia = random.nextInt(100) +10;
		this.numero = random.nextInt(10000) + 1000;
		this.cliente = cliente;
	}


	//<------Métodos getters e setters------>

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
	



 //<------------Metodos----------->

	//Método público para depositar um valor na conta (adicionar uma transação)
	public void depositar(String descricao, float valor) {
	
	
		//verificação para validar valor de deposito negativo. O programa não permite depositos negativos.
				
			
			if(valor < 0){
			valor= valor *(-1);
		}

		Transacao trans = new Transacao(descricao, valor);
		this.transacao.add(trans);

		this.setSaldo(this.getSaldo() +valor);

		


		//controle caso a descrição do deposito seja vazio, ele irá automaticamente colocar a data no lugar da descrição
		if (descricao.isEmpty()) {
			String autoDescricao = "Transação realizada no dia:"+ formatoDataHora.format(LocalDateTime.now());
			System.out.println("Descrição da transferencia: "+ autoDescricao);
			
		}else{
			
			System.out.println("Descrição da transferencia: "+ descricao);
		}

		
		System.out.println("Foi depositado o valor de: "+ valor); //Informa na tela o valor depositado
	

	}

	public void retirar(float valor, String descricao) {
		// Metodo publico para retirar um valor da conta 
		float valorCorrigido;

		//Validar parametro descricao, caso esteja vazio é autoameticamente preenchido com data e hora
		if (descricao.isEmpty()) {
			String autoDescricao = "Transação realizada no dia:"+ formatoDataHora.format(LocalDateTime.now());

			
			System.out.println("Descrição da transferencia: "+ autoDescricao);
			
		}else{
			
			System.out.println("Descrição da transferencia: "+ descricao);
		}
		
		//validar se o valor é negativo, caso seja então é convertido para positivo para melhor controle do saldo em conta
		if(valor < 0){ 
		
			valorCorrigido = valor *(-1);

		}else{ valorCorrigido = valor;}
		

		//verificador caso o saldo seja menor do que o valor da retirada
		if (this.getSaldo() < valorCorrigido){
				float value = this.getSaldo();
				Transacao trans = new Transacao(descricao, value);
				this.transacao.add(trans);
				this.setSaldo(this.getSaldo() - value);
				System.out.println("Não foi possível realizar a transferencia de: "+ valorCorrigido);
				System.out.println("Então fora transferido um total de: "+ value);

				if (descricao.isEmpty()) {
					String autoDescricao = "Transação realizada no dia: "+ trans.getData();

					System.out.println("Descrição da transferencia: "+ autoDescricao);
				}	
	

				System.out.println("Descrição da transferencia: "+ descricao);

			}else {
			
			Transacao trans = new Transacao(descricao, valorCorrigido);
			this.transacao.add(trans);
			this.setSaldo(this.getSaldo() - valorCorrigido );
			System.out.println("Fora transferido um total de: "+ valorCorrigido*(-1));
			System.out.println("Descrição da transferencia: "+ descricao);
			
		}
		
		
	}



	public void extrato() {
		
		System.out.println("=======================EXTRATO=======================");
		System.out.println( );
		System.out.println("Número da agencia:" + getAgencia());
		System.out.println("Número da conta: " + getNumero());
		System.out.println("Cliente:" + cliente.getNome());
		
		System.out.println("==========================================");

		System.out.println("======================Transações=========================");

		for (Transacao t : transacao) {
			

			System.out.println();
			System.out.println("Valor da transação: " + t.getValor());
			System.out.println("Data da transação: "+ t.getData());

			
			System.out.println("Descrição da transação: " + t.getDescricao());
			System.out.println();
			System.out.println("=========================================================");
			
		}

		System.out.println("Saldo Atual: "+ this.getSaldo());
		System.out.println("Data e hora: "+formatoDataHora.format(LocalDateTime.now()));
		System.out.println();
	
	}

}


	