package Vehicle;

/*===========================================================================
Java Assignment - 6
 
Constructing an Object Orient Programing with the Object "Vehicle"

-Define sub classes of Vehicle: Bike, Car, Truck

-Extending sub classes to Vehicle
-Extending define Varible of Vehicle: 
     Vehicle Vehicle_ID, Name, Price
===========================================================================
*/

public class Vehicle {

    int Vehicle_ID;
    String Name;
    float Price;

    public Vehicle (int Vehicle_ID, String Name, float Price) {

     this.Vehicle_ID = Vehicle_ID;
     this.Name = Name;
     this.Price = Price;

    }

    
    //Main class
    public static void main(String[] args) {
         
     Car cr = new Car();
     Truck tk = new Truck();
     Bike be = new Bike();

     cr.showCar();
     tk.showTruck();
     be.showBike();
    }
}

