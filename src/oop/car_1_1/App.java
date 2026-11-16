package oop.car_1_1;

public class App {

    public static void main(String[] args) {

        Car car = new Car("BWD", "China", 2021, "Blue");

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());


    }
}
