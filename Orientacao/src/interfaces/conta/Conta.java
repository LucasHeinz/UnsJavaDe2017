/**
 * Este pacote � respons�vel pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe � respons�vel pelos atributos da Conta.
 * 
 * @author Lucas Heinz
 */
public abstract class Conta implements IConta {

	/**
	 * Cliente � o atributo respons�vel pelo cliente da conta.
	 */
	private Cliente cliente;
	/**
	 * Agencia � o atributo respons�vel pela ag�ncia da conta.
	 */
	private Agencia agencia;
	/**
	 * Numero � o atributo respons�vel pelo n�mero da conta.
	 */
	private String numero;
	/**
	 * Agencia � o atributo respons�vel pelo saldo da conta 
	 */
	private double saldo;

	/**
	 * Este � um construtor da classe.
	 * 
	 * @param agencia este par�metro � respons�vel pela ag�ncia da conta.
	 */
	// Construtor
	public Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	/**
	 * Este � um construtor da classe.
	 * 
	 * @param agencia este par�metro � respons�vel pela ag�ncia da conta.
	 * @param numero este par�metro � respons�vel pelo n�mero da conta.
	 */
	// Construtor
	public Conta(Agencia agencia, String numero) {
		this(agencia);
		this.numero = numero;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public Agencia getAgencia() {
		return agencia;
	}

	public void setAgencia(Agencia agencia) {
		this.agencia = agencia;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

}
