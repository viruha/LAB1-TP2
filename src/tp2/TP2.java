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

        //Agregado de scan
        Scanner sc = new Scanner(System.in).useDelimiter("\n");
       
        System.out.println("");
        System.out.println("<<<   MENU   >>>");
        System.out.println("");

        //Ciudades           
        System.out.println("Ingrese nombre de ciudad origen: ");
        Ciudad ciudadOrigen = new Ciudad(sc.nextLine(), 0, "");
        System.out.println("Ingrese nombre de ruta: ");
        ciudadOrigen.setRuta(sc.nextLine());
        System.out.println("Ingrese km de ruta: ");
        ciudadOrigen.setKmRuta(sc.nextInt());
        sc.nextLine();

        System.out.println("Ingrese nombre de ciudad destino: ");
        Ciudad ciudadDestino = new Ciudad(sc.nextLine(), 0, "");
        System.out.println("Ingrese nombre de ruta: ");
        ciudadDestino.setRuta(sc.nextLine());
        System.out.println("Ingrese km de ruta: ");
        ciudadDestino.setKmRuta(sc.nextInt());
        sc.nextLine();
        
        Viaje viajeProgramado1 = new Viaje(ciudadOrigen, ciudadDestino, 0, null);
        //Verificar si las ciudades estan sobre la misma ruta, o en rutas distintas
                if(!(ciudadDestino.getRuta().equals(ciudadOrigen.getRuta()))){
                    System.out.println("No es la misma ruta, ingres km a recorrer : ");
                    viajeProgramado1.setDistancia(sc.nextInt());
                    sc.nextLine();
                }
            else{
            viajeProgramado1.calculoDistancia();
                    }
        //Cantidad de peajes    
        System.out.println("Ingrese cantidad de peajes: ");
        viajeProgramado1.setPeajes(sc.nextInt());
        sc.nextLine();
        //Elección de vehículo
        System.out.println("Ingrese vehiculo con el que va a realizar el viaje");
        System.out.println("1: auto. 2: camioneta. 3:camión: ");
        int auxCase = sc.nextInt();
        switch (auxCase) {
            case 1: {
                viajeProgramado1.setVehiculo(au);
                break;
            }
            case 2: {
                viajeProgramado1.setVehiculo(camioneta);
                break;
            }
            case 3: {
                viajeProgramado1.setVehiculo(camionGrande);
                break;
            }
        }
        System.out.println("Viaje");
        System.out.println(viajeProgramado1.toString());
        System.out.println("Vehiculo");
        System.out.println(viajeProgramado1.getVehiculo().getTipoVehiculo() +  viajeProgramado1.getVehiculo().toString());
        System.out.println("Origen");
        System.out.println(viajeProgramado1.getOrigen().toString());
        System.out.println("Destino");
        System.out.println(viajeProgramado1.getDestino().toString());
        System.out.println(viajeProgramado1.calculoCostoPeajes());
        System.out.println(viajeProgramado1.calculoCostoCombustible());
        System.out.println(viajeProgramado1.calculoCostoTotal());
        
    }
}
