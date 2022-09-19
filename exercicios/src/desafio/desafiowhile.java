package desafio;

import java.util.Scanner;

public class desafiowhile {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);

		int quantidadeDeNotas= 0;
		double nota = 0;
		double total = 0;

		while(nota != -1){
			System.out.println("Informe uma nota (ou -1 p/ sair) : ");
			nota = teclado.nextDouble();
			
			if( nota <= 10 && nota >= 0) {
			total += nota;
			quantidadeDeNotas++;
			}
			
			
		}
		
		double media = total / quantidadeDeNotas;
		System.out.println("Media = " + media );
		
		teclado.close();
	}
}
