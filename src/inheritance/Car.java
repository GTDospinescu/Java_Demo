package inheritance;

public class Car extends Vehicle{

    private int wheels;
    private boolean automatic;
    private boolean registered;
    private int gear;


    public Car(int size, int seats, String color, int speed, int wheels, boolean automatic, boolean registered, int gear) {
        super(size, seats, color, speed);
        this.wheels = wheels;
        this.automatic = automatic;
        this.registered = registered;
        this.gear = gear;
    }

    public void increaseGear(int number) {
        gear += number;
    }

    public void decreaseGear(int number) {
        gear -= number;
    }

    public int getWheels() {
        return wheels;
    }

    public void setWheels(int wheels) {
        this.wheels = wheels;
    }

    public boolean isAutomatic() {
        return automatic;
    }

    public void setAutomatic(boolean automatic) {
        this.automatic = automatic;
    }

    public boolean isRegistered() {
        return registered;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }

    public int getGear() {
        return gear;
    }

    public void setGear(int gear) {
        this.gear = gear;
    }
}
