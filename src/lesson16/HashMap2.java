package lesson16;

import java.util.HashMap;

public class HashMap2 {

    public static void main(String[] args) {

        HashMap<String, String> statesCapitals = new HashMap<>();

        statesCapitals.put("Канада", "Торонто");
        statesCapitals.put("Казахстан", "Астана");
        statesCapitals.put("Австрия", "Вена");
        statesCapitals.put("Канада", "Оттава");

        System.out.println(statesCapitals);
    }
}
