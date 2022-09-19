package excessao;

public class ChecadaVsNaoChegada {

	public static void main(String[] args) {
		
		try {
			gerErro1();
		} catch (RuntimeException e) {
			System.out.println(e.getLocalizedMessage());
		}
		
		try {
			gerErro2();
		} catch (Throwable e) {
			System.out.println(e.getLocalizedMessage());
		}
		System.out.println("Fim:)");

	}
	//NÃO chegada ou NÃO verificada
	static void gerErro1() {
		throw new RuntimeException("Ocorreu um erro bem legal #01");
	}
	//Exceçao checada ou verificada
	static void gerErro2() throws Exception {
		throw new Exception("Ocorreu um erro bem lehal #02");
	}
}
