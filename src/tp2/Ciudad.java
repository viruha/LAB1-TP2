package tp2;

public class Ciudad {

    private String ruta;

    private int kmRuta;

    private String nombre;

    public Ciudad(String nombre, String ruta, int kmRuta) {
    }

    //Agregado por Germán 18/09/22
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }
    
}
