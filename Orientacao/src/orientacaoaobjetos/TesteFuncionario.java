package orientacaoaobjetos;

import java.text.DecimalFormat;

public class TesteFuncionario {

	public static void main(String[] args) {
		DecimalFormat df = new DecimalFormat("#0.00");
		
		Funcionario funcionario = new Funcionario();
		funcionario.nome = "Joaquim";
		funcionario.salario = 1500d;
		
		Funcionario funcionario2 = new Funcionario();
		funcionario2.nome = "Maria";
		funcionario2.salario = 1800d;
		
		System.out.println("Funcionário 1: "+ funcionario.nome+
				" com salário de R$"+df.format(funcionario.salario));
		
		System.out.println("Funcionário 2: "+ funcionario2.nome+
				" com salário de R$"+df.format(funcionario2.salario));
	}
}
