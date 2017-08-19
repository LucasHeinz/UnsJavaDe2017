package lista5.exercicio6;

public class CaixaEletronico {

	private Integer codigo;
	private double valorCaixa;

	public Integer getCodigo() {
		return codigo;
	}

	public void setCodigo(Integer codigo) {
		this.codigo = codigo;
	}

	public double getValorCaixa() {
		return valorCaixa;
	}

	public void setValorCaixa(double valorCaixa) {
		this.valorCaixa = valorCaixa;
	}

	public void sacar(double valor) {

		if (valor < this.valorCaixa) {
			this.valorCaixa = this.valorCaixa - valor;
		} else {
			System.out.println("O valor informado é inválido, informe um valor válido :D");
		}

	}

	
}
