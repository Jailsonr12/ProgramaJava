package oo.composicao;

public class Motor {
	
	public final Carro carro;
	public boolean ligado = false;
	public double fatorInjecao = 1;

	
	Motor(Carro carro){
		this.carro = carro;
	}
	
	public int giro() {
		if (!ligado) {
			return 0;
		} else {
			return (int) Math.round(fatorInjecao * 3000);
		}
	}

}
