package teste;

public class teste3 {
	public static int MathChallenge(int num) {
		int num1 = num ==2 ? 3 : num;
	    int primo = num1 % 2 == 0 ? 1 : 0;
		
		return primo;
	}

	public static void main(String[] args) {
		// keep this function call here
		// Scanner s = new Scanner(System.in);
		System.out.print(MathChallenge(2));
	}

}
