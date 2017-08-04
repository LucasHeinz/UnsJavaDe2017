package lista3.Ex2;

public class DVD extends Produto {

	private double duracao;

	public DVD(String nome, double preco, double duracao, String codigo) {
		super(nome, preco, codigo);
		this.duracao = duracao;
	}
	
	@Override
	public String toString() {
		return super.toString() + " Duração: " + this.duracao + " minutos";
	}

	public double getDuracao() {
		return duracao;
	}

	public void setDuracao(double duracao) {
		this.duracao = duracao;
	}

}
