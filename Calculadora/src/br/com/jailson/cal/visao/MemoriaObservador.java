package br.com.jailson.cal.visao;

@FunctionalInterface
public interface MemoriaObservador {

	public void valorAlterado(String novoValor);
}
