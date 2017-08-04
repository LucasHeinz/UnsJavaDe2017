package orientacaoaobjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteClienteCartaoCredito {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Cliente cliente = new Cliente();
		cliente.codigo = 1;
		cliente.nome = "Jo�o";
		
		CartaoCredito cartaoCredito = new CartaoCredito();
		cartaoCredito.numero = "123456";
		cartaoCredito.dataValidade = sdf.parse("01/01/2025");
		
		//vincular o cliente ao cart�o de cr�dito
		cartaoCredito.cliente = cliente;
		
		System.out.println("O cliente "+ cartaoCredito.cliente.nome +
				" com c�digo "+ cartaoCredito.cliente.codigo+
				" possui o cart�o de cr�dito "+ cartaoCredito.numero+
				" com validade at� "+sdf.format(cartaoCredito.dataValidade));
	}
}
