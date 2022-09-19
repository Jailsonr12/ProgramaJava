package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class DesafioMap {
	public static void main(String[] args) {

		@SuppressWarnings("unused")
		Consumer<String> print = System.out::println;
		Consumer<Integer> println = System.out::println;

		List<Integer> nums = Arrays.asList(1, 2, 3, 34, 5);

		// Function<Integer, String> binario2 = b ->{

		UnaryOperator<String> inverter = s -> new StringBuilder(s).reverse().toString();

		Function<String, Integer> binarioParaInt = s -> Integer.parseInt(s, 2);

		// b +"";

		nums.stream().map(Integer::toBinaryString).map(inverter).map(binarioParaInt).forEach(println);

	}

}
