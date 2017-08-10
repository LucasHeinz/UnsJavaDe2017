package lista5.exercicio1;

public abstract class Animal {

	private String nome;
	private String cor;
	private int patas;
	
	public Animal(String nome, String cor, int patas) {
		this.nome = nome;
		this.cor = cor;
		this.patas = patas;
	}

	public abstract String reproduzSom();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}

	public void setCor(String cor) {
		this.cor = cor;
	}

	public int getPatas() {
		return patas;
	}

	public void setPatas(int patas) {
		this.patas = patas;
	}
}
