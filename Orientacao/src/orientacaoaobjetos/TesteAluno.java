package orientacaoaobjetos;

import java.text.ParseException;
import java.text.SimpleDateFormat;

public class TesteAluno {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/mm/yyyy");
		
		Aluno aluno = new Aluno();
		aluno.nome = "José";
		aluno.rg = "123456";
		aluno.dtNascimento = sdf.parse("01/01/1995");
		
		Aluno aluno2 = new Aluno();
		aluno2.nome = "Maria";
		aluno2.rg = "654321";
		aluno2.dtNascimento = sdf.parse("01/03/1995");
		
		System.out.println("Aluno 1: "+aluno.nome + 
				" com RG "+aluno.rg + 
				" que nasceu no dia "+sdf.format(aluno.dtNascimento));
		System.out.println("Aluno 2: "+aluno2.nome + 
				" com RG "+aluno2.rg + 
				" que nasceu no dia "+sdf.format(aluno2.dtNascimento));
	}
}
