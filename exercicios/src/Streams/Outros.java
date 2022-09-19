package Streams;

import java.util.Arrays;
import java.util.List;

public class Outros {

	public static void main(String[] args) {

		Aluno a1 = new Aluno("Ana", 7.1);
		Aluno a2 = new Aluno("Luana", 6.1); // takeWhile termina aqui
		Aluno a3 = new Aluno("Gui", 7.1);//Skip/Limit começa aq pq pula 2
		Aluno a4 = new Aluno("Gabi", 10);
		Aluno a5 = new Aluno("Ana", 7.1);// termina aqui no limit
		Aluno a6 = new Aluno("Pedro", 9.1);
		Aluno a7 = new Aluno("Gui", 8.1);
		Aluno a8 = new Aluno("Marias", 10);

		List<Aluno> alunos = Arrays.asList
				(a1, a2, a3, a4, a5, a6, a7, a8);

		System.out.println("Distinct....");//Precisa do hasgCode
		alunos.stream().distinct().forEach(System.out::println);
		
		
		System.out.println("\n Skip/Limit");
		alunos.stream()
			.distinct()
			.skip(2)
			.limit(2)
			.forEach(System.out::println);

		System.out.println("\nTakeWhile");
		alunos.stream()
			.distinct()
			
			.takeWhile(a -> a.nota >= 7)
			.forEach(System.out::println);
		
		
		
	}

}
