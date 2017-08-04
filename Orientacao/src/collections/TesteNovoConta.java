package collections;

import java.util.ArrayList;
import java.util.List;

public class TesteNovoConta {

	public static void main(String[] args) {
		
		Agencia agencia = new Agencia("1");
		
		Cliente cliente = new Cliente();
		cliente.setCodigo(1);
		cliente.setNome("Joresvaldo");
		
		ContaCorrente contaCorrente = new ContaCorrente(agencia);
		contaCorrente.setNumero("1234");
		contaCorrente.setCliente(cliente);
		contaCorrente.setSaldo(9000d);
		
		ContaCorrente contaCorrente2 = new ContaCorrente(agencia);
		contaCorrente2.setNumero("4321");
		contaCorrente2.setCliente(cliente);
		contaCorrente2.setSaldo(7000d);
		
		ContaCorrente contaCorrente3 = new ContaCorrente(agencia);
		contaCorrente3.setNumero("0987");
		contaCorrente3.setCliente(cliente);
		contaCorrente3.setSaldo(8000d);
		
		
		List<ContaCorrente> listaCorrente = new ArrayList<>();
		listaCorrente.add(contaCorrente);
		listaCorrente.add(contaCorrente2);
		listaCorrente.add(contaCorrente3);
		
		listaCorrente.remove(contaCorrente3);
		
		for (ContaCorrente contaCorrente4 : listaCorrente) {
			System.out.println(contaCorrente4.getNumero());
		}
		
		Agencia agencia2 = new Agencia("2");
		
		Cliente cliente2 = new Cliente();
		
		ContaPoupanca contaPoupanca = new ContaPoupanca(agencia2);
		contaPoupanca.setCliente(cliente2);
		contaPoupanca.setNumero("4567");
		contaPoupanca.setSaldo(57382d);
		contaPoupanca.setTaxaJurosRendimento(2d);
		
		ContaPoupanca contaPoupanca2 = new ContaPoupanca(agencia2);
		contaPoupanca2.setCliente(cliente2);
		contaPoupanca2.setNumero("8375");
		contaPoupanca2.setSaldo(93875d);
		contaPoupanca2.setTaxaJurosRendimento(3d);
		
		ContaPoupanca contaPoupanca3 = new ContaPoupanca(agencia2);
		contaPoupanca3.setCliente(cliente2);
		contaPoupanca3.setNumero("9486");
		contaPoupanca3.setSaldo(38472d);
		contaPoupanca3.setTaxaJurosRendimento(4d);
		
		List<ContaPoupanca> listaPoupanca = new ArrayList<>();
		
		listaPoupanca.add(contaPoupanca);
		listaPoupanca.add(contaPoupanca2);
		listaPoupanca.add(contaPoupanca3);
		
		listaPoupanca.remove(1);
		
		for (ContaPoupanca contaPoupanca4 : listaPoupanca) {
			System.out.println(contaPoupanca4.getNumero());
		}
		
		listaCorrente.clear();
		listaPoupanca.clear();
		
		int tamanhoCorrente = listaCorrente.size();
		System.out.println(tamanhoCorrente);
		
		int tamanhoPoupanca = listaPoupanca.size();
		System.out.println(tamanhoPoupanca);
		
		
	}
}
