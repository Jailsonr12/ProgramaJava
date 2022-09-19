package ConceitoBasico;

import java.util.Scanner;

public class elevado {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe um valor: ");
		Double num1 = teclado.nextDouble();

		double ele3 = Math.pow(num1, 3);
		double ele4 = Math.pow(num1, 4);

		System.out.printf("Elecado ao cubo = %.2f", ele3);
		System.out.printf("\nElecado ao quadrado = %.2f", ele4);

		teclado.close();
	}
}
