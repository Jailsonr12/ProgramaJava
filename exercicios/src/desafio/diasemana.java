package desafio;

import java.util.Scanner;

public class diasemana {

	public static void main(String[] args) {

		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe o nome dia da semana:");
		String dia = teclado.next();

		if (dia.equalsIgnoreCase("domingo")) {
			System.out.println(1);
		} else if (dia.equalsIgnoreCase("segunda")) {
			System.out.println(2);
		} else if (dia.equalsIgnoreCase("terça")) {
			System.out.println(3);
		} else if (dia.equalsIgnoreCase("quarta")) {
			System.out.println(4);
		} else if (dia.equalsIgnoreCase("quinta")) {
			System.out.println(5);
		} else if (dia.equalsIgnoreCase("sexta")) {
			System.out.println(6);
		} else if (dia.equalsIgnoreCase("sabado") || dia.equalsIgnoreCase("sábado")) {
			System.out.println(7);
		}

		teclado.close();

	}
}
