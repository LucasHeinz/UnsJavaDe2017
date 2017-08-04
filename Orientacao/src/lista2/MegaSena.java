package lista2;

import java.util.Arrays;
import java.util.List;

public class MegaSena {

	public static void main(String[] args) {

		List<Integer> aposta1 = Arrays.asList(2, 9, 10, 11, 25, 59);
		List<Integer> aposta2 = Arrays.asList(2, 9, 10, 5, 14, 59);
		List<Integer> aposta3 = Arrays.asList(12, 15, 30, 38, 39, 40);
		List<Integer> aposta4 = Arrays.asList(3, 5, 6, 10, 11, 12);
		List<Integer> aposta5 = Arrays.asList(2, 4, 8, 26, 35, 38);

		conferir(aposta1);

	}

	private static void conferir(List<Integer> apostas) {
		int numDeAcertos = 0;

		List<Integer> resultado = Arrays.asList(59, 25, 11, 9, 10, 2);

		for (Integer apo : apostas) {
			for (Integer res : resultado) {
				if (res == apo) {
					numDeAcertos++;
					break;
				}

			}
		}

		if (numDeAcertos == resultado.size()) {
			System.out.println("Parabéns, esta é a aposta vencedora");
		}

	}

}
