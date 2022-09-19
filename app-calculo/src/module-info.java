import br.com.cod3r.app.Calculadora;
import br.com.cod3r.app.calculo.CalculadoraIpl;

module app.calculo {
	
	requires transitive app.logging;
	//requires  app.logging;
	exports br.com.cod3r.app.calculo;
	
	exports br.com.cod3r.app.calculo.interno
		to app.financeiro;
	
	opens br.com.cod3r.app.calculo to app.financeiro;
	
	requires app.api;
	
	provides Calculadora with CalculadoraIpl;
}