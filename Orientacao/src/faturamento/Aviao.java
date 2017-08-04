package faturamento;

public abstract class Aviao {

	private final int qtdeDeLugares;
	private final double precoPorPassagem;

	public Aviao(int qtdeDeLugares, double precoPorPassagem) {
		this.qtdeDeLugares = qtdeDeLugares;
		this.precoPorPassagem = precoPorPassagem;
	}

	public int getQtdeDeLugares() {
		return qtdeDeLugares;
	}

	public double getPrecoPorPassagem() {
		return precoPorPassagem;
	}

}
