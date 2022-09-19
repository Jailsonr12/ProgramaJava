package fundamentos;

import java.util.Scanner;

public class TipoStringIgual {
	public static void main(String[] args) {
		System.out.println("2" == "2");

		String s = new String("2");
		System.out.println("2" == s);
		System.out.println("2".equals(s));

		Scanner teclado = new Scanner(System.in);
		
		
		//teclado.nextLine(); ele usa os espaços 
		String s2 = teclado.nextLine();
		System.out.println(s2);
		//.equals para comparar string
		//(s2".trim() serve para tirar os espaços "
		
		
		String c3 = teclado.nextLine();
		System.out.println(c3);
		System.out.println(c3);
		System.out.println("." + c3);
		teclado.close();
	}
}
