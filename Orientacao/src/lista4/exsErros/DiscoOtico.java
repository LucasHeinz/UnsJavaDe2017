package lista4.exsErros;

public class DiscoOtico extends Dispositivo{

	DiscoOtico(long c) {
		super("Disco Otico", 241172480L);
	}
	
	public String toString() {
		return "Dispositivo: " + nome+ "Capacidade:" + c; // c n�o foi declarada, nome n�o � vizivel
	}
	//N�o � feita a implementa��o do m�todo capacidadeEmMegaBytes().
}
