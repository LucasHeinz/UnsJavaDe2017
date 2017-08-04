package orientacaoaobjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteCartaoCredito {

	public static void main(String[] args) throws ParseException{
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		CartaoCredito cartaoCredito = new CartaoCredito();
		cartaoCredito.numero = "123456789";
		cartaoCredito.dataValidade = sdf.parse("01/01/2020");
		
		CartaoCredito cartaoCredito2 = new CartaoCredito();
		cartaoCredito2.numero = "987654321";
		cartaoCredito2.dataValidade = sdf.parse("01/03/2025");
		
		System.out.println("Cartão 1: " + cartaoCredito.numero +
				" com validade até "+
				sdf.format(cartaoCredito.dataValidade));
		System.out.println("Cartão 2: " + cartaoCredito2.numero + 
				" com validade até "+
				sdf.format(cartaoCredito2.dataValidade));
		
	}
}
