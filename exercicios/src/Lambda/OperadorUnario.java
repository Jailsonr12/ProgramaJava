package Lambda;

import java.util.function.UnaryOperator;

public class OperadorUnario {

	public static void main(String[] args) {

		UnaryOperator<Integer> maisDois = n -> n + 2;

		UnaryOperator<Integer> vezesDois = n -> n * 2;

		UnaryOperator<Integer> aoQuadrado = n -> n * n;
		
		
		//andThen Depois de....(começa pelo primeiro)
		int resultado = maisDois //2
				.andThen(vezesDois) //4
				.andThen(aoQuadrado) //16
				.apply(0);
		
		System.out.println(resultado);
		
		//Compose ANtes de...(começa pelo ultimo;)
		int resultado2 = aoQuadrado
				.compose(vezesDois)
				.compose(maisDois)
				.apply(0);

		System.out.println(resultado2);
	}

}
