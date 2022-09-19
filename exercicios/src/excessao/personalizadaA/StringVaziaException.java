package excessao.personalizadaA;

@SuppressWarnings("serial")
public class StringVaziaException extends Exception {

	private String NomeDoAbritubo;

	StringVaziaException(String NomeDoAbritubo) {
		this.NomeDoAbritubo = NomeDoAbritubo;

	}
	
	public String getMenssage() {
		
		return String.format("O atributo '%s' esta vazio", NomeDoAbritubo);
	}

}
