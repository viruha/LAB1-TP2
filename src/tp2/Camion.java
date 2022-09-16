package tp2;

public class Camion extends Vehiculo {

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
 
    @Override
    public Double calcularCostoDeCombustible(int distancia) {
        return 0.0; //hacer metodo
    }
}
