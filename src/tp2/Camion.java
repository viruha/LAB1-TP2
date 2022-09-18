package tp2;

public class Camion extends Vehiculo {

    public Camion(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
 
    @Override
    public double calcularCostoDeCombustible(int distancia) {
        return (Math.round((combustible.getPrecio()*0.12)*100.0)/100.0)*distancia; //hacer metodo
    }
}
