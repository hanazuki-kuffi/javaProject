package lesson16;

import java.net.Inet4Address;
import java.util.ArrayList;
import java.util.HashMap;

public class HashMap3 {

    public static void main(String[] args) {

        HashMap<String, ArrayList<Integer>> stateHolidays = new HashMap<>();

        ArrayList<Integer> data1 = new ArrayList<>();
        data1.add(8);
        data1.add(22);
        data1.add(15);

        ArrayList<Integer> data2 = new ArrayList<>();
        data2.add(16);
        data2.add(31);

        ArrayList<Integer> data3 = new ArrayList<>();
        data3.add(1);
        data3.add(7);
        data3.add(9);
        data3.add(27);

        ArrayList<Integer> data4 = new ArrayList<>();
        data4.add(6);


        stateHolidays.put("Marсh", data1);
        stateHolidays.put("December", data2);
        stateHolidays.put("May", data3);
        stateHolidays.put("Jule", data4);

        System.out.println(stateHolidays);
    }
}
