package inheritence.example11;

public class Circle extends Shape{

    double radius;

    public Circle(String name, double radius) {
        super(name);
        this.radius = radius;
    }

    @Override
    public double area() {
        return 3.14 * radius * radius;
    }
}
