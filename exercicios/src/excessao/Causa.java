package excessao;

public class Causa {

	public static void main(String[] args) {

		
		
		try {
			metadoA(null);
		} catch (Exception e) {
			if(e.getCause() != null)
				System.out.println(e.getCause().getMessage());
		}
	}

	static void metadoA(Aluno aluno) {
		try {
			metadoB(aluno);
		} catch (Exception e) {
			throw new IllegalArgumentException(e);
			
		}

	}

	static void metadoB(Aluno aluno) {
		if (aluno == null) {
			throw new NullPointerException("Aluno está Nulo");
		}
		System.out.println(aluno.nome);
	}

}
