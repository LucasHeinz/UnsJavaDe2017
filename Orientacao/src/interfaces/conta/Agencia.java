/**
 * Este pacote � respons�vel pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe � respons�vel pelos atributos da Ag�ncia
 * 
 * @author Lucas Heinz
 *
 */
public class Agencia {

	/**
	 * Este � o atributo respons�vel pelo n�mero da Ag�ncia.
	 */
	private String numero;

	/**
	 * Este � o construtor da classe.
	 * 
	 * @param numero
	 *            este par�metro � respons�vel pelo n�mero da Ag�ncia.
	 */
	public Agencia(String numero) {
		this.numero = numero;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

}
