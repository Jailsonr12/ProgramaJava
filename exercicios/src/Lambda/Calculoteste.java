package Lambda;

public class Calculoteste {
	public static void main(String[] args) {
		
		Calculo soma = new soma();
		Calculo multiplocar = new Mutiplicar(); 
		
		System.out.println(soma.executar(5,5));
		System.out.println(multiplocar.executar(5, 5));
	}

}
