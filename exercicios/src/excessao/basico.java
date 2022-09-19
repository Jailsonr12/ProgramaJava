package excessao;

public class basico {

	public static void main(String[] args) {

		Aluno a1 = null;

		try {
			imprimirNomeAluno(a1);
		} catch (Exception excecao) {
			System.out.println("Ocorreu um erro no momento " + "de imprimir o nome do usuario");
		}
		try {
			System.out.println(7 / 0);
		} catch (ArithmeticException e) {
			System.out.println("Ocorreu o erro: " + e.getMessage());
			// e.printStackTrace();
		}
		System.out.println("Fim");
	}

	public static void imprimirNomeAluno(Aluno aluno) {
		System.out.println(aluno.nome);

	}
}
