package lista5.exercicio3;

public class TesteCancela {

	public static void main(String[] args) {
		
		Cancela cancela = new Cancela();
		
		System.out.println(cancela.retornarStatus());
		
		cancela.abrir();
		System.out.println(cancela.retornarStatus());
		
		cancela.fechar();
		System.out.println(cancela.retornarStatus());
	}
}
