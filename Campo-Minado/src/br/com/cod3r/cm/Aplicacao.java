package br.com.cod3r.cm;

import br.com.cod3r.cm.modelo.Tabuleiro;
import br.com.cod3r.cm.visao.TabuleiroCOnsole;

public class Aplicacao {

	public static void main(String[] args) {
		System.out.println("  --------------------------------");
		System.out.println("         Jogo Campo Minado");
		System.out.println("  --------------------------------");
		Tabuleiro tabuleiro = new Tabuleiro(6, 6, 6);
		new TabuleiroCOnsole(tabuleiro);

	}

}
