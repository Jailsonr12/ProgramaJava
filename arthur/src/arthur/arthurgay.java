package arthur;

import java.io.PrintStream;
import java.util.Random;
import java.util.Scanner;

public class arthurgay {

	public static void main(String[] args) {
		Random random = new Random();
		int QuantidadeDeJogos = 0;
		int numero = random.nextInt(0, 60);
		int a = random.nextInt(0, 60);
		int b = random.nextInt(0, 60);
		int c = random.nextInt(0, 60);
		int d = random.nextInt(0, 60);
		int e = random.nextInt(0, 60);
		int f = random.nextInt(0, 60);
		String Comparacao = "";

		System.out.println("a=" + a);
		System.out.println("b=" + b);
		System.out.println("c=" + c);
		System.out.println("d=" + d);
		System.out.println("e=" + e);
		System.out.println("f=" + f);
		System.out.println(numero);

		Scanner teclado = new Scanner(System.in);

		System.out.println("----------------------------------------------");
		System.out.println("            LOTERICA LOTE FACIL");
		System.out.println("----------------------------------------------");
		System.out.print("QUANTOS JOGOS DESEJA REALIZAR ALEATORIALEMNTE? ");
		QuantidadeDeJogos = teclado.nextInt();

		for (int i = 0; i < QuantidadeDeJogos; i++) {
			System.out.print((i + 1) + "º" + "BILHETE: ");
			while (j != QuantidadeDeJogos) {

				while (a == b || a == c || a == d || a == e || a == f) {
					a = random.nextInt();
				}
				while ((b == c || b == d || b == e || b == f)) {
					b = random.nextInt();
				}
				while ((c == d || c == e || c == f)) {
					c = random.nextInt();
				}
				while ((d == e || e == f)) {
					d = random.nextInt();
				}
				while ((e == f)) {
					e = random.nextInt();
				}
				
				System.out.printf("%d,%d,%d,%d,%d,%d", a, b, c, d, e, f);
				a = 0;
				b = 0;
				c = 0;
				d = 0;
				e = 0;
				f = 0;
				j++;
			}
		}

		teclado.close();

	}

}
