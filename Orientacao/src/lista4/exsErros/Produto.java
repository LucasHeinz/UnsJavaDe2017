package lista4.exsErros;

public class Produto {

	private String identifica��o; // n�o s�o utilizados caracteres especiais em nomes de vari�veis 
	private double custoDeFablica��o;
	Produto(String i, double c) {
		identifica��o = i; custoDeFablica��o = c;
	}
	
	abstract public String toString(); // a classe n�o � abstrata
	abstract public void novoCusto(double nc);
}
