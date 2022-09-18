package tp2;

import java.util.Scanner;

public class TP2 {

    public static void main(String[] args) {
        
        Combustible nafta = new Combustible("Nafta", 145.3);
        Combustible diesel = new Combustible("Diesel", 152.7);
        Combustible gas = new Combustible("Gas", 90.5);

        Vehiculo au = new Auto("chevrolet", "ABC-254", nafta);
        System.out.println("Costo de Combustible del auto por km es: $" + au.calcularCostoDeCombustible(1));

        Vehiculo camioneta = new Camioneta("Jeep", "BCI-870", diesel);
        System.out.println("Costo de Combustible de la camioneta por km es: $" + camioneta.calcularCostoDeCombustible(1));

        Vehiculo camionGrande = new Camion("Kia", "JPG-12", gas);
        System.out.println("Costo de Combustible del Camion por km es: $" + camionGrande.calcularCostoDeCombustible(1));

        //comienzo del menú agregado por Germán 180922
        //Agregado de scan
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
        
             
        //Verificar si las ciudades estan sobre la misma ruta, o en rutas distintas
        System.out.println("");
        System.out.println("<<<   MENU   >>>");
        System.out.println("");
        int auxLocal=0;
        do {            
            System.out.println("Ingrese 1 si los destinos estan sobre la misma ruta, y 2 si no estan sobre la misma ruta");
            auxLocal=sc.nextInt();
        } while (auxLocal!=1 && auxLocal!=2);
        
        //Ingreso de información para el viaje
        
        //A) Para el caso si estan sobre la misma ruta

        if (auxLocal==1) {
            
            Viaje viajeProgramado1 = new Viaje(null, null, 0, null);
            
            //Ciudades           
            System.out.println("Ingrese nombre de ciudad origen, y km de ruta: ");
            Ciudad ciudadOrigen = new Ciudad (sc.next(),"",sc.nextInt());
            
            System.out.println("Ingrese nombre de ciudad destino, y km de ruta: ");
            Ciudad ciudadDestino = new Ciudad (sc.next(),"",sc.nextInt());
            
            System.out.println("Ingrese numero de ruta: ");
            ciudadOrigen.setRuta(sc.next());
            ciudadDestino.setRuta(ciudadOrigen.getRuta());
        
            viajeProgramado1.setOrigen(ciudadOrigen);
            viajeProgramado1.setDestino(ciudadDestino);
            
            //Cantidad de peajes    
            System.out.println("Ingrese cantidad de peajes: ");
            viajeProgramado1.setPeajes(sc.nextInt());
    
            //Elección de vehículo
            System.out.println("Ingrese vehiculo con el que va a realizar el viaje");
            System.out.println("1: auto. 2: camioneta. 3:camión: ");
            int auxCase=sc.nextInt();
                switch(auxCase){
                    case 1: {
                        viajeProgramado1.setVehiculo(au);                    
                        break;
                    }
                    case 2:{
                        viajeProgramado1.setVehiculo(camioneta);
                        break;
                    }
                    case 3:{
                        viajeProgramado1.setVehiculo(camionGrande);
                        break;
                    }
                }
            } 
        
        //B) Para el caso que no esten sobre la misma ruta
        else {
            
            Viaje viajeProgramado2 = new Viaje(null, null, 0, 0, null);
            
            //Ciudades 
            System.out.println("Ingrese nombre de ciudad origen: ");
            Ciudad ciudadOrigen = new Ciudad (sc.next(),"",0);
            
            System.out.println("Ingrese nombre de ciudad destino: ");
            Ciudad ciudadDestino = new Ciudad (sc.next(),"",0);   
            
            System.out.println("Ingrese numero de ruta: ");
            ciudadOrigen.setRuta(sc.next());
            ciudadDestino.setRuta(ciudadOrigen.getRuta());
            
            viajeProgramado2.setOrigen(ciudadOrigen);
            viajeProgramado2.setDestino(ciudadDestino);
            
            //Cantidad de peajes    
            System.out.println("Ingrese cantidad de peajes: ");
            viajeProgramado2.setPeajes(sc.nextInt());            
            
            //Distancia a recorrer
            System.out.println("Ingrese distancia a recorrer: ");
            viajeProgramado2.setDistancia(sc.nextInt());
            
            //Elección de vehículo
            System.out.println("Ingrese vehiculo con el que va a realizar el viaje");
            System.out.println("1: auto. 2: camioneta. 3:camión: ");
            int auxCase=sc.nextInt();
                switch(auxCase){
                    case 1: {
                        viajeProgramado2.setVehiculo(au);                    
                        break;
                    }
                    case 2:{
                        viajeProgramado2.setVehiculo(camioneta);
                        break;
                    }
                    case 3:{
                        viajeProgramado2.setVehiculo(camionGrande);
                        break;
                    }
                }
            }
        //Continuar con uso de metodos para calcular costos. Falta definir en 
        //la clase Viaje
    }        
}
