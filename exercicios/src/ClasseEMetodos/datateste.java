package ClasseEMetodos;

public class datateste {

	public static void main(String[] args) {

		data calendario = new data(31, 12, 2020);
		//calendario.Ano = 2000;
		//calendario.Dia = 17;
		//calendario.Mes = 8;

		System.out.print(calendario.obterDataFormatada()) ;
		System.out.println();
		
		data calendario2 = new data();
		//calendario2.Ano = 2002;
		//calendario2.Dia = 04;
		//calendario2.Mes = 3;
		
		System.out.print(calendario2.obterDataFormatada()) ;
	

	}

}
