package EstruturasDeControle;

public class breakfull {

	public static void main(String[] args) {
		//breal rotulado
		
		//nao e muito bom usar.
		for (int i = 0; i < 5; i++) {
			for (int j = 0; j < 5; j++) {
				
				if(i == 1) {
					break;
				}
				System.out.printf("[%d.%d]", i, j);
			}
			System.out.println();
		}
	}
}
