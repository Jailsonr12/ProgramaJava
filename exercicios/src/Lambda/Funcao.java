package Lambda;

import java.util.function.Function;

public class Funcao {

	public static void main(String[] args) {

		Function<Integer, String> praOuImpar = numero -> numero % 2 == 0 ? "Par" : "Impar";

		Function<String, String> oResultado = valor -> "O resultado é: " + valor;

		Function<String, String> empolgado = valora -> valora + " !!!";

		Function<String, String> duvida = valora -> valora + " ???";

		String resultadoFInal = praOuImpar
				.andThen(oResultado)
				.andThen(empolgado)
				.apply(32);

		String resultadoFIna2 = praOuImpar
				.andThen(oResultado)
				.andThen(duvida)
				.apply(32);

		System.out.println(resultadoFInal);
		System.out.println(resultadoFIna2);
		System.out.println(praOuImpar.andThen(duvida).apply(32));
	}

}
