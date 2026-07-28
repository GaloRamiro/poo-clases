package dom.krakedev;

public class TestCalculadora {

    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";

    public static void main(String[] args) {

        Calculadora c1 = new Calculadora(0);

        c1.sumar(4, 5);
        System.out.println(VERDE + "Resultado: " + c1.getResultado() + RESET);

        c1.restar(10, 3);
        System.out.println(VERDE + "Resultado: " + c1.getResultado() + RESET);
    }
}