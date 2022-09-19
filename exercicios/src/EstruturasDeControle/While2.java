package EstruturasDeControle;

import java.util.Scanner;

public class While2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner (System.in);
		
		System.out.println("Informe qualquer coisa");
		String qualquer = teclado.nextLine();
		
		
		while (!qualquer.equalsIgnoreCase("Sair")) {
			System.out.println("Informe qualquer coisa");
			qualquer = teclado.nextLine();
		}
		
		teclado.close();
		
		
	}
}
