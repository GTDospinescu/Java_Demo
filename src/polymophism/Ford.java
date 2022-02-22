package polymophism;

public class Ford extends Car {
    public Ford(int cylinders, String name) {
        super(cylinders, name);
    }

    @Override
    public String startEngine() {
        super.startEngine();
        return "Ford is starting engine";
    }

    @Override
    public String accelerate() {
        super.accelerate();
        return "Ford is accelerating";
    }

    @Override
    public String brake() {
        super.brake();
        return "Ford is braking";
    }
}
