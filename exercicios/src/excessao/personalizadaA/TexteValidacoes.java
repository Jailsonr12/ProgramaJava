package excessao.personalizadaA;

import excessao.Aluno;

public class TexteValidacoes {

	public static void main(String[] args) throws StringVaziaException, NumeroFodaIntervaloException {

		try {
			Aluno aluno = new Aluno("Ana", 7);

			Validar.aluno(aluno);
			Validar.aluno(null);
		} catch (StringVaziaException e) {
			System.out.println(e.getMessage());
		} catch (NumeroFodaIntervaloException 
				| IllegalArgumentException e) {
			System.out.println(e.getMessage());
		} 

		Validar.aluno(null);
		
		System.out.println("fim :");
	}
}
