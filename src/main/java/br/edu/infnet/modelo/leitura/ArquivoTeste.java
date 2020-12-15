package br.edu.infnet.modelo.leitura;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

import br.edu.infnet.modelo.Cliente;
import br.edu.infnet.modelo.Pedido;
import br.edu.infnet.modelo.auxiliar.PrecoException;
import br.edu.infnet.modelo.auxiliar.QuantidadeException;

public class ArquivoTeste {

	public static String lerArquivo() throws QuantidadeException, PrecoException, IOException {

		Scanner in = new Scanner(new FileReader("arquivo.txt"));

		String[] linhas = new String[100];

		while (in.hasNextLine()) {
			String line = in.nextLine();

			// salvar todas as linhas
			for (int i = 0; i < linhas.length - 1; i++) {
				if (linhas[i] == null) {
					linhas[i] = line;
					break;
				}
			}
		}

		Pedido p = null;

		// percorrer linha / linha
		for (int i = 0; i < linhas.length - 1; i++) {

			// verificar se a linha existe
			if (linhas[i] != null) {

				// quebrar a linha em colunas por ";"
				String[] colunas = linhas[i].split(";");

				// cliente está na linha 0
				if (i == 0) {
					int codigoPedido = Integer.parseInt(colunas[0]);

					String nomeCliente = colunas[1];
					String emailCliente = colunas[2];
					String telefoneCliente = colunas[3];

					Cliente cliente = new Cliente(nomeCliente, emailCliente, telefoneCliente);

					p = new Pedido(codigoPedido, cliente);

					// produto está nas linhas != 0
				} else {
					// criar lanche
					// int codigoPedido = Integer.parseInt(colunas[0]);
					int codigoLanche = Integer.parseInt(colunas[1]);
					int qtd = Integer.parseInt(colunas[2]);
					p.adicionarLanche(codigoLanche, qtd);

				}
			} else {
				// se eu encontrei uma posição nula, significa que n tenho mais linhas
				// então sair de dentro do for
				break;
			}
		}

		String saida = p.gerarSaidaTxt(p);
		return saida;
		
	}
	
	public static void escreverArquivo(String arquivo) throws IOException {
		
		FileWriter saida = new FileWriter("output.txt");
		
		PrintWriter escreverSaida = new PrintWriter(saida);
		escreverSaida.append(arquivo);
		
		saida.close();
		
	}
	
}
