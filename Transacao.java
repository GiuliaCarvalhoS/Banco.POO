/*
1.	Classe Transacao
a.	Contém os seguintes atributos privados:
i.	descricao, do tipo String
ii.	data, do tipo LocalDate
iii.	valor, do tipo float (que pode ser positivo ou negativo)
b.	Contém os seguintes métodos públicos:
i.	Construtor, getters e setters (verificando se os dados estão validos)
ii.	imprimir todos os dados da transação

*/

import java.time.LocalDate;

public class Transacao {

	private String descricao;
	private LocalDate data;
	private float valor;



	public Transacao(String descricaoDaTransacao, float valor) {
		
		this.data = LocalDate.now();
		this.valor = valor;

		if (descricaoDaTransacao.isEmpty()) {
			this.descricao = "Transação realizada no dia:" + data.getDayOfMonth() + "/" + data.getMonthValue() + "/"+ data.getYear();
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

	public void setDescricao(String descricao) {
		if (descricao.isEmpty()) {
			this.descricao = "Transação realizada no dia:" + data.getDayOfMonth() + "/" + data.getMonthValue() + "/"
					+ data.getYear();
		}
		this.descricao = descricao;
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

