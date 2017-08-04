package lista3.Ex3;

public class TesteFormas {

	public static void main(String[] args) {
		
		Quadrado quadrado = new Quadrado(5);
		System.out.println("Perimetro: " + quadrado.calculaPerimetro());
		System.out.println("Area: " + quadrado.calculaArea());
		
		Retangulo retangulo = new Retangulo(1, 2);
		System.out.println("Perimetro " + retangulo.calculaPerimetro());
		System.out.println("Área: " + retangulo.calculaArea());

		Circulo circulo = new Circulo(3);
		System.out.println("Perímetro: " + circulo.calculaPerimetro());
		System.out.println("Área :" + circulo.calculaArea());
	}
}
