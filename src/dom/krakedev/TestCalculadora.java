package dom.krakedev;

public class TestCalculadora {

	
		// Códigos ANSI
		public static final String RESET = "\u001B[0m";
		public static final String VERDE = "\u001B[32m";

		public static void main(String[] args) {

			Calculadora c1 = new Calculadora();
			double r1;

			r1 = c1.sumar(4, 5);
			System.out.println(VERDE + "El resultado de la suma es: " + r1 + RESET);

			r1 = c1.restar(6, 5);
			System.out.println(VERDE + "El resultado de la resta es: " + r1 + RESET);
		}
	}