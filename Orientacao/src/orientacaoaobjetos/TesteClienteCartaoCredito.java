package orientacaoaobjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteClienteCartaoCredito {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Cliente cliente = new Cliente();
		cliente.codigo = 1;
		cliente.nome = "João";
		
		CartaoCredito cartaoCredito = new CartaoCredito();
		cartaoCredito.numero = "123456";
		cartaoCredito.dataValidade = sdf.parse("01/01/2025");
		
		//vincular o cliente ao cartão de crédito
		cartaoCredito.cliente = cliente;
		
		System.out.println("O cliente "+ cartaoCredito.cliente.nome +
				" com código "+ cartaoCredito.cliente.codigo+
				" possui o cartão de crédito "+ cartaoCredito.numero+
				" com validade até "+sdf.format(cartaoCredito.dataValidade));
	}
}
