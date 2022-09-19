package oo.composicaoDesafio;

import java.util.ArrayList;
import java.util.List;

public class Clientes {
	
	final String nome;

	final List<Compra> compras = new ArrayList<>();
			
	Clientes(String nome) {
		this.nome = nome;
	}

	double obterValorTotal() {
		double total = 0;
		for (Compra compra : compras) {
			total += compra.obterValorTotal();
		}
		return total;
	}
	
	void adicinarCompra(Compra compra) {
		this.compras.add(compra);
	}

}
