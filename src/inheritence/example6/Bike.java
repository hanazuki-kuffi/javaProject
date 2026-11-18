package inheritence.example6;

public class Bike extends Vehicle {
    int size;
    public Bike(String name, int size) {
        super(name, 2);
        this.size = size;

    }
}
