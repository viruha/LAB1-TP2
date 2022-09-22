package tp2;

import java.util.Scanner;

public class TP2 {
//Agregado de scan
    public static Scanner sc = new Scanner(System.in).useDelimiter("\n");
    public static void main(String[] args) {

        System.out.println("");
        System.out.println("<<<   MENU   >>>");
        System.out.println("");

        //Ciudades         
        System.out.println("Ingrese Datos de Ciudad Origen");
        Ciudad ciudadOrigen=completadoCiudad();
        
        System.out.println("");
        
        System.out.println("Iingrese Datos de Ciudad Destino");
        Ciudad ciudadDestino=completadoCiudad();
        
        Viaje viajeProgramado1 = verificarMismaRuta(ciudadOrigen, ciudadDestino);
        
        //Cantidad de peajes    
        System.out.println("Ingrese cantidad de peajes: ");
        viajeProgramado1.setPeajes(sc.nextInt());
        
        //Elección de vehículo
        seleccionVehiculo(viajeProgramado1);
       
        System.out.println(viajeProgramado1.toString());//Datos del viaje
        
        System.out.println(viajeProgramado1.getVehiculo().getTipoVehiculo() +  viajeProgramado1.getVehiculo().toString());//Datos del vehiculo que se usara
        //Datos de la ciudades Origen y Destino del viaje
        System.out.print("Ciudad Origen: ");
        System.out.println(viajeProgramado1.getOrigen().toString());
        
        System.out.print("Ciudad Destino: ");
        System.out.println(viajeProgramado1.getDestino().toString());
        
        System.out.println("El total del Costo Peaje del Viaje es: "+viajeProgramado1.calculoCostoPeajes()+"$");//Calculo Total De los Costo Viajes
         
        System.out.println("El total del Costo del combustible es: "+viajeProgramado1.calculoCostoCombustible()+"$");// Calculo total del costo del combustible Por Viaje
        
        System.out.println("El costo total del Viaje es: "+viajeProgramado1.calculoCostoTotal());
        
    }
    
 //funcion crear vehiculo   
public static void seleccionVehiculo(Viaje viaje){
    
    
    System.out.println("Ingrese Tipo Vehiculo con el que va a realizar el viaje");
    System.out.println("1: auto. 2: camioneta. 3:camión: ");
    int auxCase = sc.nextInt();
    
    System.out.print("Ingrese Marca del Vehiculo: ");
    String marca=sc.next();
    
    System.out.print("Ingrese Patente: ");
    String patente=sc.next();
    
    Combustible nuevo=eleccionTipoCombustible();
    
    do{
        switch (auxCase){
            case 1: 
               Vehiculo auto=new Auto(marca,patente,nuevo);
               viaje.setVehiculo(auto);
                break;
            
            case 2: 
                Vehiculo camioneta=new Camioneta(marca, patente, nuevo);
                viaje.setVehiculo(camioneta);
                break;
            
            case 3:
               Vehiculo camion=new Camion(marca, patente, nuevo);
               viaje.setVehiculo(camion);
                break;
            default:
                System.out.println("Elija la opcion Correcta");
         }
        }while(auxCase<1||auxCase>3);
        
    }
    
    //funcion crear combustible
    public static Combustible eleccionTipoCombustible(){
        Combustible nafta = new Combustible("Nafta", 145.3);
        Combustible diesel = new Combustible("Diesel", 152.7);
        Combustible gas = new Combustible("Gas", 90.5);
        int comb;
        Combustible elegido = null;
        do{
            System.out.println("Ingrese el Tipo de Combustible");
            System.out.println("1-Nafta");
            System.out.println("2-Diesel");
            System.out.println("3-Gas");
            comb=sc.nextInt();
            switch(comb){
             case 1:
               elegido=nafta;
               break; 
             case 2:
                elegido=diesel;
                break;
             case 3:
                elegido=gas;
                break;
               
             default:
             System.out.println("Elija una opcion Correcta");
            }
        }while(comb<1||comb>3);
         
        return elegido;
         }
    
    //funcion para crear objetos tipo Ciudad
    public static Ciudad completadoCiudad(){
        System.out.print("Nombre: ");
    Ciudad ciudad = new Ciudad(sc.next(), 0, "");
        System.out.print("Ingrese nombre de ruta: ");
        ciudad.setRuta(sc.next());
        System.out.print("Ingrese km de ruta: ");
        ciudad.setKmRuta(sc.nextInt());
    return ciudad;
}

//funcion que verifica si el viaje esta o no sobre la misma ruta de ambas ciudades
public static Viaje verificarMismaRuta(Ciudad c1,Ciudad c2){
    Viaje v=new Viaje(c1, c2, 0, null);
    if(!(c1.getRuta().equals(c2.getRuta()))){
        System.out.println("No estan sobre la misma ruta");
        System.out.println("Ingrese la distancia que separa a las ciudades");
        v.setDistancia(sc.nextInt());
        }
    else{
     v.calculoDistancia();
    }
   return v;}  
}