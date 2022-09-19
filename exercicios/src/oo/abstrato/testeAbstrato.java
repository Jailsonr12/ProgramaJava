package oo.abstrato;

public class testeAbstrato {
	
	public static void main(String[] args) {
		
		
		
		Mamifero a = new cachorro();
	
		System.out.println(a.mover());
		System.out.println(a.mamar());
		System.out.println(a.respirar());
		
	}
}
