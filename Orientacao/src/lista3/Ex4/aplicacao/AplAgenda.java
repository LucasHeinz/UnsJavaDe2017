package lista3.Ex4.aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import lista3.Ex4.dominio.*;

//import br.ufes.inf.prog3.lista2.exercicio04.dominio.Contato;
//import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefone;
//import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefoneCelular;
//import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefoneComercial;
//import br.ufes.inf.prog3.lista2.exercicio04.dominio.ContatoTelefoneResidencial;

public class AplAgenda {

	private static final Scanner scanner = new Scanner(System.in);

	/** Onde s�o mantidos os contatos. */
	private static List<Contato> contatos = new ArrayList<>();

	/** Adiciona um contato. */
	private static void adicionarContato(Contato contato) {
		contatos.add(contato);
	}

	/** Obt�m um contato, dado o �ndice. */
	private static Contato obterContato(int indice) {
		if (indice < contatos.size()) {
			return (Contato) contatos.get(indice);
		} else {
			return null;
		}
	}

	/** Imprime todos os contatos e seus �ndices. */
	private static void imprimirContatos() {
		if (contatos.size() == 0) {
			System.out.println("\tAgenda vazia.");
		} else {
			for (int i = 0; i < contatos.size(); i++) {
				Contato contato = (Contato) contatos.get(i);
				System.out.println("\t" + i + ": " + contato.getNome() + " (" + contato.getTipo() + ")");
			}
		}
		System.out.println();

	}

	/** L� do teclado. */
	private static String lerTeclado() {
		return scanner.nextLine();
	}

	/** M�todo main. */
	public static void main(String[] args) {
		System.out.println("Bem-vindo � Agenda.\n");
		System.out.println("Digite o comando. '?' para ajuda e 'S' para sair.");
		System.out.print("\n> ");
		// L� o comando.
		String comando = lerTeclado();
		// Continua pedindo comandos at� encontrar o comando S, de sair.
		while (!"S".equalsIgnoreCase(comando)) {
			// Comando ?: ajuda.
			if ("?".equals(comando)) {
				System.out.println("\nCOMANDOS DISPON�VEIS:\n" + " ?: Mostra esta lista de comandos;\n\n"
						+ " A: Mostra a agenda;\n" + " C: Mostra um contato da agenda;\n" + " S: Sai do programa;\n\n"
						+ "+T: Adiciona um telefone;\n");
			}
			// Comando A: mostrar agenda.
			else if ("A".equalsIgnoreCase(comando)) {
				System.out.println("\nAGENDA:");
				imprimirContatos();
			}
			// Comando C: mostrar contato.
			else if ("C".equalsIgnoreCase(comando)) {
				executarMostrarContato();
			}
			// Comando +T: adicionar telefone.
			else if ("+T".equalsIgnoreCase(comando)) {
				executarAdicionarTelefone();
			}
			// L� o pr�ximo comando.
			System.out.print("\n> ");
			comando = lerTeclado();
		}
	}

	/** Comando C: mostrar contato. */
	public static void executarMostrarContato() {
		// L� o �ndice.
		System.out.print("\nN�mero: ");

		String indice = lerTeclado();
		// Verifica se � um n�mero.
		if (indice.matches("[0-9]+")) {
			// Converte para inteiro.
			int i = Integer.parseInt(indice);
			// Verifica se o �ndice existe.
			Contato contato = obterContato(i);
			if (contato != null) {
				// Imprime o contato.
				System.out.println(
						"\nNome: " + contato.getNome() + "\n" + contato.getTipo() + ": " + contato.getContato());
			} else {// N�o existe.
				System.out.println("Agenda n�o cont�m item de n�mero " + i);
			}
		} else {// N�o � n�mero.
			System.out.println("N�o � um n�mero.");
		}
	}

	/** Comando +T: adicionar telefone. */
	public static void executarAdicionarTelefone() {
		
		//TODO Criar a implementa��o para adicionar telefone
	}
}
