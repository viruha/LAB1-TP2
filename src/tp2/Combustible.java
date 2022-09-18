package tp2;

public class Combustible {

    private String tipo;

    private Double precio;

    public Combustible(String tipo, double precio) {
    this.tipo=tipo;
    this.precio=precio;
            
    }

    public Combustible() {
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
    
    
}
