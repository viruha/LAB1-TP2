package tp2;


public class TP2 {

 
    public static void main(String[] args) {
    //Creacion de los objetos  combustible en el  
    Combustible nafta=new Combustible("Nafta",145.3);
    Combustible diesel=new Combustible("Diesel",152.7);
    Combustible gas=new Combustible("Gas",90.5);
    
    //Creacion de los objetos Vehiculos    
    Vehiculo auto=new Auto("chevrolet","ABC-254",nafta);
      System.out.println("Costo de Combustible del auto por km es: $"+auto.calcularCostoDeCombustible(21));
    
    Vehiculo camioneta=new Camioneta("Jeep", "BCI-870", diesel);
        System.out.println("Costo de Combustible de la camioneta por km es: $"+camioneta.calcularCostoDeCombustible(1));
    
    Vehiculo camionGrande=new Camion("Kia", "JPG-12", gas);
        System.out.println("Costo de Combustible del Camion por km es: $"+camionGrande.calcularCostoDeCombustible(1));
        System.out.println("");   
     camioneta.setPatente("CAB");
        System.out.println(camioneta.toString());
        System.out.println("");
    
     //Creacion de Las ciudades 
    Ciudad SL=new Ciudad("San Luis","Ruta 7",800);
    Ciudad VM=new Ciudad("Villa Mercedes","Ruta 7",696);
    Ciudad Cord=new Ciudad("Ciudad Cordoba","Ruta 20",10);
    Ciudad SJ=new Ciudad("San Juan","Ruta 20",580);
    
    //testeo de Distancia Creando Viajes
    Viaje V1=new Viaje(SL, VM, 2, auto);
        System.out.println("El recorrido del viaje v1 sera: "+V1.calculoDistancia()+" km");
        System.out.println("Costo total de Peajes V1: "+V1.calculoCostoPeajes());
        
    Viaje V2=new Viaje(SL, Cord, 2, 400, camionGrande);
        System.out.println("El recorrido del viaje v2 sera: "+V2.calculoDistancia()+" km");
        System.out.println("Costo total de Peajes V2: "+V2.calculoCostoPeajes());
        
    Viaje V3=new Viaje(Cord, SJ, 3, camioneta);
        System.out.println("El recorrido del viaje v3 sera: "+V3.calculoDistancia()+ " km");
        System.out.println("Costo total de Peajes V3: "+V3.calculoCostoPeajes());
    
    }
    
}
