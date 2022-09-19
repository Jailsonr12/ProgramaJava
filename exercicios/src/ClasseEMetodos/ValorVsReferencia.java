package ClasseEMetodos;

public class ValorVsReferencia {
	public static void main(String[] args) {
		
		int a = 2;
		int b = a;//atribuição por valor (tipo Primitivo
		
		a++;
		b--;
		
		System.out.println(a + " " + b);
		
		
		data d1 = new data(1,4,2000);
		data d2 = d1; //atribuição por referencia
		
			
		d1.Dia = 31;
		d2.Mes = 12;
		d1.Ano = 2022;
		
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		VoltarDataParaValorPadrao(d1);
		
		System.out.println(d1.obterDataFormatada());
		System.out.println(d2.obterDataFormatada());
		
		int c = 5;
		alterarPrimitivo(c);
		System.out.println(c);
	}
	static void VoltarDataParaValorPadrao(data d) {
		d.Ano = 1970;
		d.Dia = 1;
		d.Mes = 1;
	}
	static void alterarPrimitivo(int a) {
		a++;
	}
	
}
