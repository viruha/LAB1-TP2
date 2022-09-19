package tp2;

import static java.lang.Math.abs;

public class Viaje {

    private int distancia;

    private int peajes;

    private Ciudad Origen;

    private Vehiculo vehiculo;

    private Ciudad Destino;

    public Viaje(Ciudad origen, Ciudad destino, int peajes, int distancia, Vehiculo vehiculo) {
        this.Origen=origen;
        this.Destino=destino;
        this.peajes=peajes;
        this.distancia=distancia;
        this.vehiculo=vehiculo;
    }

    public Viaje(Ciudad origen, Ciudad destino, int peajes, Vehiculo vehiculo) {
    this.Origen=origen;
    this.Destino=destino;
    this.peajes=peajes;
    this.vehiculo=vehiculo;
    this.distancia=calculoDistancia();
    }

    public final int calculoDistancia() {
        if(!(Origen.getRuta().equals(Destino.getRuta()))){
            return distancia;}
            else{
            return abs(Origen.getKmRuta()-Destino.getKmRuta());
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
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
