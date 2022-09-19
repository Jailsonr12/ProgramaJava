package arthur;

import java.util.Random;

public class aaa {

	public static void main(String[] args) {
		Random ramdon = new Random();

		int a = 0;// ramdon.nextInt(0,60);
		int b = 0;// ramdon.nextInt(0,60);
		int c = 0;// ramdon.nextInt(0,60);
		int d = 0;// ramdon.nextInt(0,60);
		int e = 0;// ramdon.nextInt(0,60);
		int f = 0;// ramdon.nextInt(0,60);
		int f1 = f;
		int i = 1;
		while (i < 5) {
			if (a == b || a == c || a == d || a == e || a == f) {
				a = ramdon.nextInt(0, 60);
				System.out.println("a=" + a);
			}
			if ((b == c || b == d || b == e || b == f)) {
				b = ramdon.nextInt(0, 60);
				System.out.println("b=" + b);
			}
			if ((c == d || c == e || c == f)) {
				c = ramdon.nextInt(0, 60);
				System.out.println("c=" + c);
			}
			if ((d == e || e == f)) {
				d = ramdon.nextInt(0, 60);
				System.out.println("d=" + d);
			}
			if ((e == f)) {
				e = ramdon.nextInt(0, 60);
				System.out.println("e=" + e);
			}
				if (f == f1) {
					f = ramdon.nextInt(0, 60);
				}

			i= i +1;
		}
	}
}
