package ClasseEMetodos;

public class ProdutoTeste {

	public static void main(String[] args) {
		
		Produto p1 = new Produto("notebook", 4358.89);
		p1.nome = "notebook1";
		
		
		
		Produto p2 = new Produto("celular");
		p2.nome = "celular2";
		p2.preco = 2050.30;
		Produto.desconto = 0.50;
		
		double precoFinal1 = p1.precoComDesconto();
		double precoFinal2 = p2.precoComDesconto();
		
		System.out.println(p1.nome);
		System.out.println(p1.preco);
		System.out.println(precoFinal1);
		System.out.println(precoFinal2);
		
		
	}
}
