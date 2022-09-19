package EstruturasDeControle;

import java.util.Scanner;

public class doWhile {
	public static void main(String[] args) {

			// if(...) sentença; o { }
			// while (...) sentença; ou {}
			// for (incializa:Estreção:Motificação) sentença; OU {}
			
		//do sentença {} ........... while (...);
		
		
		Scanner teclado = new Scanner(System.in);

		String texto = "";
				
		do {
			
			System.out.println("Voce precisa ser melhor");
			texto = teclado.nextLine();
			
		} while (!texto.equalsIgnoreCase("Por favor"));

		teclado.close();
	}
}
