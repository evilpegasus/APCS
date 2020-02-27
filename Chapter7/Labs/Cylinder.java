package Chapter7.Labs;

public class Cylinder extends Shape {

    private double radius;
    private double height;
    public Cylinder(double r, double h) {
        super("Cylinder");
        this.radius = r;
        this.height = h;
    }

    public double area() {
        return Math.PI * radius * radius * height;
    }

    public String toString(){
       return super.toString() + " of radius, height " + radius + ", " + height;
    }
}