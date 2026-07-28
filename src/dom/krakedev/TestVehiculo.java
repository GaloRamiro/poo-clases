package dom.krakedev;

public class TestVehiculo {

    public static void main(String[] args) {

        System.out.println("================ VEHÍCULO: Constructor con parámetros ================");

        // Creación del objeto utilizando el constructor con parámetros
        Vehiculo v1 = new Vehiculo("Toyota", "Corolla", "2024", "$25,000");

        System.out.println("Marca: " + v1.getMarca());
        System.out.println("Modelo: " + v1.getModelo());
        System.out.println("Año: " + v1.getAnio());
        System.out.println("Valor: " + v1.getValor());

        System.out.println("\n================ Modificando datos con setters ================");

        // Modificación de los atributos usando setters
        v1.setMarca("Chevrolet");
        v1.setModelo("Spark");
        v1.setAnio("2020");
        v1.setValor("$12,500");

        System.out.println("Marca: " + v1.getMarca());
        System.out.println("Modelo: " + v1.getModelo());
        System.out.println("Año: " + v1.getAnio());
        System.out.println("Valor: " + v1.getValor());
    }
}