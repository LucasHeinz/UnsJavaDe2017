package lista5.exercicio2;

import java.util.ArrayList;
import java.util.List;

public class TesteCarros {

	public static void main(String[] args) {
		
		List<Carro> carros = new ArrayList<Carro>();
		
		Carro carro = new Carro("ASD-1234", "Golf", "Volkswagen", "Verde");
		Carro carro2 = new Carro("DSA", "Siena", "Fiat", "Preto");
		Carro carro3 = new Carro("PNG", "Beatle", "Volkswagen", "Pérola");
		Carro carro4 = new Carro("MVI", "TR4", "Mitsubishi", "Prata");
		Carro carro5 = new Carro("FLS", "Gol", "Volkswagen", "Branco");
		
		carros.add(carro);
		carros.add(carro2);
		carros.add(carro3);
		carros.add(carro4);
		carros.add(carro5);
		
		for (Carro car : carros) {
			System.out.println(car.toString());
		}
	}
}
