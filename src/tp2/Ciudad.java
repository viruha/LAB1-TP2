package tp2;

public class Ciudad {

    private String ruta;

    private int kmRuta;

    private String nombre;

    public Ciudad(String nombre, int kmRuta, String ruta) {
        this.ruta = ruta;
        this.kmRuta = kmRuta;
        this.nombre = nombre;
    }



    //Agregado por Germán 18/09/22
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    public String getRuta() {
        return ruta;
    }

    public int getKmRuta() {
        return kmRuta;
    }

    public void setKmRuta(int kmRuta) {
        this.kmRuta = kmRuta;
    }

    @Override
    public String toString() {
        return "--->"+nombre + "(Ruta:" + ruta + "- Km Ruta: "+kmRuta+")";
    }
    
    
    
    
}
