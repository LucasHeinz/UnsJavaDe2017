/**
 * Este pacote é responsável pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe é reposnável pela geração do extrato de qualquer tipo de conta.
 * 
 * @author Lucas Heinz
 *
 */
public class GeradorDeExtrato {

	/**
	 * Este método é responsável pela geração do extrato de qualquer tipo de conta.
	 * 
	 * @param c este parâmetro é reponsável pela conta a qual será gerada o extrato.
	 */
	public static void geraExtrato(IConta c) {
		System.out.println(" EXTRATO ");
		System.out.println(" SALDO : " + c.getSaldo());
	}

}
