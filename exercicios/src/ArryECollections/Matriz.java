package ArryECollections;

import java.util.Scanner;

public class Matriz {
	
	public static void main(String[] args) {
		
		
		Scanner teclado = new Scanner(System.in);
		
		System.out.println("Quantos alunos");
		int qtdAlu = teclado.nextInt();
		System.out.println("Quantas notas por alunos");
		int qtdNota = teclado.nextInt();
		
		double[][] notasDaTurma = new double [qtdAlu][qtdNota];
		
		double total = 0;
		
		for (int i = 0; i < notasDaTurma.length; i++) {
			System.out.println("Aluno" + (i + 1));
			for (int j = 0; j < notasDaTurma [i].length; j++) {
				
				System.out.printf("Informe a nota  %dº do aluno %d", (j + 1) 
						, (i + 1));
				notasDaTurma[i][j] = teclado.nextDouble();
				total += notasDaTurma[i][j];
			}
		}
		
		double media = total / (qtdAlu * qtdNota);
		
		System.out.print("A media da turma é" + media);
		
		teclado.close();
	}

}
