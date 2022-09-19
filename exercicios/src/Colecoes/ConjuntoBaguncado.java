package Colecoes;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoBaguncado {

	@SuppressWarnings({ "rawtypes", "unchecked" })
	public static void main(String[] args) {
		
		
		//hashSet HETEROGENEA === BAGUNÇADO
		
		
		HashSet conjunto = new HashSet();

		conjunto.add(1.2); // double -> Double
		conjunto.add(true); // bolean -> Bolean
		conjunto.add("teste"); // String
		conjunto.add(3); // int -. Interger
		conjunto.add('x');

		System.out.println("Tamanho é" + conjunto.size());

		conjunto.add("teste2");

		System.out.println("Tamanho é" + conjunto.size());

		System.out.println(conjunto.remove("teste"));
		System.out.println("Tamanho é" + conjunto.size());

		System.out.println(conjunto.contains('x'));
		
		System.out.println(conjunto.remove('x'));
		
		System.out.println("Tamanho é" + conjunto.size());
		
		System.out.println(conjunto.contains(3));
		System.out.println(conjunto);
		
		Set nums = new HashSet();
		nums.add("!!");
		nums.add(2);
		nums.add(3);
		nums.add(1);
		
		System.out.println(nums);
		
		// conjunto.addAll(nums); //União entre dois conjustos
		conjunto.retainAll(nums); // interseção
		System.out.println(conjunto);
		
		conjunto.clear();
		System.out.println(conjunto);
		
		
	}
}
