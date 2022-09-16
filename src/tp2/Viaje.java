package tp2;

public class Viaje {

    private int distancia;

    private int peajes;

    private Ciudad origen;

    private Vehiculo vehiculo;

    private Ciudad Destino;

    public Viaje(Ciudad origen, Ciudad destino, int peajes, int distancia, Vehiculo vehiculo) {
    }

    public Viaje(Ciudad origen, Ciudad destino, int peajes, Vehiculo vehiculo) {
    }

    public void calculoDistancia() {
    }

    public Double calculoCostoPeajes() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Double calculoCostoCombustible() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public Double calculoCostoTotal() {
        throw new UnsupportedOperationException("Not supported yet.");
    }

    public int getDistancia() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
