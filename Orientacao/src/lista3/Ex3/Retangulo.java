package lista3.Ex3;

public class Retangulo extends Quadrilatero {

	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
		this.setLado1(altura);
		this.setLado2(altura);
		this.setLado3(base);
		this.setLado4(base);
		
	}

	public double getBase() {
		return base;
	}

	public void setBase(double base) {
		this.base = base;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	@Override
	public double calculaArea() {
		double area = base * altura;
		return area;
	}

}
