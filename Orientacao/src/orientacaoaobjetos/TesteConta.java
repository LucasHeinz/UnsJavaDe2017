package orientacaoaobjetos;

import java.text.DecimalFormat;

public class TesteConta {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Conta conta = new Conta();
		conta.numero = "123456";
		//conta.limite = 500d;
		conta.saldo = 1000d;
		
		Conta conta2 = new Conta();
		conta2.numero = "654321";
		conta2.limite = 400d;
		conta2.saldo = 1200d;
		
		System.out.println("Conta 1: "+conta.numero + 
				" com limite de "+df.format(conta.limite) + 
				" com saldo de "+df.format(conta.saldo));
		
		System.out.println("Conta 2: "+conta2.numero + 
				" com limite de "+df.format(conta2.limite) + 
				" com saldo de "+df.format(conta2.saldo));
		
	}
}
