package lista3.Ex3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class TesteFormas {

	public static void main(String[] args) {
		
		Scanner k = new Scanner(System.in);
		int qtdeFormas;
		
		List formas = new ArrayList();
		
//		Quadrado quadrado = new Quadrado(5);
//		System.out.println("Perimetro: " + quadrado.calculaPerimetro());
//		System.out.println("Area: " + quadrado.calculaArea());
//		
//		Retangulo retangulo = new Retangulo(1, 2);
//		System.out.println("Perimetro " + retangulo.calculaPerimetro());
//		System.out.println("�rea: " + retangulo.calculaArea());
//
//		Circulo circulo = new Circulo(3);
//		System.out.println("Per�metro: " + circulo.calculaPerimetro());
//		System.out.println("�rea :" + circulo.calculaArea());
		
		System.out.println("Quantas formas voc� deseja criar ?");
		qtdeFormas = k.nextInt();
		
		for (int i = 0; i < qtdeFormas; i++) {
			int qualForma;
			System.out.println("Qual forma deseja criar ? 1 para c�rculo, 2 para quadrado ou 3 para ret�ngulo. ");
			qualForma = k.nextInt();
			
			if(qualForma == 1) {
				
				System.out.println();
			}
		}
		
	}
}
