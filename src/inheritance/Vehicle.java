package inheritance;

public class Vehicle {

    private int size;
    private int seats;
    private String color;
    private int speed;

    public Vehicle(int size, int seats, String color, int speed) {
        this.size = size;
        this.seats = seats;
        this.color = color;
        this.speed = speed;
    }

    public void increaseSpeed(int speedGain){
        speed += speedGain;
    }

    public void decreaseSpeed(int speedLoss) {
        speed -= speedLoss;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        this.seats = seats;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
