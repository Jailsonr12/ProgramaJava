package Generic;

public class CaixaNumeroTeste {

	public static void main(String[] args) {

		CaixaNumero<Integer> caixaA = new CaixaNumero<>();
		caixaA.guarda(12);

		Integer coisaA = caixaA.abrir();
		System.out.println(coisaA);
		
		CaixaNumero<Integer> caixaB = new CaixaNumero<>();
		caixaB.guarda(21);

		Integer coisaB = caixaB.abrir();
		System.out.println(coisaB);


	}
}
