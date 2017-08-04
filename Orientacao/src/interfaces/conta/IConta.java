/**
 * Este pacote é responsável pelas classes de uma conta.
 */

package interfaces.conta;

/**
 * Esta interface é responsável pelos métodos das contas.
 * 
 * @author Noturno
 *
 */
public interface IConta {

	/**
	 * Este método é responsável pela depósito em uma conta
	 * 
	 * @param valor
	 *            este parâmetro é responsável pelo valor que será depositado.
	 * @throws Exception
	 *             esta exception é responsável por não deixar que seja feito um
	 *             depósito negativo.
	 */
	void deposita(double valor) throws Exception;

	/**
	 * Este método é responsável pelo saque de uma conta.
	 * 
	 * @param valor
	 *            este parâmetro é responsável pelo valor que será sacado.
	 */
	void saca(double valor);

	double getSaldo();

}
