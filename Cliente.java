
//Importações 
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Random;

public class Cliente {

	//Cria o atributo privado "nome" do tipo String
	//Cria o atributo privado "contaCorrentes" , do tipo ArrayList de ContaCorrente

	private String nome;
	private ArrayList<ContaCorrente> contaCorrentes;


	//Cria uma lista de tipo de contas
	
	String[] tipoConta = {"Poupança", "Corrente"}; //Lista a ser utilizada no array, para controle aleatorio de contas
	Random random = new Random();
	

	//Contructor da classe Cliente
	public Cliente(String nome) {
		this.nome = nome;
		this.contaCorrentes = new ArrayList<ContaCorrente>();	
	}

	//Getters e setters do atributo "nome" e do atributo "contaCorrentes"
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
		this.contaCorrentes.add(conta);
	}

	public void operar() {

	//Cria o método operar	

		for(ContaCorrente c: contaCorrentes){
			//Recebe o tipo de conta (poupança ou corrente)
			int randomIndex = random.nextInt(tipoConta.length);

			//Imprimi os dados da respectiva conta corrente

			System.out.println("###########################");
			System.out.println("Conta do tipo: "+ tipoConta[randomIndex] );
			System.out.println("Cliente: "+ c.getCliente());
			System.out.println("Agencia: "+ c.getAgencia());
			System.out.println("Conta: "  + c.getNumero());
			System.out.println("############################");
			System.out.println("------------------------------------------");

			//Pede a inserção de descrição e valor do deposito, chamando o método depósitar 3 vezes

			Scanner scanner = new Scanner(System.in);

			System.out.println("Descrição para o deposito da conta "+ c.getCliente());
    		String descricaoDeposito =scanner.nextLine();
		
			System.out.println("Informe o valor para o deposito: ");
			Float valorDeposito = scanner.nextFloat();


			c.depositar(descricaoDeposito ,valorDeposito);

			System.out.println("------------------------------------------");

			// Scanner scanner1 = new Scanner(System.in);

			System.out.println("Descrição para o segundo depósito da conta: "+ c.getCliente());
				scanner.nextLine();
    		String descricaoDeposito1 =scanner.nextLine();
			System.out.println("Informe o valor para o deposito: ");
			Float valorDeposito1 = scanner.nextFloat();


			c.depositar( descricaoDeposito1 ,valorDeposito1);
			

		System.out.println("------------------------------------------");

			

			System.out.println("Descrição para o terceiro deposito da conta "+ c.getCliente());
			scanner.nextLine();
    		String descricaoDeposito2 =scanner.nextLine();
			System.out.println("Informe o valor para o deposito: ");
			Float valorDeposito2 = scanner.nextFloat();


			c.depositar( descricaoDeposito2 ,valorDeposito2);

			//Imprime saldo após 3 depositos

			System.out.println("Saldo atual:"+c.getSaldo());

			System.out.println("------------------------------------------");

			System.out.println("---------------Transferir----------------");

			//Pede a inserção de descrição e valor a ser retirado da conta em questão, chamando o método retirar 3 vezes

			System.out.println("Descrição da retirada: ");
			scanner.nextLine();
			String descricaoRetirada1 =scanner.nextLine();
			System.out.println("Informe o valor para o retirada: ");
			Float valorRetirada1 = scanner.nextFloat();
			c.retirar(valorRetirada1, descricaoRetirada1);

			
			
			System.out.println("Descrição da  segunda retirada: ");
			scanner.nextLine();
			String descricaoRetirada2 =scanner.nextLine();
			System.out.println("Informe o valor para o retirada: ");
			Float valorRetirada2 = scanner.nextFloat();
			c.retirar(valorRetirada2, descricaoRetirada2);

			
			System.out.println("Descrição da terceira retirada: ");
			scanner.nextLine();
			String descricaoRetirada3 =scanner.nextLine();
			System.out.println("Informe o valor para o retirada: ");
			Float valorRetirada3 = scanner.nextFloat();
			c.retirar(valorRetirada3, descricaoRetirada3);
		
			

			// imprimir saldo após 3 depósitos e 3 retiradas

			System.out.println("Saldo atual:"+c.getSaldo());

			

			System.out.println("===========END===============");

			
		}
	}
	//metodo que apresenta o saldo total, com o da conta correntes.
	public void saldoTotal() {
		for(ContaCorrente c: contaCorrentes){
			System.out.println("O saldo da conta nº: " + c.getNumero() +" Agencia: " +c.getAgencia()+" é de: "+" R$"+ c.getSaldo());

		}

	}

	public void imprimir() {
		int randomIndex = random.nextInt(tipoConta.length);

		System.out.println("===========================");
		System.out.println("Cliente: "+this.getNome());
		System.out.println("Conta do tipo: "+ tipoConta[randomIndex] );
		System.out.println("");

		//Array que irá percorrer cada conta corrente e imprimir seus dados:
		for(ContaCorrente c: contaCorrentes){

			

			System.out.println("Agencia: " +c.getAgencia());
			System.out.println("Número: "+c.getNumero());
			System.out.println("------------------------------");

			c.extrato();

			
		}

	}


}
