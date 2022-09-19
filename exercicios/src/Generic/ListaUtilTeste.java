package Generic;

import java.util.Arrays;
import java.util.List;

public class ListaUtilTeste {

	public static void main(String[] args) {

		List<String> langs = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem =(String) ListaUtil.getUltimo1(langs);
		System.out.println(ultimaLinguagem);

		Integer ultimaNumero= (Integer)ListaUtil.getUltimo1(nums);
		System.out.println(ultimaNumero);
		
//////////////////////////////////////////////////////////////////////////////////
		
		List<String> langs2 = Arrays.asList("JS", "PHP", "Java", "C++");
		List<Integer> nums2 = Arrays.asList(1, 2, 3, 4, 5, 6);
		
		String ultimaLinguagem2 = ListaUtil.getUltimo2(langs2);
		System.out.println(ultimaLinguagem2);

		Integer ultimaNumero2= ListaUtil.getUltimo2(nums2);
		System.out.println(ultimaNumero2);

	}

}
