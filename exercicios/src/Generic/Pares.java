package Generic;

import java.util.LinkedHashSet;
import java.util.Optional;
import java.util.Set;

public class Pares<C extends Number, V> {
	private final Set<Par<C, V>> iterns = new LinkedHashSet<>();

	public void adicionar(C chave, V valor) {
		if (chave == null)
			return;

		Par<C, V> novoPAr = new Par<C, V>(chave, valor);
		if (iterns.contains(novoPAr)) {
			iterns.remove(novoPAr);
		}

		iterns.add(novoPAr);

	}
	
	public V getValor(C chave) {
		if (chave == null)
			return null;
		Optional<Par<C, V>> parOpcinal = iterns.stream()
				.filter(p -> chave.equals(p.getChave()))
				.findFirst();
		return parOpcinal.isPresent() ? parOpcinal.get().getValor() : null;
		
	}

}
