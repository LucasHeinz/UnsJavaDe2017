/**
 * Este pacote � respons�vel pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe � respons�vel pelos atributos da conta corrente.
 * 
 * @author Noturno
 *
 */
public class ContaCorrente extends Conta {

	/**
	 * Este atributo � respons�vel pela taxa de opera��o da conta corrente.
	 */
	private double taxaPorOperacao = 0.45;

	/**
	 * Este � o construtor da classe.
	 * 
	 * @param agencia
	 *            este par�metro � respons�vel pela ag�ncia da conta corrente.
	 */
	public ContaCorrente(Agencia agencia) {
		super(agencia);
	}

	/**
	 * Este m�todo � respons�vel pelo dep�sito da conta corrente.
	 * 
	 * @throws Exception
	 *             exception � respons�vel por n�o deixar ser feito um dep�sito
	 *             com valor menor que zero.
	 */
	public void deposita(double valor) throws Exception {
		if (valor <= 0) {
			throw new Exception("Valor de deposito deve ser maior que 0.");
		}
		setSaldo(getSaldo() + (valor - this.taxaPorOperacao));
	}

	/**
	 * Este m�todo � respons�vel por realizar um saque na conta corrente.
	 */
	public void saca(double valor) {
		setSaldo(getSaldo() - (valor - this.taxaPorOperacao));
	}

	public double getSaldo() {
		return super.getSaldo();
	}

}
