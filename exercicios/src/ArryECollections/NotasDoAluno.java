package ArryECollections;

import java.util.Scanner;

public class NotasDoAluno {
	
	public static void main(String[] args) {
		
		int totalDeNotas;
		
		
		Scanner teclado = new Scanner(System.in);

		System.out.print("Informe quantiade de notas que ira inserir: ");
		totalDeNotas = teclado.nextInt();
		double[] notas = new double [totalDeNotas];
		
		for (int i = 0; i < notas.length; i++) {
			System.out.printf("Informe a nota " + (i + 1) +":");
			notas[i] =  teclado.nextDouble();
		}
		double total = 0;
		
		for(double nota: notas) {
			total += nota;
		}
		
		double media =(total/notas.length);
		
		System.out.println("A media é" + (media));
		
		
		
		
		
		
		teclado.close();
	}

}
