package tp2;

public class Camioneta extends Vehiculo {

    public Camioneta(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }

    @Override
    public String getTipoVehiculo(){
    return "Camioneta";    
    }
    
    @Override
    public double calcularCostoDeCombustible(int distancia) {
        return (Math.round((combustible.getPrecio() * 0.1) * 100.0) / 100.0) * distancia;
    }
}
