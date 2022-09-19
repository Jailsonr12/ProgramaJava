package oo.composicao;

public class CompraTeste {

	public static void main(String[] args) {
	
		Compra c1 = new Compra();
		
		c1.cliente = "Joao Paulo";
		c1.adicionarItem("Canela", 20, 7.45);
		c1.adicionarItem("Borracha", 12, 3.89);
		c1.adicionarItem("Caderno", 3, 18.79);
		
		System.out.println(c1.intens.size());
		System.out.println(c1.obterValorTotal());
		
		double Total = c1.intens.get(0).compra.intens.get(1)
				.compra.obterValorTotal();
		
		System.out.println("O total é R$" + Total);
		
	}

}
