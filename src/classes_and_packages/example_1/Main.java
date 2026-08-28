package classes_and_packages.example_1;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        car.brand = "Tesla";
        car.maxSpeed = 240;
        car.display();
//        System.out.println(car.maxSpeed); //null выходит


    }
}
