package inheritence.example8;

public class MainClass {

    public static void main(String[] args) {

        Car car = new Car();
        car.go();


        System.out.println(car.speed);
        System.out.println(car.wheels);
        System.out.println(car.door);

        Bicycle bicycle = new Bicycle();
        bicycle.stop();

        System.out.println(bicycle.speed);
        System.out.println(bicycle.wheels);
        System.out.println(bicycle.pedals);
    }
}
