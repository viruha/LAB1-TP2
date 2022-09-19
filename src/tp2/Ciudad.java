package tp2;

public class Ciudad {

    private String ruta;

    private int kmRuta;

    private String nombre;

    public Ciudad(String nombre, String ruta, int kmRuta) {
    this.nombre=nombre;
    this.ruta=ruta;
    this.kmRuta=kmRuta;
    }

    public String getRuta() {
        return ruta;
    }

    public int getKmRuta() {
        return kmRuta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public void setKmRuta(int kmRuta) {
        this.kmRuta = kmRuta;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Ciudad{" + "Nombre=" + nombre + ", Ruta=" + ruta + ", kmRuta=" + kmRuta + '}';
    }
    
    
}
