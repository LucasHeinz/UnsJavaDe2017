package lista5.exercicio1;

public class TesteAnimais {

	public static void main(String[] args) {
		
		Cachorro cachorro = new Cachorro("Led", "Azul", 4);
		System.out.println(cachorro.reproduzSom());
		
		Gato gato = new Gato("Rebulir", "cinza", 3);
		System.out.println(gato.reproduzSom());
		
		PorquinhoDaIndia porquinhoDaIndia = new PorquinhoDaIndia("Rosda", "Marron", 4);
		System.out.println(porquinhoDaIndia.reproduzSom());
	}
}
