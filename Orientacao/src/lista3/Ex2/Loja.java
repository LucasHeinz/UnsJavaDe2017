package lista3.Ex2;

import java.util.ArrayList;
import java.util.List;

public class Loja {

	public static void main(String[] args) {

		CD cd = new CD("Reckless And Relentless", 20d, 16, "1234");
		CD cd2 = new CD("Common Courtesy", 20d, 14, "4321");

		Livro livro = new Livro("40 dias", 35d, "Maria Madalena", "7890");

		DVD dvd = new DVD("Era do gelo", 12d, 90, "7089");
		DVD dvd2 = new DVD("Ano 1", 12d, 85, "9807");

		List<Produto> produto = new ArrayList<>();

		produto.add(cd);
		produto.add(cd2);
		produto.add(livro);
		produto.add(dvd);
		produto.add(dvd2);

		buscaProduto(livro, produto);
		
		for (Produto prod : produto) {
			System.out.println(prod.toString());
		}
	}

	private static void buscaProduto(Produto produto, List<Produto> produtos) {
		for (Produto prods : produtos) {
			if(prods.equals(produtos)) {
				
			}
		}
		
	}
}
