package Vehicle;

public class Car extends Vehicle {

    public Car(){
        super(2, "CarName", 52839.98f);

    }

    public void showCar() {

        System.out.println("Car inherit from Vehicle: ");

        System.out.println("ID:  " + Vehicle_ID);
        System.out.println("NameL " + Name);
        System.out.println("Price: $" + Price);
        System.out.println("===============================");


    }
}