package desafio;

import java.util.Scanner;

public class desafio {

	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		System.out.print("Digite primeiro salario: ");
		String salario1 = teclado.next().replace(",", ".");
		System.out.print("\nDigite segundo salario: ");
		String salario2 = teclado.nextLine().replace(",", ".");
		System.out.print("\nDigite terceiro salario: ");
		String salario3 = teclado.nextLine().replace(",", ".");
		
		Double numero1 = Double.parseDouble(salario1);
		Double numero2 = Double.parseDouble(salario2);
		Double numero3 = Double.parseDouble(salario3);
		
		double soma = numero1 + numero2 + numero3;
		double media = soma / 3;
		
		System.out.println(media);
		
		
		teclado.close();
	}
	
}
