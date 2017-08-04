package orientacaoaobjetos;

import java.text.DecimalFormat;

public class Conta {

	DecimalFormat df = new DecimalFormat("#0.00");
	
	String numero;
	double saldo;
	double limite = 100d;
	Agencia agencia;
	
	public void depositar(double valor){
		this.saldo += valor;
	}
	
	public void sacar(double valor){
		this.saldo -= valor;
	}
	
	public String imprimirExtrato(){
		String extrato = "";
		extrato += "N�mero da Conta: "+this.numero;
		extrato += "\nSaldo da Conta: "+df.format(this.saldo);
		extrato += "\nLimite da Conta: "+df.format(this.limite);
		extrato += "\nN�mero da Ag�ncia: "+this.agencia.numero;
		return extrato;
	}
	
	public double consultarSaldoDisponivel(){
		return this.saldo + this.limite;
	}
	
}
