package tp2;

public abstract class Vehiculo {

    protected String marca;

    protected String patente;

    protected Combustible combustible;

    public Vehiculo(String marca, String patente, Combustible combustible) {
    }

    public abstract Double calcularCostoDeCombustible(int distancia);
}
