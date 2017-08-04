/**
 * Este pacote � respons�vel pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe � reposn�vel pela gera��o do extrato de qualquer tipo de conta.
 * 
 * @author Lucas Heinz
 *
 */
public class GeradorDeExtrato {

	/**
	 * Este m�todo � respons�vel pela gera��o do extrato de qualquer tipo de conta.
	 * 
	 * @param c este par�metro � repons�vel pela conta a qual ser� gerada o extrato.
	 */
	public static void geraExtrato(IConta c) {
		System.out.println(" EXTRATO ");
		System.out.println(" SALDO : " + c.getSaldo());
	}

}
