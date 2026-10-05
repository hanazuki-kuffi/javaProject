import java.util.Arrays;

public class Assignment {

    public static void main(String[] args) {

        // Ниже вызовите новый метод
//        String highestGrossingFilm = findHighestGrossingFilm();
//        System.out.println("Самый кассовый фильм: " + highestGrossingFilm);

//        System.out.println("Наибольшее из чисел 3 и 5 = " + findMax(-7, -1));
//        double[] expenses = {1772.5, 367.0, 120.6, 2150.2, 874.0, 1.0, 1459.4};
//        double maxExpense = findMaxExpense(expenses); // Вызовите метод и присвойте maxExpense значение его результата
//        System.out.println("Самая большая трата недели " + maxExpense);

        String catName = "Pixel";
        String hamsterName = "Byte";
        sayHello(catName);
        sayHello(hamsterName);
    }


    public static double findMaxExpense(double[] expenses) {
        double maxExpense = 0;
        for (int i = 0; i < expenses.length; i++) {
            if (maxExpense < expenses[i]) {
                maxExpense = expenses[i];
            }
        }return maxExpense;
    }

    public static void sayHello(String username) {
        System.out.println("Привет " + username);
    }
}
