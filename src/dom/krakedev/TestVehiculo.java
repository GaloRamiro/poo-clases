package dom.krakedev;

public class TestVehiculo {

    public static final String RESET = "\u001B[0m";
    public static final String VERDE = "\u001B[32m";

    public static void main(String[] args) {

        System.out.println("================ VEHÍCULO 1: Constructor con parámetros ================");

        // Constructor con parámetros
        Vehiculo v1 = new Vehiculo("Toyota", "Corolla", "2024", "$25,000");

        System.out.println(VERDE + "Marca: " + v1.getMarca() + RESET);
        System.out.println(VERDE + "Modelo: " + v1.getModelo() + RESET);
        System.out.println(VERDE + "Año: " + v1.getAnio() + RESET);
        System.out.println(VERDE + "Valor: " + v1.getValor() + RESET);

        System.out.println("\n================ VEHÍCULO 2: Constructor vacío + Setters ================");

        // Constructor vacío
        Vehiculo v2 = new Vehiculo();

        // Asignación de valores mediante setters
        v2.setMarca("Chevrolet");
        v2.setModelo("Spark");
        v2.setAnio("2020");
        v2.setValor("$12,500");

        System.out.println(VERDE + "Marca: " + v2.getMarca() + RESET);
        System.out.println(VERDE + "Modelo: " + v2.getModelo() + RESET);
        System.out.println(VERDE + "Año: " + v2.getAnio() + RESET);
        System.out.println(VERDE + "Valor: " + v2.getValor() + RESET);
    }
}