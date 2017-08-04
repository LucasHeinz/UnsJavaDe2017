package lista4;

public class TrabalhadorPecaProduzida extends Empregado {

	private int quantidade;

	public TrabalhadorPecaProduzida(String nome, String sobrenome, double salario, int quantidade) {
		super(nome, sobrenome);
		this.setSalario(salario);
		this.quantidade = quantidade;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	@Override
	public double calcularGanho() {
		this.setGanho(quantidade * this.getSalario());
		return this.getGanho();
	}

}
