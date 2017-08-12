package lista5.exercicio4;

public class Pessoa {

	private String nome;
	private int DiaNascimento;
	private int mesNascimento;
	private int anoNascimento;
	private String signo;

	public Pessoa(String nome, int diaNascimento, int mesNascimento, int anoNascimento) {
		this.nome = nome;
		DiaNascimento = diaNascimento;
		this.mesNascimento = mesNascimento;
		this.anoNascimento = anoNascimento;
		this.setSigno();
	}

	public void setSigno() {

		switch (mesNascimento) {
		case 1:
			if (this.DiaNascimento <= 19) {
				this.signo = "Capric�rnio";
			} else if (this.DiaNascimento >= 20 && this.DiaNascimento <= 31) {
				this.signo = "Aqu�rio";
			} else if (DiaNascimento > 31) {
				System.out.println("Dia inv�lido");
			}
			break;

		case 2:
			// com ano bisesto
			if ((anoNascimento % 4 == 0 && anoNascimento % 100 != 0) || (anoNascimento % 400 == 0)) {
				if (this.DiaNascimento <= 18) {
					this.signo = "Aqu�rio";
				} else if (this.DiaNascimento >= 19 && this.DiaNascimento <= 29) {
					this.signo = "Peixes";
				} else if (DiaNascimento > 29) {
					System.out.println("Dia inv�lido");
				}
				break;
			} else {
				// sem ano bisesto
				if (this.DiaNascimento <= 18) {
					this.signo = "Aqu�rio";
				} else if (this.DiaNascimento >= 19 && this.DiaNascimento <= 28) {
					this.signo = "Peixes";
				} else if (DiaNascimento > 28) {
					System.out.println("Dia inv�lido");
				}
				break;
			}

		case 3:
			if (this.DiaNascimento <= 20) {
				this.signo = "Peixes";
			} else if (this.DiaNascimento >= 21 && this.DiaNascimento <= 31) {
				this.signo = "�ries";
			} else if (DiaNascimento > 31) {
				System.out.println("Dia inv�lido");
			}
			break;

		case 4:
			if (this.DiaNascimento <= 19) {
				this.signo = "�ries";
			} else if (this.DiaNascimento >= 20 && this.DiaNascimento <= 30) {
				this.signo = "Touro";
			} else if (DiaNascimento > 30) {
				System.out.println("Dia inv�lido");
			}
			break;

		case 5:
			if (this.DiaNascimento <= 21) {
				this.signo = "Touro";
			} else if (this.DiaNascimento >= 22 && this.DiaNascimento <= 31) {
				this.signo = "G�meos";
			} else if (DiaNascimento > 31) {
				System.out.println("Dia inv�lido");
			}
			break;

		case 6:
			if (this.DiaNascimento <= 20) {
				this.signo = "G�meos";
			} else if (this.DiaNascimento >= 21 && this.DiaNascimento <= 30) {
				this.signo = "C�ncer";
			} else if (DiaNascimento > 30) {
				System.out.println("Dia inv�lido");
			}
			break;

		case 7:
			if (this.DiaNascimento <= 22) {
				this.signo = "C�ncer";
			} else if (this.DiaNascimento >= 23 && this.DiaNascimento <= 31) {
				this.signo = "Le�o";
			} else if (DiaNascimento > 31) {
				System.out.println("Dia inv�lido");
			}
			break;

		case 8:
			if (this.DiaNascimento <= 22) {
				this.signo = "Le�o";
			} else if (this.DiaNascimento >= 23 && this.DiaNascimento <= 31) {
				this.signo = "Virgem";
			} else if (DiaNascimento > 31) {
				System.out.println("Dia inv�lido");
			}
			break;

		case 9:
			if (this.DiaNascimento <= 22) {
				this.signo = "Virgem";
			} else if (this.DiaNascimento >= 23 && this.DiaNascimento <= 30) {
				this.signo = "Libra";
			} else if (DiaNascimento > 30) {
				System.out.println("Dia inv�lido");
			}
			break;
		case 10:
			if (this.DiaNascimento <= 22) {
				this.signo = "Libra";
			} else if (this.DiaNascimento >= 23 && this.DiaNascimento <= 31) {
				this.signo = "Escorpi�o";
			} else if (DiaNascimento > 31) {
				System.out.println("Dia inv�lido");
			}
			break;
		case 11:
			if (this.DiaNascimento <= 20) {
				this.signo = "Capric�rnio";
			} else if (this.DiaNascimento >= 21 && this.DiaNascimento <= 30) {
				this.signo = "Aqu�rio";
			} else if (DiaNascimento > 30) {
				System.out.println("Dia inv�lido");
			}
			break;
		case 12:
			if (this.DiaNascimento <= 22) {
				this.signo = "Capric�rnio";
			} else if (this.DiaNascimento >= 23 && this.DiaNascimento <= 31) {
				this.signo = "Aqu�rio";
			} else if (DiaNascimento > 31) {
				System.out.println("Dia inv�lido");
			}
			break;

		default:

			System.out.println("M�s inv�lido.");
			break;
		}
	}

	public String getSigno() {
		return this.signo;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getDiaNascimento() {
		return DiaNascimento;
	}

	public void setDiaNascimento(int diaNascimento) {
		DiaNascimento = diaNascimento;
	}

	public int getMesNascimento() {
		return mesNascimento;
	}

	public void setMesNascimento(int mesNascimento) {
		this.mesNascimento = mesNascimento;
	}

	public int getAnoNascimento() {
		return anoNascimento;
	}

	public void setAnoNascimento(int anoNascimento) {
		this.anoNascimento = anoNascimento;
	}

}
