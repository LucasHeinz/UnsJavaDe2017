/**
 * Este pacote � respons�vel pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe � respons�vel pelos atributos do clinte.
 * 
 * @author Noturno
 *
 */
public class Cliente {

	/**
	 * Este atributo � respons�vel pelo c�digo do cliente.
	 */
	private int codigo;
	/**
	 * Este atributo � respons�vel pelo nome do cliente.
	 */
	private String nome;

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

}
