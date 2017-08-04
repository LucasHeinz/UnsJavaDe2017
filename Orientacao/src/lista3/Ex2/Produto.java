package lista3.Ex2;

public abstract class Produto implements Comparable<Produto> {

	private String nome;
	private double preco;
	private String codigo;

	public Produto(String nome, double preco, String codigo) {
		this.nome = nome;
		this.preco = preco;
		this.codigo = codigo;
	}

	@Override
	public String toString() {
		return "\nCódigo: " + this.codigo + " Nome: " + this.nome;
	}

	public String getCodigo() {
		return codigo;
	}

	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	@Override
	public boolean equals(Object obj) {
		Produto produto = (Produto) obj;
		return this.codigo.equals(produto.getCodigo());
	}

	@Override
	public int compareTo(Produto o) {
		return this.nome.compareTo(o.getNome());
	}

}
