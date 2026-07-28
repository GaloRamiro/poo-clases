package dom.krakedev;

public class TestFecha {

    public static void main(String[] args) {

        System.out.println("============= FECHA: Constructor con parámetros =============");

        Fecha f1 = new Fecha(12, 3, 2026);

        System.out.println("Día: " + f1.getDia());
        System.out.println("Mes: " + f1.getMes());
        System.out.println("Año: " + f1.getAnio());

        System.out.println("\n============= Modificando la fecha con setters =============");

        f1.setDia(25);
        f1.setMes(12);
        f1.setAnio(2027);

        System.out.println("Día: " + f1.getDia());
        System.out.println("Mes: " + f1.getMes());
        System.out.println("Año: " + f1.getAnio());
    }
}