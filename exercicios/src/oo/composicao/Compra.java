package oo.composicao;

import java.util.ArrayList;

public class Compra {

	String cliente;
	ArrayList<Item> intens = new ArrayList<Item>();

	void adicionarItem(String nome, int quantidade, double preco) {
		this.adicionarItem(new Item(nome, quantidade, preco));
		;
	}

	void adicionarItem(Item item) {
		this.intens.add(item);
		item.compra = this;
	}

	double obterValorTotal() {
		double total = 0;
		for (Item item : intens) {
			total += item.quantidade * item.preco;
		}

		return total;
	}

}
