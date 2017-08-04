package lista4;

public class TrabalhadorComissionado extends Empregado {

	private int numVendas;
	private double comissao;

	public TrabalhadorComissionado(String nome, String sobrenome, double salario, int numVendas, double comissao) {
		super(nome, sobrenome);
		this.setSalario(salario);
		this.numVendas = numVendas;
		this.comissao = comissao;
	}

	@Override
	public double calcularGanho() {
		this.setGanho((this.numVendas * this.comissao) + this.getSalario());
		return this.getGanho();
	}

}
