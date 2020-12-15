package br.edu.infnet.modelo.auxiliar;

public class QuantidadeException extends Exception {

	private static final long serialVersionUID = 1L;

	public QuantidadeException(String msg) {
		super("[ERRO:]" + msg.toUpperCase());
	}
}