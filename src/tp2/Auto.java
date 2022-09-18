package tp2;

public class Auto extends Vehiculo {

    public Auto(String marca, String patente, Combustible combustible) {
        super(marca, patente, combustible);
    }
        
    @Override
    public double calcularCostoDeCombustible(int distancia) {
        return (Math.round((combustible.getPrecio()*0.07)*100.0)/100.0)*distancia;
        
        
                
                 //hacer metodo
    }
}
