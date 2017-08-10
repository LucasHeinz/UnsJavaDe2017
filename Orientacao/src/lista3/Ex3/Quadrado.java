package lista3.Ex3;

public class Quadrado extends Quadrilatero {

	public Quadrado(double lado) {
		super(lado, lado,lado, lado);
	}
	
	@Override
	public double calculaArea() {
		this.setArea(this.getLado1() * this.getLado1());
		return this.getArea();
	}

	@Override
	public String toString() {
		return "Quadrado: " +
				"\nLado: " + this.getLado1() +
				"\nPerímetro: " + this.calculaPerimetro() +
				"\nÁrea: " + this.calculaArea();
	}
}
