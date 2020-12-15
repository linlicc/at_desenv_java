package br.edu.infnet.modelo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import br.edu.infnet.modelo.auxiliar.PrecoException;
import br.edu.infnet.modelo.auxiliar.QuantidadeException;

class VerificarTipoDeLanche {

	@Test
	void verificar_se_lanche_eh_batata() throws QuantidadeException, PrecoException {
		Lanche lanche = new Batata(1);

		String tipoDeLanche = lanche.getTipoDeLanche();

		assertEquals(tipoDeLanche, "Batata");
	}

	@Test
	void verificar_se_lanche_eh_hamburguer() throws QuantidadeException, PrecoException {
		Lanche lanche = new Hamburguer(1);

		String tipoDeLanche = lanche.getTipoDeLanche();

		assertEquals(tipoDeLanche, "Hamburguer");
	}
	
	@Test
	void verificar_se_lanche_eh_hotDog() throws QuantidadeException, PrecoException {
		Lanche lanche = new HotDog(1);

		String tipoDeLanche = lanche.getTipoDeLanche();

		assertEquals(tipoDeLanche, "HotDog");
	}

}
