package orientacaoaobjetos;

public class TesteContaAgencia {

	public static void main(String[] args) {
		Agencia agencia = new Agencia();
		agencia.numero = "1234";
		
		Conta conta = new Conta();
		conta.numero = "123456";
		conta.saldo = 1500d;
		
		conta.agencia = agencia;
		
		/*System.out.println("A conta "+conta.numero+
				" com limite R$"+df.format(conta.limite)+
				" com saldo R$"+df.format(conta.saldo)+
				" pertence a Agência "+conta.agencia.numero);*/
		
		conta.depositar(150);
		conta.sacar(50);
		System.out.println(conta.consultarSaldoDisponivel());
		System.out.println(conta.imprimirExtrato());
		
		
	}
	
}
