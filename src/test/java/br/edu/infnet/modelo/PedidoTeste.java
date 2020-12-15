package br.edu.infnet.modelo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PedidoTeste {

	@Test
	void data_hora_nao_nulo() {
		Pedido p = new Pedido(1, null);
		
		assertNotNull(p.getDataHora());
	}
	
	@Test
	void pedido_tem_cliente() {
		Cliente cliente = new Cliente("aline", "aline@gmail.com", "24249033");
		Pedido p = new Pedido(1, cliente);
		
		assertNotNull(p.getClientePedido());
	}
}
