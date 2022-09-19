package Lambda;

import java.util.function.BinaryOperator;

public class CalculoTeste3 {
	
	public static void main(String[] args) {
	
		//int -> Double NAO CONVERTE;
		//double -> Double CONVERTE;
	
	BinaryOperator<Double> calc = (x, y) -> {
		return x + y;
	};
	System.out.println(calc.apply(5.0, 5.0));

	calc = (x, y) -> x * y;
	
	System.out.println(calc.apply(5.0, 5.0));
	

	BinaryOperator<Integer> calc2 = (x, y) -> {
		return x + y;
	};
	System.out.println(calc2.apply(5, 5));

	calc = (x, y) -> x * y;
	
	System.out.println(calc2.apply(5, 5));

	}
}
