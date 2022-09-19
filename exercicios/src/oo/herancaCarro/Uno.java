package oo.herancaCarro;

public class Uno extends Carro {

	public Uno() {
		super(220);

	}

	public boolean acelerar() {
		boolean acelerar1 = super.acelerar();
		boolean acelerar2 = super.acelerar();

		return acelerar1 || acelerar2;
	}

	public boolean freiar() {
		boolean freiar1 = super.freiar();
		boolean freiar2 = super.freiar();
		boolean freiar3 = super.freiar();

		return freiar1 || freiar2 || freiar3;
	}

}
