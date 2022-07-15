package paquete06;

public class TarjetaCredito {

    private String nombre;
    private int codigo;
    private int cupoMax;

    public TarjetaCredito(String nom, int cod, int cupMx) {
        nombre = nom;
        codigo = cod;
        cupoMax = cupMx;
    }

    public void establecerNombre(String nombre) {
        this.nombre = nombre;
    }

    public void establecerCodigo(int codigo) {
        this.codigo = codigo;
    }

    public void establecerCupoMax(int cupoMax) {
        this.cupoMax = cupoMax;
    }

    public String obtenerNombre() {
        return nombre;
    }

    public int obtenerCodigo() {
        return codigo;
    }

    public int obtenerCupoMax() {
        return cupoMax;
    }
}
