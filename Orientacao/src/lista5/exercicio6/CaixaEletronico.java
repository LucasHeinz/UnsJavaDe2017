package lista5.exercicio6;

public class CaixaEletronico {

	private double valorCaixa;

	public void sacar(double valor) {

		if (valor < this.valorCaixa) {
			this.valorCaixa = this.valorCaixa - valor;
		} else {
			System.out.println("O valor informado � inv�lido, informe um valor v�lido :D");
		}

	}

	public double depositar(double valor) {
		this.valorCaixa = this.valorCaixa + valor;
		return this.valorCaixa;
	}

	public void imprimirExtrato() {

	}
}
