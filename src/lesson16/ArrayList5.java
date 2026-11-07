package lesson16;

import java.util.ArrayList;

public class ArrayList5 {
    public static void main(String[] args) {

        ArrayList<String> animals = new ArrayList<>();

        animals.add("Крокодил");
        animals.add("Слон");
        animals.add("Шиншилла");
        animals.add("Лев");
        animals.add("Медведь");

        System.out.println("Сегодня в зоопарке можно увидеть кормления " + animals.size() + "животных:");
        System.out.println("Это будут: ");
        System.out.println(animals.get(2));
        System.out.println(animals.get(0));
        System.out.println(animals.get(3));
        System.out.println(animals.get(4));
        System.out.println(animals.get(1));

        System.out.println("Расписание кормлений: ");

        int time = 9;
        for (String animal : animals) {

            System.out.println("В " + time + ":00" + " - " + animal);
            time++;
        }
    }
}
