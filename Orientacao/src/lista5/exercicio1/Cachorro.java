package lista5.exercicio1;

public class Cachorro extends Animal {

	public Cachorro(String nome, String cor, int patas) {
		super(nome, cor, patas);
	}

	@Override
	public String reproduzSom() {

		return "Nome: " + this.getNome() + "\nAuAu";
	}

}
