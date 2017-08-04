package faturamento;

import java.util.List;

public class Companhia_Aerea {

	private List<Boing> boings;
	private List<Monomotor> monomotores;
	private List<Bimotor> bimotores;

	public List<Boing> getBoings() {
		return boings;
	}

	public void setBoings(List<Boing> boings) {
		this.boings = boings;
	}

	public List<Monomotor> getMonomotores() {
		return monomotores;
	}

	public void setMonomotores(List<Monomotor> monomotores) {
		this.monomotores = monomotores;
	}

	public List<Bimotor> getBimotores() {
		return bimotores;
	}

	public void setBimotores(List<Bimotor> bimotores) {
		this.bimotores = bimotores;
	}

	public double calculaFatura() {
		double fatura = 0d;
		for (Bimotor bimotor : getBimotores()) {
			fatura += bimotor.getPrecoPorPassagem() * bimotor.getQtdeDeLugares();
		}
		for (Boing boing : boings) {
			fatura += boing.getPrecoPorPassagem() * boing.getQtdeDeLugares();
		}
		for (Monomotor monomotor : monomotores) {
			fatura += monomotor.getPrecoPorPassagem() * monomotor.getQtdeDeLugares();
		}
		
		return fatura;
	}
	
}
