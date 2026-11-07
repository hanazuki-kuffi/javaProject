package lesson16;

import java.util.ArrayList;

public class ArrayList3 {

    public static void main(String[] args) {

        ArrayList<Double> expenses = new ArrayList<>();

        expenses.add(92.3);
        expenses.add(12.4);
        expenses.add(74.1);
        expenses.add(45.0);

        double maxExpense = expenses.get(0);
        for (int i = 0; i < expenses.size(); i++) {
            if(expenses.get(i) > maxExpense) {
                maxExpense = expenses.get(i);
            }

        }
        System.out.println("Самая высокая температура: " + maxExpense + " °С.");
    }
}
