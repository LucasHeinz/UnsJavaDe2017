package lista4.exsErros;

public class Ponto3D extends Ponto2D{

	private double z;
	
	Ponto3D(double _x, double _y, double _z) {
		x = _x;
		y = _y;		//x e z não são viziveis.
		z = _z
	}
	//Não é feita a chamada do contrutor da classe mãe super
}
