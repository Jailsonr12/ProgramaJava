package br.com.cod3r.cm.visao;

import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.excecao.SairException;
import br.com.cod3r.cm.modelo.Tabuleiro;

public class TabuleiroCOnsole {

	private Tabuleiro tabuleiro;
	private Scanner teclado = new Scanner(System.in);

	public TabuleiroCOnsole(Tabuleiro tabuleiro) {
		this.tabuleiro = tabuleiro;

		executarJogo();
	}

	private void executarJogo() {

		try {
			boolean continuar = true;

			while (continuar) {
				ciclodoJogo();

				System.out.println("Outra partida? (S/n)");
				String resposta = teclado.nextLine();

				if ("n".equalsIgnoreCase(resposta)) {
					continuar = false;
				} else {
					tabuleiro.reiniciar();
				}
			}
		} catch (SairException e) {
			System.out.println("Thau!!");
		} finally {
			teclado.close();
		}
	}

	private void ciclodoJogo() {
		try {
			while (!tabuleiro.objetivoAlcancado()) {
				System.out.println(tabuleiro.toString());

				String digitado = capturarValorDigitado("\nDigite ( X , Y ): ");
				digitado.split(",");

				Iterator<Integer> xy = Arrays.stream(digitado.split(",")).map(e -> Integer.parseInt(e.trim()))
						.iterator();
				digitado = capturarValorDigitado("1 - Abrir ou 2 - (Des)Marcar: ");
				if ("1".equals(digitado)) {
					tabuleiro.abri(xy.next(), xy.next());
				} else if ("2".equals(digitado)) {
					tabuleiro.alternarMarcacao(xy.next(), xy.next());
				}
			}
			System.out.println(tabuleiro);
			System.out.println("Voce ganhou!!!");
		} catch (ExplosaoException e) {
			System.out.println(tabuleiro);
			System.out.println("Voce perdeu!");
		}
	}

	private String capturarValorDigitado(String texto) {
		System.out.print(texto);
		String digitado = teclado.nextLine();

		if ("sair".equalsIgnoreCase(digitado)) {
			throw new SairException();
		}
		return digitado;
	}
}
