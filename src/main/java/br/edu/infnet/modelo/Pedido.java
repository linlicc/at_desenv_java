package br.edu.infnet.modelo;

import java.time.LocalDate;
import java.util.Arrays;

import br.edu.infnet.modelo.auxiliar.PrecoException;
import br.edu.infnet.modelo.auxiliar.QuantidadeException;

public class Pedido {

	private int numeroPedido;
	private Lanche[] lanches = new Lanche[10];
	private boolean web;
	private Cliente clientePedido;
	
	private LocalDate dataHora;

	public Pedido(int numeroPedido, Cliente clientePedido) {
		this.numeroPedido = numeroPedido;
		this.clientePedido = clientePedido;
		
		dataHora = LocalDate.now();
	}

	public float obterTotalLanche() {
		float total = 0;
		for (int i = 0; i <= this.lanches.length - 1; i++) {

			if (lanches[i] != null) {

				float preco = lanches[i].getPreco();
				int qtd = lanches[i].getQuantidade();

				total = total + (preco * qtd);
			}
		}
		return total;
	}

	// length retorna total de elementos
	// entao subtrair - 1
	public void adicionarLanche(Lanche l) {
		for (int i = 0; i <= this.lanches.length - 1; i++) {
			if (this.lanches[i] == null) {
				this.lanches[i] = l;
				break;
			}
		}
	}

	public void adicionarLanche(int codigoLanche, int qtd) throws QuantidadeException, PrecoException {
		Lanche l = null;

		switch (codigoLanche) {
		case 1:
			l = new Batata(qtd);
			break;

		case 2:
			l = new HotDog(qtd);

		case 3:
			l = new Hamburguer(qtd);

		default:
			break;
		}
		adicionarLanche(l);
	}

	public String gerarSaidaTxt(Pedido p) {

		StringBuilder retorno = new StringBuilder();

		for (int i = 0; i <= p.getLanches().length - 1; i++) {
			// se existe um lanche

			if (p.getLanches()[i] != null) {
				// gerar string de saida
				retorno.append("out_");
				String tipoDeLanche = p.getLanches()[i].getTipoDeLanche();
				retorno.append(tipoDeLanche).append("\n");

			} else {
				break;
			}
		}

		return retorno.toString();

	}

	public int getNumeroPedido() {
		return numeroPedido;
	}

	public void setNumeroPedido(int numeroPedido) {
		this.numeroPedido = numeroPedido;
	}

	public Lanche[] getLanches() {
		return lanches;
	}

	public void setLanches(Lanche[] lanches) {
		this.lanches = lanches;
	}

	public Cliente getClientePedido() {
		return clientePedido;
	}

	public void setClientePedido(Cliente clientePedido) {
		this.clientePedido = clientePedido;
	}
	
	public boolean isWeb() {
		return web;
	}

	public void setWeb(boolean web) {
		this.web = web;
	}

	public LocalDate getDataHora() {
		return dataHora;
	}

	@Override
	public String toString() {
		return "Pedido [lanches=" + Arrays.toString(lanches) + "]";
	}
}