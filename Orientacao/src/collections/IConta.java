package collections;

public interface IConta {

	void deposita(double valor) throws Exception;

	void saca(double valor);

	double getSaldo();
	
}
