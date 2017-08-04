package lista3;

public class ContaCorrente {

	private int codigo;
	private double saldo;
	private double taxaSaque;

	public ContaCorrente(int codigo, double saldo) {
		this.codigo = codigo;
		this.saldo = saldo;
		this.taxaSaque = 0.005;
	}
	
	public void sacar(double valor) {
		this.saldo = (this.saldo - valor - (valor*this.taxaSaque));
	}
	
	public void depositar(double valor) {
		this.saldo = this.saldo + valor;
	}
	
	public void obterSaldo() {
		System.out.println("Seu saldo é de: " + this.saldo);
	}

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTaxaSaque() {
		return taxaSaque;
	}

	public void setTaxaSaque(double taxaSaque) {
		this.taxaSaque = taxaSaque;
	}

}
