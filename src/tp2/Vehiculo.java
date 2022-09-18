package tp2;

public abstract class Vehiculo {

    protected String marca;

    protected String patente;

    protected Combustible combustible;

    public Vehiculo(String marca, String patente, Combustible combustible) {
        this.marca = marca;
        this.patente = patente;
        this.combustible = combustible;
    }

    public abstract double calcularCostoDeCombustible(int distancia);
}
