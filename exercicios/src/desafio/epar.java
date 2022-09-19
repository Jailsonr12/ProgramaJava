package desafio;

import java.util.Scanner;

public class epar {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
	
		System.out.println("Informe um valor");
		int valor = teclado.nextInt();
		
		
		while ((valor >= 10) ||  (valor <=0)) {
			System.out.println("Informe um valor entre 10 a 0.");
			valor = teclado.nextInt();
		}
		
		if (valor % 2 == 0) {
			System.out.printf("%d é par", valor);
		}else {
			System.out.printf("%d é impar", valor);
		}
		
		 teclado.close();
	}

}
