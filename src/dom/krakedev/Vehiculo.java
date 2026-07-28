package dom.krakedev;

public class Vehiculo {

    private String marca;
    private String modelo;
    private String anio;
    private String valor;

    // Constructor con parámetros
    public Vehiculo(String marca, String modelo, String anio, String valor) {
        this.marca = marca;
        this.modelo = modelo;
        this.anio = anio;
        this.valor = valor;
    }

    // Getters
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public String getAnio() {
        return anio;
    }

    public String getValor() {
        return valor;
    }

    // Setters
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAnio(String anio) {
        this.anio = anio;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }
}