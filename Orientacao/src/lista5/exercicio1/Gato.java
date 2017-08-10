package lista5.exercicio1;

public class Gato extends Animal {

	public Gato(String nome, String cor, int patas) {
		super(nome, cor, patas);
	}

	@Override
	public String reproduzSom() {
		return "Nome: " + this.getNome() + "\nMiau";
	}

}
