package excessao.personalizadaB;

@SuppressWarnings("serial")
public class NumeroFodaIntervaloException extends RuntimeException {

	private String NomeDoAbritubo;

	NumeroFodaIntervaloException(String NomeDoAbritubo) {
		this.NomeDoAbritubo = NomeDoAbritubo;

	}
	
	public String getMenssage() {
		
		return String.format("O atributo '%s' esta negativo", NomeDoAbritubo);
	}

}
