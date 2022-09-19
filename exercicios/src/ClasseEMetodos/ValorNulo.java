package ClasseEMetodos;

public class ValorNulo {

	public static void main(String[] args) {

		String s1 = "aa";
		System.out.println(s1.concat("!!!!!"));

		data d1 = Math.random() > 0.5 ? new data () : null;

		if (d1 != null) {
			d1.Mes = 3;
			System.out.println(d1.obterDataFormatada());
		}
		
		
		String s2 = Math.random() > 0.5 ? "opa" : null;
		
		if(s2 != null) {
			System.out.println(s2.concat("?????"));

		}

	}
}
