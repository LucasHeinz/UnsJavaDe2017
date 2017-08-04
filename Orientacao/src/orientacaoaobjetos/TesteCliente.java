package orientacaoaobjetos;

public class TesteCliente {

	public static void main(String[] args) {
		Cliente cliente1 = new Cliente();
		cliente1.codigo = 1;
		cliente1.nome = "José";
		
		Cliente cliente2 = new Cliente();
		System.out.println(cliente1.nome + cliente2.nome);
	}
	
}
