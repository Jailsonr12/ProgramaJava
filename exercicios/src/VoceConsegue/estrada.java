package VoceConsegue;

import oo.herancaCarro.Ferrari;
import oo.herancaCarro.Uno;

public class estrada {

	public static void main(String[] args) {
		
		
		Ferrari fa1 = new Ferrari();
		fa1.acelerar();
		fa1.acelerar();
		fa1.acelerar();
		fa1.acelerar();
		fa1.ligarAr();
		fa1.ligarTurbo();
		
		System.out.println(fa1);
		
		fa1.freiar();
		
		
		System.out.println(fa1);
		
		Uno Ua1 = new Uno();
		
		Ua1.acelerar();
		Ua1.acelerar();
		Ua1.acelerar();
		Ua1.acelerar();

		
		System.out.println(Ua1);
		
		
		Ua1.freiar();
		
		
		System.out.println(Ua1);
		
	}
	
}
