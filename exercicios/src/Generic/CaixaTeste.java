package Generic;

public class CaixaTeste {

	public static void main(String[] args) {

		Caixa<String> caixaA = new Caixa<>();

		caixaA.guarda("segredo");

		String coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		Caixa<Double> caixaB = new Caixa<>();

		caixaB.guarda(1.23);

		Double coisaB = caixaB.abrir();
		System.out.println(coisaB);

	}

}
