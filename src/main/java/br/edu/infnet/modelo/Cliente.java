package br.edu.infnet.modelo;

public class Cliente {

	private String nome;
	private String email;
	private String telefone;

	private Pedido[] pedidosDoCliente = new Pedido[10];

	public Cliente(String nome, String email, String telefone) {
		this.nome = nome;
		this.email = email;
		this.telefone = telefone;
	}

	public int adicionarPedidoAoCliente(Pedido p) {
		int posicao = 0;
		
		for (int i = 0; i <= pedidosDoCliente.length - 1; i++) {
			if (pedidosDoCliente == null) {
				pedidosDoCliente[i] = p;
				posicao = i;
				break;
			}
		}
		
		return posicao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getTelefone() {
		return telefone;
	}

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	public Pedido[] getPedidosDoCliente() {
		return pedidosDoCliente;
	}

	public void setPedidosDoCliente(Pedido[] pedidosDoCliente) {
		this.pedidosDoCliente = pedidosDoCliente;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Nome: ").append(nome);
		sb.append("Email: ").append(email);
		sb.append("Telefone: ").append(telefone);

		return sb.toString();
	}
}
