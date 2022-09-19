package Streams;

import java.util.function.UnaryOperator;

public class Utilitarios {

	public static final UnaryOperator<String> maiuscula = n -> n.toUpperCase();

	public static final UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";

	public static final UnaryOperator<String> greito() {
		return n -> n + "!!!! ";
	}

}
