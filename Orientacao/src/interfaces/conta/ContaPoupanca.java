/**
 * Este pacote é responsável pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe é responsável pelos atributos da conta poupança.
 * 
 * @author Lucas Heinz
 *
 */

public class ContaPoupanca extends Conta {

	/**
	 * Este atributo é responável pela taxa de rendimento da conta poupança.
	 */
	private double taxaJurosRendimento;

	/**
	 * Este é o construtor da classe.
	 * 
	 * @param agencia este parâmetro é responsável pela agência da conta poupança.
	 */
	public ContaPoupanca(Agencia agencia) {
		super(agencia);
	}

	public double getTaxaJurosRendimento() {
		return taxaJurosRendimento;
	}

	public void setTaxaJurosRendimento(double taxaJurosRendimento) {
		this.taxaJurosRendimento = taxaJurosRendimento;
	}

	/**
	 * Este método é responsável pelo depósito em uma conta poupança.
	 */
	public void deposita(double valor) {
		setSaldo(getSaldo()+valor);
	}

	/**
	 * Este método é responsável pelo saque em uma conta poupança.
	 */
	public void saca(double valor) {
		setSaldo(getSaldo()-valor);
	}

	public double getSaldo() {
		return super.getSaldo();
	}

}
