package ConceitoBasico;

import java.util.Scanner;

public class IMC {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Informe altura: ");
		Double altura = teclado.nextDouble();
		System.out.println("Informe peso: ");
		Double peso = teclado.nextDouble();

		Double IMC = peso / Math.pow(altura, 2);

		System.out.printf("Seu IMC é %.2f", IMC);

		teclado.close();

	}

}
