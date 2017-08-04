package faturamento;

import java.util.Arrays;
import java.util.List;

public class TesteAvioesCompanhia {

	public static void main(String[] args) {
		
		Boing boing = new Boing(50);
		Boing boing2 = new Boing(50);
		List<Boing> lBoings = Arrays.asList(boing, boing2);
		
		
		Monomotor monomotor = new Monomotor(4);
		Monomotor monomotor2 = new Monomotor(4);
		Monomotor monomotor3 = new Monomotor(4);
		List<Monomotor> lMonomotors = Arrays.asList(monomotor, monomotor2, monomotor3);
		
		Bimotor bimotor = new Bimotor(16);
		Bimotor bimotor2 = new Bimotor(16);
		List<Bimotor> lBimotors = Arrays.asList(bimotor, bimotor2);
		
		Companhia_Aerea companhia_Aerea = new Companhia_Aerea();
		companhia_Aerea.setBoings(lBoings);
		companhia_Aerea.setMonomotores(lMonomotors);
		companhia_Aerea.setBimotores(lBimotors);
		
		System.out.println("O faturamento da companhia aerea é de " + companhia_Aerea.calculaFatura());
		
		
	}
}
