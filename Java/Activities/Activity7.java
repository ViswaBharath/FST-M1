package activities;

interface BicycleParts{
    public int gears = 0;
    public int currentSpeed = 0;
}
interface BicycleOperations{
    public void applyBrake(int decrement);
    public void speedUp(int increment);
}

class Bicycle implements BicycleParts,BicycleOperations{

    public int gears,currentSpeed;

    public Bicycle(int gears, int currentSpeed){
        this.gears = gears;
        this.currentSpeed = currentSpeed;
    }
    @Override
    public void applyBrake(int decrement) {
        currentSpeed -= decrement;
        System.out.println("Speed after brake "+currentSpeed);
    }

    @Override
    public void speedUp(int increment) {
    currentSpeed +=increment;
        System.out.println("Speed after speeding up "+currentSpeed);
    }

    public String bicycleDesc(){
        return ("No of gears of cycle are "+gears+"\nThe speed is "+currentSpeed);
    }
}

class MountainBike extends Bicycle{
    public int seatHeight;
    public MountainBike(int gears, int currentSpeed, int seatHeight){
        super(gears,currentSpeed);
        this.seatHeight = seatHeight;
    }

    public void setHeight(int value){
        this.seatHeight = value;
    }

    @Override
    public String bicycleDesc(){
        return (super.bicycleDesc()+" \nSeat height is "+seatHeight);
    }
}
public class Activity7 {
    public static void main(String[] args) {
        MountainBike mb = new MountainBike(3,1,5);
        System.out.println(mb.bicycleDesc());
        mb.speedUp(30);
        mb.applyBrake(7);
    }
}
