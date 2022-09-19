package br.com.cod3r.cm;

import static org.junit.Assert.assertThrows;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import br.com.cod3r.cm.excecao.ExplosaoException;
import br.com.cod3r.cm.modelo.Campo;

public class CampoTeste {

	private Campo campo;

	@BeforeEach
	void iniciarCampo() {
		campo = new Campo(3, 3);
	}

	@Test
	void TesteVizinhoDistancia1Esquerda() {
		Campo vizinho = new Campo(3, 2);
		boolean resultado = (campo.adicionarVizinho(vizinho));
		assertTrue(resultado);

	}

	@Test
	void TesteVizinhoDistancia1Direita() {
		Campo vizinho = new Campo(3, 4);
		boolean resultado = (campo.adicionarVizinho(vizinho));
		assertTrue(resultado);

	}

	@Test
	void TesteVizinhoDistancia1EnCima() {
		Campo vizinho = new Campo(2, 3);
		boolean resultado = (campo.adicionarVizinho(vizinho));
		assertTrue(resultado);

	}

	@Test
	void TesteVizinhoDistancia1EnBaixo() {
		Campo vizinho = new Campo(4, 3);
		boolean resultado = (campo.adicionarVizinho(vizinho));
		assertTrue(resultado);

	}

	@Test
	void TesteVizinhoDistancia2() {
		Campo vizinho = new Campo(2, 2);
		boolean resultado = (campo.adicionarVizinho(vizinho));
		assertTrue(resultado);

	}

	@Test
	void TesteNaoVizinhoDistancia2() {
		Campo vizinho = new Campo(1, 1);
		boolean resultado = (campo.adicionarVizinho(vizinho));
		assertFalse(resultado);

	}

	@Test
	void TesteValorPadraoAtributoMarcacao() {
		assertFalse(campo.isMarcado());
	}

	@Test
	void TesteAlternaroMarcacao() {
		campo.alternarMarcacao();
		assertTrue(campo.isMarcado());
	}

	@Test
	void TesteAlternaroMarcacaoDuasChamadas() {
		campo.alternarMarcacao();
		campo.alternarMarcacao();
		assertFalse(campo.isMarcado());
	}

	////////////////////////////////////////////////////////////
	@Test
	void TesteAbriNaoMinadaNaoMarcado1() {
		assertTrue(campo.abrir());
	}

	@Test
	void TesteAbriNaoMinadaNaoMarcado21() {
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}

	@Test
	void TesteAbriNaoMinadaNaoMarcado2() {
		campo.minar();
		campo.alternarMarcacao();
		assertFalse(campo.abrir());
	}

	@Test
	void TesteAbriMinadaNaoMarcado22() {
		campo.minar();

		assertThrows(ExplosaoException.class, () -> {
			assertFalse(campo.abrir());

		});
	}

	@Test
	void TesteAbriComVizinhos() {
		Campo campo11 = new Campo(1, 1);
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);

		campo.adicionarVizinho(campo22);
		campo.abrir();

		assertTrue(campo22.isAberto() && campo11.isAberto());
	}
	
	
	
	@Test
	void TesteAbriComVizinhos2() {
		Campo campo11 = new Campo(1, 1);
		Campo campo12 = new Campo(1, 1);
		campo12.minar();
		Campo campo22 = new Campo(2, 2);
		campo22.adicionarVizinho(campo11);
		campo22.adicionarVizinho(campo12);

		campo.adicionarVizinho(campo22);
		campo.abrir();

		assertTrue(campo22.isAberto() && campo11.isFechado());
	}
	
	
	
	
	
	
	

}
