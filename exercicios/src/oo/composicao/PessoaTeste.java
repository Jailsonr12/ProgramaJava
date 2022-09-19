package oo.composicao;

public class PessoaTeste {
	public static void main(String[] args) {
		
		Pessoa p1 = new Pessoa("Jailson", "Roth" ,40);
		p1.setIdade(230); //alterar
		
		
		System.out.println(p1.getIdade()); //ler por causa do atributo
		//podemos ler ela.
		System.out.println(p1); // toString.
		
	}

}
