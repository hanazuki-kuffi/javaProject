package lesson16;

import java.util.ArrayList;
import java.util.HashMap;

public class JpnDishMenu {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Double>>  menu = new HashMap<>();

        ArrayList<Double> ramen = new ArrayList<>();
        ramen.add(1500.0);
        ramen.add(3.56);
        ramen.add(500.89);
        menu.put("Ramen",  ramen);

        ArrayList<Double> soju = new ArrayList<>();
        ramen.add(2500.0);
        ramen.add(6.66);
        ramen.add(700.0);
        menu.put("Soju",  soju);


        ArrayList<Double> mothi = new ArrayList<>();
        ramen.add(1000.6);
        ramen.add(2.56);
        ramen.add(400.56);
        menu.put("Mothi",  mothi);

        System.out.println(menu);


    }
}
