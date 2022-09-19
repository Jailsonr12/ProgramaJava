package excessao.personalizadaB;

@SuppressWarnings("serial")
public class StringVaziaException extends RuntimeException {

	private String NomeDoAbritubo;

	StringVaziaException(String NomeDoAbritubo) {
		this.NomeDoAbritubo = NomeDoAbritubo;

	}
	
	public String getMenssage() {
		
		return String.format("O atributo '%s' esta vazio", NomeDoAbritubo);
	}

}
