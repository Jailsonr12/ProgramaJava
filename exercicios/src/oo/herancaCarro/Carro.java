package oo.herancaCarro;

public class Carro {

	final int velocidadeMaxima;
	public int velocidade = 0;
	private int acc = 5;
		

	protected Carro(int velocidademaxima) {
		velocidadeMaxima = velocidademaxima;
	}

	 boolean freiar() {

		if (velocidade != 0) {
			this.velocidade -= 5;
			return true;
		} else {
			return false;
		}

	}

	 boolean acelerar() {
		if (velocidade + getAcc() > velocidadeMaxima) {
			velocidade = velocidadeMaxima;
			return false;
		} else {
			this.velocidade += 5;
			return true;
		}

	}

	 public String toString() {
		return "Velocidade atual é " + velocidade + " Km/h.";
	}

	public int getAcc() {
		return acc;
	}

	public void setAcc(int acc) {
		this.acc = acc;
	}

	 
	 
}
