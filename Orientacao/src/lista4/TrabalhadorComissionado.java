package lista4;

public class TrabalhadorComissionado extends Empregado {

	private double numVendas;
	private double comissao;

	public TrabalhadorComissionado(String nome, String sobrenome, double salario, double numVendas, double comissao) {
		super(nome, sobrenome);
		this.setSalario(salario);
		this.numVendas = numVendas;
		this.comissao = comissao;
	}

	@Override
	public double calcularGanho() {
		this.setGanho((this.numVendas * this.comissao/100d) + this.getSalario());
		return this.getGanho();
	}

}
