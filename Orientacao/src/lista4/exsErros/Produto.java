package lista4.exsErros;

public class Produto {

	private String identificação; // não são utilizados caracteres especiais em nomes de variáveis 
	private double custoDeFablicação;
	Produto(String i, double c) {
		identificação = i; custoDeFablicação = c;
	}
	
	abstract public String toString(); // a classe não é abstrata
	abstract public void novoCusto(double nc);
}
