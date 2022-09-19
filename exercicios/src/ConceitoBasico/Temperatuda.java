package ConceitoBasico;

import java.util.Scanner;

public class Temperatuda {
	public static void main(String[] args) {
	
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe a temperatura em Fahrenheuit: ");
		double F = teclado.nextDouble();
		
		double C = (F - 32) * (5/9);
	
		System.out.println(C);
		
		
		teclado.close();
		
	}
}
