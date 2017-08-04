package lista3.Ex2;

public class Livro extends Produto {
	private String autor;

	public Livro(String nome, double preco, String autor, String codigo) {
		super(nome, preco, codigo);
		this.autor = autor;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Autor: " + this.autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

}
