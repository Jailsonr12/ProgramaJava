package Streams;

public class Media {

	private double total;
	private int quantiadade;

	public Media adicionar(double valor) {
		total += valor;
		quantiadade++;
		return this;
	}

	public double getValor() {
		return total / quantiadade;

	}
	
	public static Media combinar(Media m1, Media m2) {
		Media resultante = new Media();
		resultante.total = m1.total + m2.total;	
		resultante.quantiadade = m1.quantiadade + m2.quantiadade;
		return resultante;
	}

}
