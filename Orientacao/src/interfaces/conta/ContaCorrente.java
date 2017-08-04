/**
 * Este pacote é responsável pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe é responsável pelos atributos da conta corrente.
 * 
 * @author Noturno
 *
 */
public class ContaCorrente extends Conta {

	/**
	 * Este atributo é responsável pela taxa de operação da conta corrente.
	 */
	private double taxaPorOperacao = 0.45;

	/**
	 * Este é o construtor da classe.
	 * 
	 * @param agencia
	 *            este parâmetro é responsável pela agência da conta corrente.
	 */
	public ContaCorrente(Agencia agencia) {
		super(agencia);
	}

	/**
	 * Este método é responsável pelo depósito da conta corrente.
	 * 
	 * @throws Exception
	 *             exception é responsável por não deixar ser feito um depósito
	 *             com valor menor que zero.
	 */
	public void deposita(double valor) throws Exception {
		if (valor <= 0) {
			throw new Exception("Valor de deposito deve ser maior que 0.");
		}
		setSaldo(getSaldo() + (valor - this.taxaPorOperacao));
	}

	/**
	 * Este método é responsável por realizar um saque na conta corrente.
	 */
	public void saca(double valor) {
		setSaldo(getSaldo() - (valor - this.taxaPorOperacao));
	}

	public double getSaldo() {
		return super.getSaldo();
	}

}
