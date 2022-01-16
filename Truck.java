package Vehicle;

public class Truck extends Vehicle {

    public Truck(){
        
        super (4, "TruckName", 82183.57f);
    }

    public void showTruck(){

        System.out.println("Truck inherit from Vehicle ");

        System.out.println("ID: " + Vehicle_ID);
        System.out.println("Name: " + Name); 
        System.out.println("Price: $" + Price);
        System.out.println("===============================");
    }
    
}
