/**
 * Este pacote é responsável pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe é responsável pelos atributos da Conta.
 * 
 * @author Lucas Heinz
 */
public abstract class Conta implements IConta {

	/**
	 * Cliente é o atributo responsável pelo cliente da conta.
	 */
	private Cliente cliente;
	/**
	 * Agencia é o atributo responsável pela agência da conta.
	 */
	private Agencia agencia;
	/**
	 * Numero é o atributo responsável pelo número da conta.
	 */
	private String numero;
	/**
	 * Agencia é o atributo responsável pelo saldo da conta 
	 */
	private double saldo;

	/**
	 * Este é um construtor da classe.
	 * 
	 * @param agencia este parâmetro é responsável pela agência da conta.
	 */
	// Construtor
	public Conta(Agencia agencia) {
		this.agencia = agencia;
	}

	/**
	 * Este é um construtor da classe.
	 * 
	 * @param agencia este parâmetro é responsável pela agência da conta.
	 * @param numero este parâmetro é responsável pelo número da conta.
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
