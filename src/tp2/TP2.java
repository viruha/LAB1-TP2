package tp2;


public class TP2 {

 
    public static void main(String[] args) {
    
    Combustible nafta=new Combustible("Nafta",145.3);
    Combustible diesel=new Combustible("Diesel",152.7);
    Combustible gas=new Combustible("Gas",90.5);
    
        
    Vehiculo au=new Auto("chevrolet","ABC-254",nafta);
      System.out.println("Costo de Combustible del auto por km es: $"+au.calcularCostoDeCombustible(1));
    
    Vehiculo camioneta=new Camioneta("Jeep", "BCI-870", diesel);
        System.out.println("Costo de Combustible de la camioneta por km es: $"+camioneta.calcularCostoDeCombustible(1));
    
    Vehiculo camionGrande=new Camion("Kia", "JPG-12", gas);
        System.out.println("Costo de Combustible del Camion por km es: $"+camionGrande.calcularCostoDeCombustible(1));
        
    
    
    
    }
    
}
