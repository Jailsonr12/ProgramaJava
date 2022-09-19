package Generic;

public class CaixaObjetoTeste {
	public static void main(String[] args) {

		CaixaObjeto caixaA = new CaixaObjeto();
		caixaA.guarda(2.3);

		Double coisaA = (Double) (caixaA.abrir());
		System.out.println(coisaA);

		CaixaObjeto caixaB = new CaixaObjeto();
		caixaB.guarda("Ola");

		String coisaB = (String) (caixaB.abrir());
		System.out.println(coisaB);
	}

}
