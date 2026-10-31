package extend.example1;

public class Bike extends Vehicle {

    public Bike(String name) {
        super(name, 2);

    }

    public void start() {
        System.out.println(name);
    }

}
