package br.edu.infnet.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.infnet.modelo.auxiliar.PrecoException;
import br.edu.infnet.modelo.auxiliar.QuantidadeException;

class VerificarTotalPedido {

	@Test
	void verificar_total_pedido() throws QuantidadeException, PrecoException {
		Batata b1 = new Batata(10);
		Hamburguer h1 = new Hamburguer(10);
		HotDog hd = new HotDog(10);
		
		Cliente cli = new Cliente("Aline", "aline@teste.com", "24249033");
		
		Pedido p = new Pedido(1, cli);
		p.adicionarLanche(b1);
		p.adicionarLanche(h1);
		p.adicionarLanche(hd);
		
		
		float totalPedido = p.obterTotalLanche();
		assertEquals(450, totalPedido);
		
		
	}

}
