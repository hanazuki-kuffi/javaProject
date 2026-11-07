package lesson16;

import java.util.ArrayList;

public class Arr {

    public static void main() {


        //generics
        ArrayList<Double> expenses = new ArrayList<>();
        ArrayList<Short> simpleNumbers = new ArrayList<>();


//        System.out.println("size " + expenses.size());
//        expenses.add(33.0);
//        System.out.println("size " + expenses.size());

//        expenses.add(44.0);
//        System.out.println("size " + expenses.size());

//        expenses.add(55.0);
//        System.out.println("size " + expenses.size());

//        System.out.println(expenses);
//        System.out.println(expenses.get(3));


//        ArrayList<String> names = new ArrayList<>();
//
//        names.add("Gul");
//        names.add("Nur");
//        names.add("Ali");
//        System.out.println("List names: ");

//        for (int i = 0; i < names.size(); i++)
//            System.out.println("Name - " + i + ": " + names.get(i));

        //matrix Можно даже создать список для хранения списков:
//        ArrayList<ArrayList<Double>> matrix = new ArrayList<>();

//        double[] expense = new double[10];
//
//        expense[0] = 33.0;
//        expense[1] = 34.00;
//        expense[2] = 55.0;
//        System.out.println(expense.length);

        ArrayList<Integer> numbers = new ArrayList<>();

        numbers.add(1);
        numbers.add(2);
        numbers.add(3);
        numbers.add(4);

//        for(Integer num : numbers) {
//            System.out.println(num);
//        }


//        numbers.remove(0); // но это не индекс а сам значение
//        System.out.println(numbers);

//        numbers.clear();
//        System.out.println(numbers.size());

        if (numbers.isEmpty()) {
            System.out.println("нету ничего");
        }
        else {
            System.out.println("size - " + numbers.size());
        }


    }
}
