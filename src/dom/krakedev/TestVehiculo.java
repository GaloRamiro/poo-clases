package dom.krakedev;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo v;
		v = new Vehiculo();

		System.out.println("===========Vehiculo1: Creado===========");
		System.out.println("Año: " + v.anio);
		System.out.println("Vehiculo: " + v.marca);
		System.out.println("Modelo: " + v.modelo);
		System.out.println("Valor: " + v.valor);
		System.out.println("===========Vehiculo1: Valores Asicnados===========");
		v.anio = "2012";
		v.marca = "Chevrolet";
		v.modelo = "Nuevo";
		v.valor = "$24.000";
		System.out.println("Año: " + v.anio);
		System.out.println("Vehiculo: " + v.marca);
		System.out.println("Modelo: " + v.modelo);
		System.out.println("Valor: " + v.valor);
		System.out.println("===========Vehiculo2: Creado===========");

		Vehiculo v2 = new Vehiculo();
		System.out.println("Año: " + v2.anio);
		System.out.println("Vehiculo: " + v2.marca);
		System.out.println("Modelo: " + v2.modelo);
		System.out.println("Valor: " + v2.valor);
		v2.anio = "2013";
		v2.marca = "Mazda";
		v2.modelo = "Viejo";
		v2.valor = "$14.000";
		System.out.println("===========Vehiculo2: Valores Asicnados===========");
		System.out.println("Año: " + v2.anio);
		System.out.println("Vehiculo: " + v2.marca);
		System.out.println("Modelo: " + v2.modelo);
		System.out.println("Valor: " + v2.valor);
	}

}