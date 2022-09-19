package Lambda;

import java.util.Arrays;
import java.util.List;

public class Foreach {
	
	public static void main(String[] args) {
		
		List<String> aprovado = Arrays.asList("Ana","Bia", "Lia", "Gui");
		
		System.out.println("Forma Tradicional");
		for(String nome: aprovado) {
			System.out.println(nome);
		}
		
		System.out.println("\nLambda #0.");
		aprovado.forEach(nome -> System.out.println(nome + "!!!"));
		
		System.out.println("\nLambda #02..");
		aprovado.forEach(nome -> meuImprimir(nome));
		
		System.out.println("\nMethod Reference #1.");
		aprovado.forEach(System.out::println);
		
		System.out.println("\nMethod Reference #2..");
		aprovado.forEach(Foreach :: meuImprimir);
				
				
	}
	
	static void meuImprimir(String nome) {
		System.out.println("Oi! meu nome é " + nome);
	}
}
