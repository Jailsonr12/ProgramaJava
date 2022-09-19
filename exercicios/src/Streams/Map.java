package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.UnaryOperator;

public class Map {
	public static void main(String[] args) {
		
		Consumer<String> print = System.out::print;
		
		List<String> marcas = Arrays.asList("BMW ", "Audi ","Honda ");
		
		
		marcas.stream().map(m -> m.toUpperCase()).forEach(print);

		
		UnaryOperator<String> maiuscula = n -> n.toUpperCase();

		UnaryOperator<String> primeiraLetra = n -> n.charAt(0) + "";
		
		//UnaryOperator<String> greito = n -> n + "!!!! ";
		
		System.out.println("\n\n Usando letras maisculoas");
		marcas.stream()
			.map(maiuscula)
			.forEach(print);
		
		System.out.println("\n\n Usando letras maisculoas e primeiraLetra");
		marcas.stream()
			.map(maiuscula)
			.map(primeiraLetra)
			.forEach(print);
		
		System.out.println("\n\n Usando letras maisculoas, primeiraLetra e greito");
		marcas.stream()
			.map(Utilitarios.maiuscula)
			.map(primeiraLetra)
			.map(Utilitarios.greito())
			//.map(greito)
			.forEach(print);
		
	}
}
