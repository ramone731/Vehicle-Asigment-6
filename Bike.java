package Vehicle;

class Bike extends Vehicle {

    public Bike(){

        super(6, "Name", 931.12f);

    }

    //Showbike
    public void showBike()
    {
        System.out.println("Bike inherist from Vehicle");

        System.out.println("ID: " + Vehicle_ID);
        System.out.println("Name: " + Name);
        System.out.println("Price: $" + Price);
        System.out.println("===========================");
        
    }

}
