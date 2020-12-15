package br.edu.infnet.modelo;

import java.io.IOException;

import br.edu.infnet.modelo.auxiliar.PrecoException;
import br.edu.infnet.modelo.auxiliar.QuantidadeException;
import br.edu.infnet.modelo.leitura.ArquivoTeste;

public class LerArquivoTeste {
	public static void main(String[] args) throws QuantidadeException, PrecoException, IOException {

		String leitura = ArquivoTeste.lerArquivo();
		ArquivoTeste.escreverArquivo(leitura);

	}
}
