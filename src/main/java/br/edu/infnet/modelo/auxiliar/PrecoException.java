package br.edu.infnet.modelo.auxiliar;

public class PrecoException extends Exception {

	private static final long serialVersionUID = 1L;

	public PrecoException(String msg) {
		super("[ERRO:]" + msg.toUpperCase());
	}
}