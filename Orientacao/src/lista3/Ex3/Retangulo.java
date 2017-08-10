package lista3.Ex3;

public class Retangulo extends Quadrilatero {

	public Retangulo(double base, double altura) {
		super(base, base, altura, altura);
		
	}

	@Override
	public double calculaArea() {
		this.setArea(this.getLado1() * this.getLado3());
		return this.getArea();
	}
	
	@Override
	public String toString() {
		return  "Retângulo : " +
				"\nBase: " + this.getLado1() +
				"\nAltura: " + this.getLado3() +
				"\nPerímetro: " + this.calculaPerimetro() +
				"\nÁrea: " + this.calculaArea();
	}

}
