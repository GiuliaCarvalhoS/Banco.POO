/*
1.	Classe Transacao
a.
b.	Contém os seguintes métodos públicos:
i.	Construtor, getters e setters (verificando se os dados estão validos)
ii.	imprimir todos os dados da transação

*/

import java.time.LocalDate;

public class Transacao {
	// Cria mais os seguintes atributos privados: descricao, do tipo String; data, do tipo LocalDate ; valor, do tipo float 

	private String descricao;
	private LocalDate data;
	private float valor;


	// Construtor que istancia os objetos data (com localDate) e valor
	public Transacao(String descricaoDaTransacao, float valor) {
		
		this.data = LocalDate.now();
		this.valor = valor;

		//caso não seja inserida uma descrição, ele cria a descrição aprensentando o horario
		if (descricaoDaTransacao.isEmpty()) {
			this.descricao = "Transação realizada no dia: " + data.getDayOfMonth() + "/" + data.getMonthValue() + "/"+ data.getYear();
		}else{
			this.descricao = descricaoDaTransacao;
		}
	}

	public void imprimir() {
		System.out.println(this.getDescricao());
		System.out.println(this.getData());
		System.out.println(this.getValor());
		// Tem mais coisa aqui, mas ver oq fazer
	}

	public String getDescricao() {
		return this.descricao;
	}
	

	public String getData() {
		return  data.getDayOfMonth() + "/" + data.getMonthValue() + "/"
					+ data.getYear();
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public float getValor() {
		return this.valor;
	}

	public void setValor(float valor) {
	
			this.valor = valor;
		
	}

	
}

