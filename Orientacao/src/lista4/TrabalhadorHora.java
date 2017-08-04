package lista4;

public class TrabalhadorHora extends Empregado {

	private int horasTrabalhadas;

	public TrabalhadorHora(String nome, String sobrenome, double salario, int horasTrabalhadas) {
		super(nome, sobrenome);
		this.setSalario(salario);
		this.horasTrabalhadas = horasTrabalhadas;
	}

	@Override
	public double calcularGanho() {
		this.setGanho(horasTrabalhadas * this.getSalario());
		return this.getGanho();
	}

	public int getHorasTrabalhadas() {
		return horasTrabalhadas;
	}

	public void setHorasTrabalhadas(int horasTrabalhadas) {
		this.horasTrabalhadas = horasTrabalhadas;
	}

}
