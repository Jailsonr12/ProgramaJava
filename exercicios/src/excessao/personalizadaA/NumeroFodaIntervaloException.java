package excessao.personalizadaA;

@SuppressWarnings("serial")
public class NumeroFodaIntervaloException extends Exception {

	private String NomeDoAbritubo;

	NumeroFodaIntervaloException(String NomeDoAbritubo) {
		this.NomeDoAbritubo = NomeDoAbritubo;

	}
	
	public String getMenssage() {
		
		return String.format("O atributo '%s' esta negativo", NomeDoAbritubo);
	}

}
