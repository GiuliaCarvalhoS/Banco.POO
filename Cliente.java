/*3.	Classe Cliente
a.	Contém os seguintes atributos privados:
i.	nome, do tipo String
ii.	conta correntes , do tipo ArrayList de ContaCorrente
b.	Contém os seguintes métodos públicos:
i.	construtor (que também constrói o array de ContaCorrente), getters e setters
ii.	operar, que chama ao menos 3 vezes os métodos para depositar, retirar, verificar saldo e imprimir os dados da respectiva conta corrente
iii.saldo total, com o da conta correntes.
iv.	Imprimir: que imprime todos os dados do cliente e das respectivas contas.

*/

import java.util.ArrayList;
import java.util.Scanner;

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
		this.contaCorrentes.add(conta);
	}

	public void operar() {

		for(ContaCorrente c: contaCorrentes){


			System.out.println("==========================");
			System.out.println("Cliente: "+ c.getCliente());
			System.out.println("Agencia: "+ c.getAgencia());
			System.out.println("Conta: "  + c.getNumero());
			System.out.println("------------------------------------------");

			Scanner scanner = new Scanner(System.in);


			

			System.out.println("Descrição para o deposito da conta "+ c.getCliente());
    		String descricaoDeposito =scanner.nextLine();
		
			System.out.println("Informe o valor para o deposito: ");
			Float valorDeposito = scanner.nextFloat();


			c.depositar( descricaoDeposito ,valorDeposito);

			System.out.println("------------------------------------------");

			// Scanner scanner1 = new Scanner(System.in);

			System.out.println("Descrição para o segundo deposito da conta "+ c.getCliente());
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

			System.out.println("Saldo atual:"+c.getSaldo());

			System.out.println("------------------------------------------");

			System.out.println("---------------Transferir----------------");

			
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

			
			System.out.println("Descrição da retirada: ");
			scanner.nextLine();
			String descricaoRetirada3 =scanner.nextLine();
			System.out.println("Informe o valor para o retirada: ");
			Float valorRetirada3 = scanner.nextFloat();
			c.retirar(valorRetirada3, descricaoRetirada3);
		
			

			

			System.out.println("Saldo atual:"+c.getSaldo());

			

			System.out.println("===========END===============");

			
		}
	}

	public void saldoTotal() {
		for(ContaCorrente c: contaCorrentes){
			System.out.println("O saldo da conta nº: " + c.getNumero() +" Agencia: " +c.getAgencia()+" é de: "+" R$"+ c.getSaldo());

		}

	}

	public void imprimir() {

		System.out.println("===========================");
		System.out.println("Cliente: "+this.getNome());
		System.out.println("");

		int cont = 1;
		for(ContaCorrente c: contaCorrentes){

			System.out.println("conta: "+cont);

			System.out.println("Agencia: " +c.getAgencia());
			System.out.println("Número: "+c.getNumero());
			System.out.println("------------------------------");
			cont = cont +1;
			
		}

	}

}
