package oo.herancaCarro;

public class Ferrari extends Carro implements Esportivo, Luxo {

	private boolean ligarTurbo;
	private boolean ligarAr;

	public Ferrari() {
		super(315);
	}

	public Ferrari(int velocidadeMaxima) {
		super(velocidadeMaxima);
		setAcc(35);
	}

	public boolean acelerar() {
		setAcc(35);
		boolean acelerar1 = super.acelerar();
		boolean acelerar2 = super.acelerar();
		boolean acelerar3 = super.acelerar();
		boolean acelerar4 = super.acelerar();

		return acelerar1 || acelerar2 || acelerar3 || acelerar4;
	}

	public boolean freiar() {
		setAcc(10);
		boolean freiar1 = super.freiar();
		boolean freiar2 = super.freiar();
		boolean freiar3 = super.freiar();
		boolean freiar4 = super.freiar();
		boolean freiar5 = super.freiar();

		return freiar1 || freiar2 || freiar3 || freiar4 || freiar5;
	}

	@Override
	public void ligarTurbo() {
		ligarTurbo = true;
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
		super.acelerar();
		setAcc(35);
	}

	@Override
	public void desligarTurbo() {
		ligarTurbo = false;
		super.freiar();
		super.freiar();
		super.freiar();
		super.freiar();
		setAcc(10);
	}

	@Override
	public void ligarAr() {
		ligarAr = true;

	}

	@Override
	public void desligarAr() {
		ligarAr = false;
	}

	@Override
	public int getAcc() {
		if (ligarTurbo && !ligarAr) {
			return 35;
		} else if (ligarTurbo && ligarAr) {
			return 30;
		} else if (!ligarTurbo && !ligarAr) {
			return 20;
		} else {
			return 15;
		}
	}
	
}
