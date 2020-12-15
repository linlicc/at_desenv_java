package br.edu.infnet.modelo;

import br.edu.infnet.modelo.auxiliar.PrecoException;
import br.edu.infnet.modelo.auxiliar.QuantidadeException;

public abstract class Lanche {
	
	private float preco;
	private int quantidade;
	
	public Lanche(int quantidade) throws QuantidadeException, PrecoException {
		
		if (quantidade <= 0) {
			throw new QuantidadeException("Quantidade deve ser maior ou igual a 1");
		}	
		this.quantidade = quantidade;
	}
	
	public abstract String getTipoDeLanche();

	public float getPreco() {
		
		if ("Batata".equals(getTipoDeLanche())) {
			return 10;
		} else if ("Hamburguer".equals(getTipoDeLanche())) {
			return 15;
		} else if ("HotDog".equals(getTipoDeLanche())) {
			return 20;
		}		
		
		return 0;
	}


	public void setPreco(float preco) {
		this.preco = preco;
	}


	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	@Override
	public String toString() {
		return "Lanche [preco=" + preco + ", quantidade=" + quantidade + "]";
	}
}