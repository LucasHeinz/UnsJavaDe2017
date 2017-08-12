package lista5.exercicio5;

public class TestEletros {

	public static void main(String[] args) {
		
		EletroEletronico eletroEletronico = new EletroEletronico("RADIO");
		eletroEletronico.aumentaVolume();
		eletroEletronico.aumentaVolume();
		eletroEletronico.aumentaVolume();
		System.out.println(eletroEletronico.getVolume());
	}
}
