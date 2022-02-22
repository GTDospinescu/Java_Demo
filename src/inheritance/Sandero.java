package inheritance;

public class Sandero extends Car {

    private boolean airbag;
    private int cylinder;
    private int motorCapacity;




    public Sandero(int size, int seats, String color, int speed, int wheels, boolean automatic, boolean registered, int gear, boolean airbag, int cylinder, int motorCapacity) {
        super(size, seats, color, speed, wheels, automatic, registered, gear);
        this.airbag = airbag;
        this.cylinder = cylinder;
        this.motorCapacity = motorCapacity;
    }

    public boolean isAirbag() {
        return airbag;
    }

    public void setAirbag(boolean airbag) {
        this.airbag = airbag;
    }

    public int getCylinder() {
        return cylinder;
    }

    public void setCylinder(int cylinder) {
        this.cylinder = cylinder;
    }

    public int getMotorCapacity() {
        return motorCapacity;
    }

    public void setMotorCapacity(int motorCapacity) {
        this.motorCapacity = motorCapacity;
    }
}
