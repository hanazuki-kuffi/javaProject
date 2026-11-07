package lesson16;

import java.util.ArrayList;

public class ArrayList2 {

    public static void main(String[] args) {

        ArrayList<Double> numbers = new ArrayList<>();

        numbers.add(450.9);
        numbers.add(500.12);
        numbers.add(343.09);
        numbers.add(450.8);
        numbers.add(350.89);
        numbers.add(250.12);

        boolean isNum = numbers.contains(350.88);

        if (isNum == false) {
            numbers.add(1, 350.88);
            System.out.println("Number " + numbers.get(1) + " added" );
            System.out.println(numbers);
        }
        else {
            System.out.println("Все расходы учтены!");

        }
    }
}
