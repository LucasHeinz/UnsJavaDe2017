/**
 * Este pacote é responsável pelas classes de uma conta.
 */
package interfaces.conta;

/**
 * Esta classe é responsável pelos atributos do clinte.
 * 
 * @author Noturno
 *
 */
public class Cliente {

	/**
	 * Este atributo é responsável pelo código do cliente.
	 */
	private int codigo;
	/**
	 * Este atributo é responsável pelo nome do cliente.
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
