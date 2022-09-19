package desafio;

public class DesavioAritimetico {

	public static void main(String[] args) {

		int a = 3 + 2;
		int b = 6 * a;
		int c = (int) Math.pow(b, 2);
		int d = c / (3 * 2);
		int e = (1 - 5) * (2 - 7);
		int f = e / 2;
		int g = (int) Math.pow(f, 2);
		int h = d - g;
		int i = (int) ((int) (Math.pow(h, 3)) / (Math.pow(10, 3)));
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
		System.out.println(d);
		System.out.println(e);
		System.out.println(f);
		System.out.println(g);
		System.out.println(h);
		System.out.println(i);

	}

}
