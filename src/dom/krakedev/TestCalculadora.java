package dom.krakedev;

public class TestCalculadora {

	public static final String RESET = "\u001B[0m";
	public static final String VERDE = "\u001B[32m";

	public static void main(String[] args) {

		System.out.println("================ CALCULADORA 1: Constructor con parámetros ================");

		Calculadora c1 = new Calculadora(4, 5);

		c1.sumar();
		System.out.println("Resultado de la suma: " + c1.getResultado());

		c1.setNumero1(10);
		c1.setNumero2(3);

		c1.restar();
		System.out.println("Resultado de la resta: " + c1.getResultado());
	}
}