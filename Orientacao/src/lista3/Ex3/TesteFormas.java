package lista3.Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFormas {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		int qtdeFormas;
		
		List<IAreaPerimetro> formas = new ArrayList<IAreaPerimetro>();
		
//		Quadrado quadrado = new Quadrado(5);
//		System.out.println("Perimetro: " + quadrado.calculaPerimetro());
//		System.out.println("Area: " + quadrado.calculaArea());
//		
//		Retangulo retangulo = new Retangulo(1, 2);
//		System.out.println("Perimetro " + retangulo.calculaPerimetro());
//		System.out.println("Área: " + retangulo.calculaArea());
//
//		Circulo circulo = new Circulo(3);
//		System.out.println("Perímetro: " + circulo.calculaPerimetro());
//		System.out.println("Área :" + circulo.calculaArea());
		
		System.out.println("Quantas formas você deseja criar ?");
		qtdeFormas = Integer.parseInt(k.nextLine());
		
		for (int i = 0; i < qtdeFormas; i++) {
			int qualForma;
			System.out.println("Qual forma deseja criar ? 1 para círculo, 2 para quadrado ou 3 para retângulo. ");
			qualForma = Integer.parseInt(k.nextLine());
			
			if(qualForma == 1) {
				System.out.println("Informe o raio do círculo");
				Circulo circulo = new Circulo(Double.parseDouble(k.nextLine()));
				formas.add(circulo);
			} else if (qualForma == 2) {
				System.out.println("Informe o lado do quadrado");
				Quadrado quadrado = new Quadrado(Double.parseDouble(k.nextLine()));
				formas.add(quadrado);
			} else if(qualForma == 3) {
				System.out.println("Informe a base do retângulo");
				double base = Double.parseDouble(k.nextLine());
				System.out.println("Informe a altura do retângulo");
				double altura = Double.parseDouble(k.nextLine());
				Retangulo retangulo = new Retangulo(base, altura);
				formas.add(retangulo);
			}
			
		}
		for (Object form : formas) {
			System.out.println(form.toString());
			System.out.println();
		}
		
		k.close();
	}
}
