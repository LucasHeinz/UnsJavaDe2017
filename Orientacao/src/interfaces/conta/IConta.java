/**
 * Este pacote � respons�vel pelas classes de uma conta.
 */

package interfaces.conta;

/**
 * Esta interface � respons�vel pelos m�todos das contas.
 * 
 * @author Noturno
 *
 */
public interface IConta {

	/**
	 * Este m�todo � respons�vel pela dep�sito em uma conta
	 * 
	 * @param valor
	 *            este par�metro � respons�vel pelo valor que ser� depositado.
	 * @throws Exception
	 *             esta exception � respons�vel por n�o deixar que seja feito um
	 *             dep�sito negativo.
	 */
	void deposita(double valor) throws Exception;

	/**
	 * Este m�todo � respons�vel pelo saque de uma conta.
	 * 
	 * @param valor
	 *            este par�metro � respons�vel pelo valor que ser� sacado.
	 */
	void saca(double valor);

	double getSaldo();

}
