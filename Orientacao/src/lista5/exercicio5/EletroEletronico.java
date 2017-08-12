package lista5.exercicio5;

public class EletroEletronico {

	private int volume;
	private String tipo;

	public EletroEletronico(String tipo) {
		this.volume = 0;
		this.tipo = tipo;
	}

	public void aumentaVolume() {
		if (this.tipo.equalsIgnoreCase("radio")) {
			volume++;
		} else if (this.tipo.equalsIgnoreCase("televisao")) {
			this.volume = volume + 2;
		} else if (this.tipo.equalsIgnoreCase("micro-system")) {
			this.volume = volume + 3;
		}

		if (this.volume > 100) {
			this.volume = 100;
		}
	}

	public void diminuiVolume() {
		if (this.tipo.equalsIgnoreCase("radio")) {
			volume--;
		} else if (this.tipo.equalsIgnoreCase("televisao")) {
			this.volume = volume - 2;
		} else if (this.tipo.equalsIgnoreCase("micro-system")) {
			this.volume = volume - 3;
		}

		if (this.volume < 0) {
			this.volume = 0;
		}

	}

	public int getVolume() {
		return volume;
	}

}
