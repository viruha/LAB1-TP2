package tp2;

import static java.lang.Math.abs;

public class Viaje {

    private int distancia;

    private int peajes;

    private Ciudad origen;

    private Vehiculo vehiculo;

    private Ciudad destino;

    public Viaje(Ciudad origen, Ciudad destino, int peajes, int distancia, Vehiculo vehiculo) {
        this.origen=origen;
        this.destino=destino;
        this.peajes=peajes;
        this.distancia=distancia;
        this.vehiculo=vehiculo;
    }

    public Viaje(Ciudad origen, Ciudad destino, int peajes, Vehiculo vehiculo) {
    this.origen=origen;
    this.destino=destino;
    this.peajes=peajes;
    this.vehiculo=vehiculo;
    this.distancia=calculoDistancia();
    }

    public final int calculoDistancia() {
        if(!(origen.getRuta().equals(destino.getRuta()))){
            return distancia;}
            else{
            return abs(origen.getKmRuta()-destino.getKmRuta());
                    }
        }
    
    public double calculoCostoPeajes() {
        double total=0;
     
        switch(vehiculo.getTipoVehiculo()){
            case "Auto":
                total=peajes*100.5;
                break;
            case "Camioneta":
                total=peajes*123.1;
                break;    
       case "Camion":
                total=peajes*155.8;
                break;
        }
    return (Math.round(total * 100.0) / 100.0);
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
