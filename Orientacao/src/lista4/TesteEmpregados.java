package lista4;

public class TesteEmpregados {

	public static void main(String[] args) {
		
		TrabalhadorComissionado trabalhadorComissionado = new TrabalhadorComissionado("Robertson",  " Ademilton ", 1000d, 1000, 25d);
		System.out.println("O ganho do funcionario é: "+trabalhadorComissionado.calcularGanho());
		
		TrabalhadorHora trabalhadorHora = new TrabalhadorHora("Rosonado", "Obsteve", 1000d, 2);
		System.out.println(trabalhadorHora.calcularGanho());
		
		TrabalhadorPecaProduzida trabalhadorPecaProduzida = new TrabalhadorPecaProduzida("Reberson", "Fernandes", 150, 200);
		System.out.println(trabalhadorPecaProduzida.calcularGanho());
		
		Chefe chefe = new Chefe("Labares", "Dovakin", 6000);
		System.out.println(chefe.calcularGanho());
	}
	
}
