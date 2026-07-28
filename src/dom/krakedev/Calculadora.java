package dom.krakedev;

public class Calculadora {
	// Atributo
	private double resultado;
	// Cosntructor
	public Calculadora(double resultado) {
		this.resultado = resultado;
	}

	// Getter
	public double getResultado() {
		return resultado;
	}

	// Setter
	public void setResultado(double resultado) {
		this.resultado = resultado;
	}

	// Métodos
	public double sumar(double a, double b) {
		resultado = a + b;
		return resultado;
	}

	public double restar(double a, double b) {
		resultado = a - b;
		return resultado;
	}
}