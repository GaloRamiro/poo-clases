package dom.krakedev;

public class TestCalculadora {

    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";

    public static void main(String[] args) {

        System.out.println("================ CALCULADORA 1: Constructor con parámetros ================");

        // Constructor con parámetros
        Calculadora c1 = new Calculadora(4, 5);

        c1.sumar();
        System.out.println(VERDE + "Resultado de la suma: " + c1.getResultado() + RESET);

        c1.setNumero1(10);
        c1.setNumero2(3);

        c1.restar();
        System.out.println(VERDE + "Resultado de la resta: " + c1.getResultado() + RESET);

        System.out.println("\n================ CALCULADORA 2: Constructor vacío + Setters ================");

        // Constructor vacío
        Calculadora c2 = new Calculadora();

        // Asignar valores usando setters
        c2.setNumero1(20);
        c2.setNumero2(8);

        c2.sumar();
        System.out.println(VERDE + "Resultado de la suma: " + c2.getResultado() + RESET);

        c2.setNumero1(50);
        c2.setNumero2(15);

        c2.restar();
        System.out.println(VERDE + "Resultado de la resta: " + c2.getResultado() + RESET);
    }
}