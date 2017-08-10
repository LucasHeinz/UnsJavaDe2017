package lista4.exsErros;

public class DiscoOtico extends Dispositivo{

	DiscoOtico(long c) {
		super("Disco Otico", 241172480L);
	}
	
	public String toString() {
		return "Dispositivo: " + nome+ "Capacidade:" + c; // c não foi declarada, nome não é vizivel
	}
	//Não é feita a implementação do método capacidadeEmMegaBytes().
}
