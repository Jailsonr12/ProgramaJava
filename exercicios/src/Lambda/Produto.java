package Lambda;

public class Produto extends Object {

	final String nome;
	final double preco;
	final double desconto;
	public Produto(String nome, double preco, double desconto) {
		super();
		this.nome = nome;
		this.preco = preco;
		this.desconto = desconto;
	}
	
	public String toString() {
		double precofinal =  preco * (1 - desconto); 
		
		return "Produto: " + nome + "\nCusta: R$" + preco + 
				"\nE ira receber desconto de " + desconto+"%" + "\nE saira por"
				+ precofinal;
		
	}
	
}
