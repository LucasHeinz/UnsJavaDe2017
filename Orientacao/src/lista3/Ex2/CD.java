package lista3.Ex2;

public class CD extends Produto {

	private int numFaixas;

	public CD(String nome, double preco, int numFaixas, String codigo) {
		super(nome, preco, codigo);
		this.numFaixas = numFaixas;
	}

	@Override
	public String toString() {
		return super.toString() + " Número de faixas: " + this.numFaixas;
	}

	public int getNumFaixas() {
		return numFaixas;
	}

	public void setNumFaixas(int numFaixas) {
		this.numFaixas = numFaixas;
	}

}
