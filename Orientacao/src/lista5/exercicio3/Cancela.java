package lista5.exercicio3;

public class Cancela {

	private boolean aberta;

	public void abrir() {
		if (aberta == false) {
			aberta = true;
		}
	}

	public void fechar() {
		if (aberta) {
			aberta = false;
		}
	}

	public String retornarStatus() {
		if (aberta) {
			return "A porta está aberta";
		} else {
			return "A porta está fechada";
		}

	}
}
