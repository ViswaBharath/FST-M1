package activities;

public class Activity3 {
    public static void main(String[] args) {

        double seconds = 1000000000;
        double EarthSeconds = 31557600;
        double MercurySeconds = 0.2408467;
        double VenusSeconds = 0.61519726;
        double MarsSeconds = 1.8808158;
        double JupiterSeconds = 11.862615;
        double SaturnSeconds = 29.447498;
        double UranusSeconds = 84.016846;
        double NeptuneSeconds = 164.79132;

        double EarthAge = (seconds/EarthSeconds);

        System.out.println("Age on Earth = " +EarthAge);
        System.out.println("Age on Mercury = " +EarthAge/MercurySeconds);
        System.out.println("Age on Venus = " +EarthAge/VenusSeconds);
        System.out.println("Age on Mars = " +EarthAge/MarsSeconds);
        System.out.println("Age on Jupiter = " +EarthAge/JupiterSeconds);
        System.out.println("Age on Saturn = " +EarthAge/SaturnSeconds);
        System.out.println("Age on Uranus = " +EarthAge/UranusSeconds);
        System.out.println("Age on Neptune = " +EarthAge/NeptuneSeconds);
    }
}
