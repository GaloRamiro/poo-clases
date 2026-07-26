package dom.krakedev;

public class TestVehiculo {

	public static void main(String[] args) {
		Vehiculo v;
		v = new Vehiculo();

		System.out.println("===========Vehiculo1: Creado===========");
		System.out.println("Año: " + v.getAnio());
		System.out.println("Vehiculo: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		System.out.println("Valor: " + v.getValor());
		System.out.println("===========Vehiculo1: Valores Asicnados===========");
		v.setAnio("2002"); 
		v.setMarca("Chevrolet"); 
		v.setModelo("Nuevo");
		v.setValor("$24.000");
		System.out.println("Año: " + v.getAnio());
		System.out.println("Vehiculo: " + v.getMarca());
		System.out.println("Modelo: " + v.getModelo());
		System.out.println("Valor: " + v.getValor());
		System.out.println("===========Vehiculo2: Creado===========");

		Vehiculo v2 = new Vehiculo();
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Vehiculo: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		System.out.println("Valor: " + v2.getValor());
		
		v2.setAnio("2013"); 
		v2.setMarca("Mazda"); 
		v2.setModelo("Viejo");
		v2.setValor("$14.000");
		
		System.out.println("===========Vehiculo2: Valores Asicnados===========");
		System.out.println("Año: " + v2.getAnio());
		System.out.println("Vehiculo: " + v2.getMarca());
		System.out.println("Modelo: " + v2.getModelo());
		System.out.println("Valor: " + v2.getValor());
	}

}