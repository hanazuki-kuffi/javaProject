package inheritence.example6;

public class Main {

    public static void main(String[] args) {

        Bike bike = new Bike("Strike", 34);
        System.out.println(bike.size);
        bike.start();
        bike.stop();
    }
}
