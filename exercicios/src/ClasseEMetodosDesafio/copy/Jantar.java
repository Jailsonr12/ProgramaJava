package ClasseEMetodosDesafio.copy;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.223);
		Comida c2 = new Comida("Feijao", 0.500);
		
		Pessoa p1 = new Pessoa("Jailson", 75);
		//Pessoa p2 = new Pessoa("Ana", 65);
		
		System.out.println(p1.apresentar());
		p1.comer(c1);
		
		System.out.println(p1.apresentar());
		p1.comer(c2);
		
		System.out.println(p1.apresentar());
		
	}

}
