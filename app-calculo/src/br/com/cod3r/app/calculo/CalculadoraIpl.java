package br.com.cod3r.app.calculo;

import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.interno.OperacoresAritmeticas;
import br.com.cod3r.app.logging.logger;

public class CalculadoraIpl implements Calculadora {
	
	
	
	private String id = "abc";

	private OperacoresAritmeticas opAritmeticas = new OperacoresAritmeticas();

	public double soma(double... nums) {
		logger.info("Somando...");
		return opAritmeticas.soma(nums);
		
		
	}

	public String getId() {
		return id;
	}
	
	
}
