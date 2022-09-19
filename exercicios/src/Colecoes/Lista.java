package Colecoes;

import java.util.ArrayList;
import java.util.List;

public class Lista {

	public static void main(String[] args) {

		List<Usuario> lista = new ArrayList<>();
		Usuario r1 = new Usuario("Ana");
		lista.add(r1);
		lista.add(new Usuario("Jailson"));
		lista.add(new Usuario("Lucas"));
		lista.add(new Usuario("Johnannes"));
		lista.add(new Usuario("Johnannes"));
		lista.add(new Usuario("Johnannes"));
		lista.add(new Usuario("Mathes"));

		System.out.println(lista.get(3));
		
		System.out.println(">>>>>>" + lista.remove(1)); //acessar pelo Incidce
		
		System.out.println(lista.remove(new Usuario("Mathes"))); //acessar pelo nome
		
		System.out.println("Tem "+lista.contains(new Usuario("Lucas"))); // ve se tem 
		System.out.println("Tem "+lista.contains(r1));
		
		for (Usuario r : lista) {
			System.out.println(r.nome);

		}

	}
}
