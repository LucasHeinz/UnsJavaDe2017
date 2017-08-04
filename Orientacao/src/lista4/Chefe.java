package lista4;

public class Chefe extends Empregado{
	
	public Chefe(String nome, String sobrenome, double salario) {
		super(nome, sobrenome);
		this.setSalario(salario);
		
	}

	@Override
	public double calcularGanho() {
		this.setGanho(this.getSalario());
		return this.getGanho();
	}

	public void consultarDiagrama() {
		
	}
	
}
