package Colecoes;

import java.util.HashMap;
import java.util.Map;

public class Mapa {
	public static void main(String[] args) {

		Map<Integer, String> usuarios = new HashMap<>();

		// put é pra add no map

		usuarios.put(1, "Roberto");
		usuarios.put(1, "Jailson");
		usuarios.put(3, "Rafael");
		usuarios.put(4, "Rebeca");
		usuarios.put(5, "Roertinho");

		System.out.println(usuarios.size());
		System.out.println(usuarios.isEmpty());

		System.out.println(usuarios.keySet());
		System.out.println(usuarios.values());
		System.out.println(usuarios.entrySet());

		System.out.println(usuarios.containsKey(4));
		System.out.println(usuarios.containsValue("jailson"));

		System.out.println(">" + usuarios.remove(3));
		System.out.println(">>>>>" + usuarios.remove(3, "Carols"));
		System.out.println(usuarios.get(4));

		for (int key : usuarios.keySet()) {
			System.out.println(key);
		}
		for (String name : usuarios.values()) {
			System.out.println(name);
		}
		// tem q importa isso "import java.util.Map.Entry;"
		// para usar "Entry"
		// for (Entry<Interger, String> registro: usuarios.entrySet()) {
		// System.out.println(registro.getKey()); // algum erro
		// System.out.println(registro.getValues());
		// }

	}

}
