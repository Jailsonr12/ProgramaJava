package ClasseEMetodos;

public class Produto {
	
	String nome;
	double preco;
	static double desconto = 0.25;
	
	Produto(String nomeInicial){
		nome = nomeInicial;
	}
	Produto(String nomeInicial, double precoInicial){
		nome = nomeInicial;
		preco = precoInicial;
		
	}
	
	Produto(){
		
	}
	
	double precoComDesconto() {
		double resultado = preco * (1 - desconto );
		return resultado;
	}
	
}
