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

	public void imprimir() {
		System.out.println(this.descricao);
		System.out.println(this.data);
		System.out.println(this.valor);
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

	public LocalDate getData() {
		return this.data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public float getValor() {
		return this.valor;
	}

	public void setValor(float valor) {
		if (valor != 0) {
			this.valor = valor;
		}
	}

	public Transacao(String descricao, float valor) {
		this.descricao = descricao;
		this.data = LocalDate.now();
		this.valor = valor;
	}

}
