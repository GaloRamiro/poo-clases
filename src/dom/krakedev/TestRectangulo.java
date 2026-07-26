package dom.krakedev;

public class TestRectangulo {

	public static void main(String[] args) {
		
			// TODO Auto-generated method stub
			Rectangulo valor = new Rectangulo();
			valor.altura = 4;
			valor.base = 6;
			int resultado;
			resultado = valor.calcularArea();
			System.out.println("Formula 1: Base * Altura = Area");
			System.out.println(valor.base + " * " + valor.altura + " = " + resultado);
			
			
			
			
			// TODO Auto-generated method stub
			Rectangulo valor2 = new Rectangulo();
			valor2.altura = 7;
			valor2.base = 87;
			int resultado2;
			resultado2 = valor2.calcularArea();
			System.out.println("Formula 2 : Base * Altura = Area");
			System.out.println(valor2.base + " * " + valor2.altura + " = " + resultado2);
			
			
			
			
		}

	}