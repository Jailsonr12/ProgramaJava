package oo.composicao;

public class Pessoa {
	
	private  String nome;
	private int idade;
	private String sobreNome;
	
	public Pessoa(String nome, String sobreNome, int idade) {
		setNome(nome);
		setSobreNome(sobreNome);
		setIdade(idade);
	}
	
	 //Getter ---> LER um determinado valor
	public int getIdade() {
		return idade;
	}
	// Setter ---> ALTERA um determinado valor
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if (novaIdade >= 0 && novaIdade <= 120) {
			this.idade = novaIdade;
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	
	public String toString() {
		return "Ola eu sou " + getNomeCompleto() + " e tenho " + getIdade() + " anos";
	}

	public String getSobreNome() {
		return sobreNome;
	}

	public void setSobreNome(String sobreNome) {
		this.sobreNome = sobreNome;
	}

	
	public String getNomeCompleto() {
		return getNome() +" "+ getSobreNome();
	}
	
	
	
	
}
