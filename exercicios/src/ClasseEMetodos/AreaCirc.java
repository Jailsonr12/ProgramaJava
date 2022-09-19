package ClasseEMetodos;

public class AreaCirc {

	double raio;
	static final double pi = 3.14;
	//static final = mandei a variavel constante 
	
	AreaCirc(double raioInicial) {
		raio = raioInicial;
	}
	double area() {
		return  pi * Math.pow(raio, 2);
	}
	
	
	
}
