package br.edu.infnet.modelo;

import br.edu.infnet.modelo.auxiliar.PrecoException;
import br.edu.infnet.modelo.auxiliar.QuantidadeException;

public class Batata extends Lanche {
	
	public static int CODIGOBATATA = 1;

	public Batata(int quantidade) throws QuantidadeException, PrecoException {
		super(quantidade);		
	}
	
	@Override
	public String getTipoDeLanche() {
		return "Batata";
	}
	
}
