package dom.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			Rectangulo valor = new Rectangulo();
			valor.setAltura(4);
			valor.setBase(6);
			double resultado;
			resultado = valor.calcularArea();
			System.out.println("Formula 1: Base * Altura = Area");
			System.out.println(valor.getAltura()+ " * " + valor.getBase() + " = " + resultado);
			
			
			
			
			// TODO Auto-generated method stub
			Rectangulo valor2 = new Rectangulo();
			valor2.setAltura(7);
			valor2.setBase(87);
			double resultado2;
			resultado2 = valor2.calcularArea();
			System.out.println("Formula 2 : Base * Altura = Area");
			System.out.println(valor2.getAltura() + " * " + valor2.getBase() + " = " + resultado2);
			
			
			
			
		}

	}