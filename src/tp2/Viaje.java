package tp2;

public class Viaje {

    private int distancia;

    private int peajes;

    private Ciudad origen;

    private Vehiculo vehiculo;

    private Ciudad destino;

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
        return distancia; //modificado por Germán 180922
    }

    //Agregados todos los set y get por Germán 180922

    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
      
    public int getPeajes() {
        return peajes;
    }

    public void setPeajes(int peajes) {
        this.peajes = peajes;
    }

    public Ciudad getOrigen() {
        return origen;
    }

    public void setOrigen(Ciudad origen) {
        this.origen = origen;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public Ciudad getDestino() {
        return destino;
    }

    public void setDestino(Ciudad destino) {
        this.destino = destino;
    }
    
}
