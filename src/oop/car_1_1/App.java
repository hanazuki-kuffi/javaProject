package oop.car_1_1;

public class App {

    public static void main(String[] args) {

        Car car = new Car("BWD", "China", 2021, "Blue");


//        car.setMake("Japan");

        System.out.println(car.getMake());
        System.out.println(car.getModel());
        System.out.println(car.getColor());
        System.out.println(car.getYear());

      car.setMake("Japan");  //если по сути я пишу после этого то изначальный вызов метода get не будут меняться то есть set метод пишем вверх пока что



    }
}
