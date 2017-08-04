package umPacoteComResolucoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Loja {

	public static void main(String[] args) {
		Livro livro = new Livro("O Hobbit", 50d, "J. R. R. Tolkien", "000000000111");
		Livro livro2 = new Livro("O Alquimista", 30d, "Paulo Coelho", "000000000112");

		CD cd = new CD("Thriller", 35d, 9, "000000000113");
		CD cd2 = new CD("Back In Black", 60d, 10, "000000000114");

		DVD dvd = new DVD("Avatar", 100d, 9720l, "000000000115");

		List<Produto> lProdutos = new ArrayList<>();
		lProdutos.add(livro);
		lProdutos.add(livro2);
		lProdutos.add(cd);
		lProdutos.add(cd2);
		lProdutos.add(dvd);

		System.out.println(livro.equals(livro2));
		System.out.println(livro.equals(livro));

		for (Produto produto : lProdutos) {
			System.out.println(produto.toString());
		}

		buscaProdutos(cd, lProdutos);

		Collections.sort(lProdutos);

		System.out.println();

		for (Produto produto : lProdutos) {
			System.out.println(produto.toString());
		}
	}

	private static void buscaProdutos(Produto produto, List<Produto> lProdutos) {
		for (Produto prod : lProdutos) {
			if (prod.equals(produto)) {

			}
		}
	}

}
