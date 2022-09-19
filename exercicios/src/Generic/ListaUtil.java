package Generic;

import java.util.List;

public class ListaUtil {

	public static Object getUltimo1(List<?> lista) {
		return lista.get(lista.size() - 1);
	}

	public static <TIPO> TIPO getUltimo2(List<TIPO> lista) {
		return lista.get(lista.size() - 1);
	}
	
	
	public static <A,B,C,D> C teste(A paramA,B paramB) {
		C teste = null;
		return teste;
	}
}
