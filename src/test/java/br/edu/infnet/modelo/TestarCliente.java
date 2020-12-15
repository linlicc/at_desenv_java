package br.edu.infnet.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import br.edu.infnet.modelo.auxiliar.PrecoException;
import br.edu.infnet.modelo.auxiliar.QuantidadeException;

class TestarCliente {

	@Test
	void deve_testar_criacao_cliente() {
		Cliente cliente = new Cliente("aline", "aline@gmail.com", "24249033");

		assertNotNull(cliente);
	}

	@Test
	void deve_verificar_nome_cliente() {
		Cliente cliente = new Cliente("aline", "aline@gmail.com", "24249033");

		assertEquals("aline", cliente.getNome());
	}

	@Test
	void deve_verificar_email_cliente() {
		Cliente cliente = new Cliente("aline", "aline@gmail.com", "24249033");

		assertEquals("aline@gmail.com", cliente.getEmail());
	}

	@Test
	void deve_verificar_telefone_cliente() {
		Cliente cliente = new Cliente("aline", "aline@gmail.com", "24249033");

		assertEquals("24249033", cliente.getTelefone());
	}

	@Test
	void deve_verificar_se_pedido_adicionado() throws QuantidadeException, PrecoException {

		Cliente cliente = new Cliente("aline", "aline@gmail.com", "24249033");

		Pedido p = new Pedido(1, cliente);
		Lanche l = new Hamburguer(2);
		p.adicionarLanche(l);

		int codigo = cliente.adicionarPedidoAoCliente(p);

		assertEquals(0, codigo);

	}

}
