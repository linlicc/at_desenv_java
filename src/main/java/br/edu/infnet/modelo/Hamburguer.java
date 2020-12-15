package br.edu.infnet.modelo;

import br.edu.infnet.modelo.auxiliar.PrecoException;
import br.edu.infnet.modelo.auxiliar.QuantidadeException;

public class Hamburguer extends Lanche {
	
	public static int CODIGOBATATA = 3;

	public Hamburguer(int quantidade) throws QuantidadeException, PrecoException {
		super(quantidade);
	}
	
	@Override
	public String getTipoDeLanche() {
		return "Hamburguer";
	}
}
