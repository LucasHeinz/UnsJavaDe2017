package lista3;

public class ContaCorrenteEspecial extends ContaCorrente{

	public ContaCorrenteEspecial(int codigo, double saldo) {
		super(codigo, saldo);
		this.setTaxaSaque(0.001);
	}

}
