package OOP;

public class Point {

    private int x;
    private int y;

    Point() {

    }

    Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX () {
        return x;
    }

    public int getY() {
        return y;
    }

    public void setX(int x) {
        this.x = x;
    }

    public void setY(int y) {
        this.y = y;
    }

    public double distance () {
        return distance(0,0);
    }

    public double distance (int x, int y) {
        double distanceSquared = (x - this.x) * (x - this.x) + (y - this.y) * (y - this.y);
        return Math.sqrt(distanceSquared);
    }

    public double distance (Point p) {
        return distance(p.getX(), p.getY());
    }
}
