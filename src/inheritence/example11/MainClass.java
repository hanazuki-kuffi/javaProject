package inheritence.example11;

public class MainClass {

    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle("Rectangle ", 4, 5);
        Circle circle = new Circle("Circle ",  3);

        System.out.println("Прямоугольник: " + rectangle.area()); //20.0
        System.out.println("Круг: " + circle.area()); //28.259999999999998
    }
}
