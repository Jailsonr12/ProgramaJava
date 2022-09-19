package VoceConsegue;

import oo.composicao.Carro;

public class CarroTeste {

	public static void main(String[] args) {

		Carro c1 = new Carro();

		System.out.println(c1.estaLigado());

		c1.ligar();

		System.out.println(c1.estaLigado());

		System.out.println(c1.motor.giro());

		c1.acelearar();
		c1.acelearar();
		c1.acelearar();
		c1.acelearar();
		System.out.println(c1.motor.giro());
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();
		c1.freiar();

		c1.motor.carro.motor.carro.motor.giro();
		// Falrou Encapsulamento!!!!!!!!!!
		// c1.motor.fatorInjecao = -30

		System.out.println(c1.motor.giro());
		//relação BI DIMENSIONAL
		System.out.println(c1.motor.carro.motor.carro.motor.giro());
		
	}

}
