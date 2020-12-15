package br.edu.infnet.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.infnet.modelo.auxiliar.QuantidadeException;

class VerificarExcecao {

	@Test
	void deve_lancar_quantidade_exception() {
		assertThrows(QuantidadeException.class, () -> {
			new Batata(0);
		});
	}
}
