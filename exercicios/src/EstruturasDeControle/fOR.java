package EstruturasDeControle;

public class fOR {
	public static void main(String[] args) {
		
		
		//normla
		for (int contador = 0; contador <= 10; contador++) {
			System.out.println("bom dia" + contador);
		}
		//inverso 
		for (int contador = 10; contador > 0; contador--) {
			System.out.println("bom dia" + contador);
		}
		
		// nao faz sentido 
		int x = 2;
		for (; x < 10;) {
			System.out.println("x = " + x);
			x++;
		}

	}
}
