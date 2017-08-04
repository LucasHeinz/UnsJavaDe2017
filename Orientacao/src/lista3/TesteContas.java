package lista3;

public class TesteContas {

	public static void main(String[] args) {
		ContaCorrente contaCorrente = new ContaCorrente(1, 10000d);
		
		contaCorrente.depositar(100d);
		contaCorrente.sacar(100d);
		contaCorrente.obterSaldo();
		
		ContaCorrenteEspecial contaCorrenteEspecial = new ContaCorrenteEspecial(1, 9000d);
		contaCorrenteEspecial.depositar(900);
		contaCorrenteEspecial.sacar(900);
		contaCorrenteEspecial.obterSaldo();
	}
}
