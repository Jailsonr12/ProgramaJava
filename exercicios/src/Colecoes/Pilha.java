package Colecoes;

import java.util.ArrayDeque;
import java.util.Deque;

public class Pilha {

	public static void main(String[] args) {

		Deque<String> livros = new ArrayDeque<>();
		livros.add("O Pqueno Princepe");
		livros.push("Don Quixote");
		livros.push("O Hobbit");

		for(String livro: livros) {
			System.out.println(livro);
		}
		
		System.out.println(livros.peek());
		System.out.println(livros.element());

		System.out.println(livros.poll());
		System.out.println("Remove>>" + livros.poll());
		System.out.println("POP>> " + livros.pop());
		System.out.println(livros.poll());
		System.out.println(livros.poll());
		
		//livros.size()
		//livros.clear();
		//livro.contains();
		//livro.inEmpty
		

	}

}
