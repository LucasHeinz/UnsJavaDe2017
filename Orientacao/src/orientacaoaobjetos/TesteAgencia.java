package orientacaoaobjetos;

public class TesteAgencia {

	public static void main(String[] args) {
		Agencia agencia = new Agencia();
		agencia.numero = "12345";
		
		Agencia agencia2 = new Agencia();
		agencia2.numero = "54321";
		
		System.out.println("Ag�ncia 1: "+agencia.numero);
		System.out.println("Ag�ncia 2: "+agencia2.numero);
	}
}
