package lista3.Ex3;

public class Quadrado extends Quadrilatero {
	private double lado;

	public Quadrado(double lado) {
		this.lado = lado;
		this.setLado1(lado);
		this.setLado2(lado);
		this.setLado3(lado);
		this.setLado4(lado);
	}
	
	@Override
	public double calculaArea() {
		double area;
		area = lado * lado;
		return area;
	}

}
