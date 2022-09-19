package desafio;

import java.util.Scanner;

public class dersafiosoma {
	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		
		System.out.print("Informe primeiro numero: ");
		double num1 = teclado.nextDouble();
		
		System.out.print("Informe Segundo numero: ");
		double num2 = teclado.nextDouble();
		
		System.out.print("Qual operação deseja realizae: ");
		String op = teclado.next();

		// logica

		double resultado = "+".equals(op) ? num1 + num2 : 0;
		resultado = "-".equals(op) ? num1 - num2 : resultado;
		resultado = "*".equals(op) ? num1 * num2 : resultado;
		resultado = "%".equals(op) ? num1 % num2 : resultado;
		resultado = "/".equals(op) ? num1 / num2 : resultado;

		// saida
		System.out.printf("%.2f %s %.2f = %.2f", num1, op, num2, resultado);

		teclado.close();
	}
}