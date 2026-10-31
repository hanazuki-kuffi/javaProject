package extend.example1;

public class Main {
    static void main(String[] args) {
        Bike bike = new Bike("GESHTALT");
//        System.out.println(bike.amountOfWheels);
        bike.start();

        Vehicle vehicle = new Vehicle("bmw", 4);
//        System.out.println(vehicle.amountOfWheels);
    }
}
