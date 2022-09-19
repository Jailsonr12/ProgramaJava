package ClasseEMetodos;

public class data {

	int Dia;
	int Mes;
	int Ano;

	data() {
//		Dia = 1;
//		Mes = 1;
//		Ano = 1770;
		this(1, 1, 1970);
	}	

	data(int Dia, int Mes, int Ano) {
		this.Dia = Dia;
		this.Mes = Mes;
		this.Ano = Ano;
	}


	String obterDataFormatada() {
		String formato = "%d/%d/%d";
		return String.format(formato, this.Dia, Mes, Ano);
	}
	
}
