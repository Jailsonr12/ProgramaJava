package VoceConsegue;

public class InterFace {
	public static void main(String[] args) {

		Cliente c1 = new Cliente("Jailson Roth");

		Compra compra1 = new Compra();
		compra1.adicionarItem("Notobook", 1000, 2);
		compra1.adicionarItem("Notobook", 1000, 2);
		compra1.adicionarItem("Notobook", 1000, 2);
		
		System.out.println(c1.nome);
		System.out.println(compra1.obterValorTotal());
		
		
		
		
	}
}
