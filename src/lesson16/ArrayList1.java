package lesson16;

import java.util.ArrayList;

public class ArrayList1 {

    public static void main(String[] args) {

        ArrayList<String> femaleNames = new ArrayList<>();

        femaleNames.add("Нурсая");
        femaleNames.add("Мария");
        femaleNames.add("Анна");
        femaleNames.add(1,"Айгерим");

        System.out.println(femaleNames);


    }
}
