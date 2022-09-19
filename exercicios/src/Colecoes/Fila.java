package Colecoes;

import java.util.LinkedList;
import java.util.Queue;

public class Fila {

	public static void main(String[] args) {

		Queue<String> fila = new LinkedList<>();
		
		// offer e Add -> adicionam elementos na fila
		// Diferença é o comportamento 
		// quando a fila esta cheia
		fila.add("Jailson");  //Retorna falso
		fila.offer("Bia");  //lança uam exceção
		fila.add("Carlos");
		fila.offer("Daniel");
		fila.add("Rafael");
		fila.offer("gui");
		
		//Peek e Element -> adicionam elemtnos fila (sem remover)
		//Diferença é o comportamento ocorre
		//quando a fila esta vazia
		
		System.out.println(fila.peek()); //retorn "null"
		System.out.println(fila.peek()); //retorn "null"
		System.out.println(fila.element()); //quando a fila esta vazia nao aparece
		System.out.println(fila.element());
		
		//fila.size() ->tamanho em numeto
		//fila.clear() -> limpar
		//fila.isEmpty() -> se esta varia ( true pra se esta )
		//fila.constains()-> ver se algum determina oq esta
		
		//poll e remover -> obtem o proximo elemento
		// da fila e remove
		
		System.out.println(fila.poll()); //retorna ja removendo
		System.out.println(">>" + fila.poll()); //Lança uma exceção
		System.out.println(fila.remove());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		System.out.println(fila.poll());
		
		
		
		
		
		
	}
}