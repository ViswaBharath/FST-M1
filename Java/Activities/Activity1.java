package activities;

public class Activity1 {

    public static void main(String args[]){

        Car maruti = new Car();
        maruti.make = 2021;
        maruti.transmission = "Automatic";
        maruti.color = "Blue";

        maruti.displayCharacteristics();
        maruti.accelerate();
        maruti.brake();
    }
}
