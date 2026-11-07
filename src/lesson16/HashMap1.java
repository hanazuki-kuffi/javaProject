package lesson16;

import java.util.HashMap;

public class HashMap1 {
    public static void main(String[] args) {

        HashMap<String, String> identify = new HashMap<>();
        identify.put("Hanazuki", "Kuffy");
        System.out.println(identify);

        HashMap<String, Long> planetSize = new HashMap<>();
        planetSize.put("Venus", 1110L);
        planetSize.put("Earth", 1212L);
        planetSize.put("Mars", 1232L);
        planetSize.put("Neptun", 1233L);
        planetSize.put("Newton", 2200L);

        planetSize.put("Venus", 3400L);

        System.out.println(planetSize);
     }
}
