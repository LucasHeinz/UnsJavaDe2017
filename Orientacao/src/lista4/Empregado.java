package lista4;

public abstract class Empregado {

	private double salario;
	private String nome;
	private String sobrenome;
	private double ganho;

	public abstract double calcularGanho();

	@Override
	public String toString() {
		return "Nome: " + this.nome + " " + this.sobrenome + "\n";
	}

	public Empregado(String nome, String sobrenome) {
		this.nome = nome;
		this.sobrenome = sobrenome;
	}

	public String getSobrenome() {
		return sobrenome;
	}

	public void setSobrenome(String sobrenome) {
		this.sobrenome = sobrenome;
	}

	public double getGanho() {
		return ganho;
	}

	public void setGanho(double ganho) {
		this.ganho = ganho;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
