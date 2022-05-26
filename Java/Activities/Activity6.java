package activities;

import java.util.Date;
import java.util.*;

class Plane{
    private List<String> passengers;
    private int maxPassengers;
    private Date lastTimeTookOf;
    private Date lastTimeLanded;

    public Plane(int maxPassengers){
        this.maxPassengers = maxPassengers;
        this.passengers = new ArrayList<>();
    }

    public void onBoard(String passenger){
        this.passengers.add(passenger);
    }

    public Date takeOff(){
        this.lastTimeTookOf = new Date();
        return lastTimeTookOf;
    }

    public void land(){
        this.lastTimeLanded = new Date();
        this.passengers.clear();
    }
    public Date getLastTimeLanded(){
        return  lastTimeLanded;
    }
    public List<String> getPassesngers(){
        return passengers;
    }
}
public class Activity6 {
    public static void main(String[] args) throws InterruptedException {
        Plane plane = new Plane(10);

        plane.onBoard("Akshay");
        plane.onBoard("Ram");
        plane.onBoard("Sham");
        plane.onBoard("Tom");
        plane.onBoard("John");
        System.out.println("Take off time is " +plane.takeOff());
        System.out.println("Passenger list is "+plane.getPassesngers());
        Thread.sleep(5000);
        plane.land();
        System.out.println("Landing time is "+plane.getLastTimeLanded());
    }
}
