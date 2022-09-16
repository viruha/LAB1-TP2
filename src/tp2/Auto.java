package tp2;

public class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
        
    @Override
    public Double calcularCostoDeCombustible(int distancia) {
        return 0.0; //hacer metodo
    }
}
