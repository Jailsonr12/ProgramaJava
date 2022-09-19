package Streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

public class estrada {

	public static void main(String[] args) {

		Carro c1 = new Carro("Ferrari", 200, "vermelha");
		Carro c2 = new Carro("FiatUnp", 500, "branco");
		Carro c3 = new Carro("Corolla", 150, "verde");
		Carro c4 = new Carro("Celta", 120, "vermelha");
		Carro c5 = new Carro("Parati", 30, "verde");
		Carro c6 = new Carro("Clio", 54, "cinza");
		Carro c7 = new Carro("C3", 40, "cinza");
		Carro c8 = new Carro("Materia", 90, "brancp");

		List<Carro> carros = Arrays.asList(c1, c2, c3, c4, c5, c6, c7, c8);
		
		Predicate<Carro> multa = 
				v -> v.velocidade > 120;
		Function<Carro, String> multado =
				m -> " O carro " + m.nome + " da cor " + m.cor + " \n "
						+ "recebera uma multa por execesso de velocidade, estava a " + m.velocidade + "Km/h";
		
				
		carros.stream()
			.filter(multa)
			.map(multado)
			.forEach(System.out::println);
		
	}

}
