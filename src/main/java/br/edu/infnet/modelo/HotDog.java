package br.edu.infnet.modelo;

import br.edu.infnet.modelo.auxiliar.PrecoException;
import br.edu.infnet.modelo.auxiliar.QuantidadeException;

public class HotDog extends Lanche {
	
	public static int CODIGOBATATA = 2;

	public HotDog(int quantidade) throws QuantidadeException, PrecoException {
		super(quantidade);
	}

	@Override
	public String getTipoDeLanche() {
		return "HotDog";
	}

	@Override
	public String toString() {
		return "HotDog";
	}
}
