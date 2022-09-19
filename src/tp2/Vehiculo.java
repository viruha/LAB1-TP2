package tp2;

public abstract class Vehiculo {

    protected String marca;

    protected String patente;

    protected Combustible combustible;

    public Vehiculo(String marca, String patente, Combustible combustible) {
    this.marca=marca;
    this.patente=patente;
    this.combustible=combustible;
            }

    public String getMarca() {
        return marca;
    }

    public String getPatente() {
        return patente;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "marca=" + marca + ", patente=" + patente + ", combustible=" + combustible + '}';
    }
    

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }
    public abstract String getTipoVehiculo();

    public abstract double calcularCostoDeCombustible(int distancia);
}
