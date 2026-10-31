package extend.example1;

public class Vehicle {

    String name;
    int amountOfWheels;

    public Vehicle(String name, int amountOfWheels) {
        this.name = name;
        this.amountOfWheels = amountOfWheels;
    }

    public void start() {
        System.out.println("Vehicle has started");
    }
    public void stop() {
        System.out.println("Vehicle has stopped");
    }
}
