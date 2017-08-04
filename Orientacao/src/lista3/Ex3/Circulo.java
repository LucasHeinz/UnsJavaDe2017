package lista3.Ex3;

public class Circulo implements IAreaPerimetro {

	private double raio;

	public Circulo(double raio) {
		this.raio = raio;
	}
	
	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double calculaPerimetro() {
		double perimetro = 2 * raio * 3.14;
		return perimetro;
	}

	@Override
	public double calculaArea() {
		double area = 3.14 * (raio * raio);
		return area;
	}

}
