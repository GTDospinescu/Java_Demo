package OOP;


public class Wall {
    private double height;
    private double width;

    public Wall() {

    }

    public Wall (double width, double height) {
        this.width = width < 0 ? 0 : width;
        this.height = height < 0 ? 0 : height;
//        this.width = width;
//        this.height = height;
//        if (width < 0) {
//            this.width = 0;
//        }
//        if (height < 0) {
//            this.height = 0;
//        }
    }

    public double getWidth(){
        return width;
    }

    public double getHeight(){
        return height;
    }

    public void setHeight(double height) {
        this.height = height < 0 ? 0 : height;
    }

    public void setWidth(double width) {
        this.width = width < 0 ? 0 : width;
    }

    public double getArea(){
        return height * width;
    }
}
