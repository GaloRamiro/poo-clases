package dom.krakedev;

public class TestFecha {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Fecha f1 = new Fecha();
		System.out.println("================ Fecha 1 : Valores asignados =================");
		f1.setAnio(2026);
		f1.setDia(12);
		f1.setMes(3);
		System.out.println("Año: "+f1.getAnio()+" Mes: "+f1.getMes()+" Día: "+f1.getDia());
		System.out.println("================ Fecha 2 : Valores asignados con constructor =================");
		Fecha f2 = new Fecha(07, 11, 2007);
		System.out.println("Año: "+f2.getAnio()+" Mes: "+f2.getMes()+" Día: "+f2.getDia());
	}

}
