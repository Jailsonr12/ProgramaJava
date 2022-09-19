package fundamentos;

import java.util.Scanner;

public class LOGICA {
	public static void main(String[] args) {
		Scanner teclado = new Scanner (System.in);
		
		boolean codicao1 = true;
		
		boolean cond2 = 3 > 7;
		
		System.out.println(codicao1 && !cond2);
		System.out.println(codicao1 || cond2);
		System.out.println(codicao1 ^ cond2);
		System.out.println(!codicao1);
		System.out.println(!cond2);
		
		
		teclado.close();		
	}
}
