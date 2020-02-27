package Chapter7.Labs;

public abstract class Shape {

    private String shapeName;
    public Shape(String name) {
        shapeName = name;
    }

    public abstract double area();
    public String toString() {
        return shapeName;
    }
}