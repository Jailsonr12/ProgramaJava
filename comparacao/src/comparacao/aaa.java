package comparacao;

import java.util.Random;
import java.util.Scanner;

public class aaa {
	public static void main(String[] args) {

		Random ramdon = new Random();
		int a = ramdon.nextInt(1, 60);
		int b = ramdon.nextInt(1, 60);
		int c = ramdon.nextInt(1, 60);
		int d = ramdon.nextInt(1, 60);
		int e = ramdon.nextInt(1, 60);
		int f = ramdon.nextInt(1, 60);
		int f1 = f;

		//System.out.println("a=" + a);
		//System.out.println("b=" + b);
		//System.out.println("c=" + c);
		//System.out.println("d=" + d);
		//System.out.println("e=" + e);
		//System.out.println("f=" + f);

		Scanner teclado = new Scanner(System.in);

		System.out.println("----------------------------------------------");
		System.out.println("            LOTERICA LOTE FACIL");
		System.out.println("----------------------------------------------");
		System.out.print("QUANTOS JOGOS DESEJA REALIZAR ALEATORIALEMNTE? ");
		int QuantidadeDeJogos = teclado.nextInt();
		String[][] vet = new String[QuantidadeDeJogos][6];

		for (int i = 0; i < QuantidadeDeJogos; i++) {
			System.out.print((i + 1) + "º" + "BILHETE: ");
			for (int j = 0; j < 1; j++) {

				if (a == b || a == c || a == d || a == e || a == f) {
					a = ramdon.nextInt(1, 60);
				}
				if ((b == c || b == d || b == e || b == f)) {
					b = ramdon.nextInt(1, 60);
				}
				if ((c == d || c == e || c == f)) {
					c = ramdon.nextInt(1, 60);
				}
				if ((d == e || e == f)) {
					d = ramdon.nextInt(1, 60);
				}
				if ((e == f)) {
					e = ramdon.nextInt(1, 60);
				}
				if (f != f1) {
					f = ramdon.nextInt(1, 60);
					f1 = f;
				}
				String A = String.valueOf(a);
				String B = String.valueOf(b);
				String C = String.valueOf(c);
				String D = String.valueOf(d);
				String E = String.valueOf(e);
				String F = String.valueOf(f);

				String Formatadacao = String.format("%s | %s | %s | %s | %s | %s", A, B, C, D, E, F);
				//int aA = Integer.parseInt(Formatadacao);
				vet[i][j] = Formatadacao;

				System.out.print(vet[i][j]);
				a=0;b=0;c=0;d=0;e=0;f=0;
			}
			System.out.println();
		}
		System.out.println("----------------------------------------------");
		System.out.println("            BOA SORTE SEU MERDA");
		System.out.println("----------------------------------------------");
		teclado.close();
	}
}