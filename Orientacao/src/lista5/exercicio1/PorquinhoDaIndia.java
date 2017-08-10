package lista5.exercicio1;

public class PorquinhoDaIndia extends Animal {

	public PorquinhoDaIndia(String nome, String cor, int patas) {
		super(nome, cor, patas);
	}

	@Override
	public String reproduzSom() {
		return "Nome: " + this.getNome() + "\nNhôi";
	}

}
