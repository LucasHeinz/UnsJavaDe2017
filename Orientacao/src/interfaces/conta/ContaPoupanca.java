/**
 * Este pacote � respons�vel pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe � respons�vel pelos atributos da conta poupan�a.
 * 
 * @author Lucas Heinz
 *
 */

public class ContaPoupanca extends Conta {

	/**
	 * Este atributo � respon�vel pela taxa de rendimento da conta poupan�a.
	 */
	private double taxaJurosRendimento;

	/**
	 * Este � o construtor da classe.
	 * 
	 * @param agencia este par�metro � respons�vel pela ag�ncia da conta poupan�a.
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
	 * Este m�todo � respons�vel pelo dep�sito em uma conta poupan�a.
	 */
	public void deposita(double valor) {
		setSaldo(getSaldo()+valor);
	}

	/**
	 * Este m�todo � respons�vel pelo saque em uma conta poupan�a.
	 */
	public void saca(double valor) {
		setSaldo(getSaldo()-valor);
	}

	public double getSaldo() {
		return super.getSaldo();
	}

}
