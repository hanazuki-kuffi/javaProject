//#9- tasks

import java.util.Scanner;

public class Methods2 {

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String ghosts = "призраки завтра";
            System.out.println("Здравствуйте, " + ghosts);

            getMaxValue();
            getMinValue();
            hamsterWeight();
            getExpenses(new int[] {1, 2, 3, 4, 5});
            getMycity();
        }

        public static void getMaxValue() {
            System.out.println("Что будем делать дальше? 1 - Читать код, 2 - Отдыхать.");
            Scanner scanner = new Scanner(System.in);
            int command = scanner.nextInt();
            if (command == 2) {
                return;
            } else {
                int[] examples = {665 + 229, 1827 + 3374, 3726 + 924, 150 + 17283, 233 + 384, 3344 + 22234};
                int maxResult = 0;
                for (int i = 0; i < examples.length; i++) {
                    if (examples[i] > maxResult) {
                        maxResult = examples[i];
                    }
                }
                System.out.println("Самая большая сумма чисел в массиве " + maxResult);
            }
        }

        public static void getMinValue() {

                double[] expenses = {100.50, 55.0, 10.6, 150.20, 10.0, 1.0, 15.4};
                double minExpense = expenses[0];
                for (int i = 1; i < expenses.length; i++) {
                    if (expenses[i] < minExpense) {
                        minExpense = expenses[i];
                    }
                }
                System.out.println("Самая маленькая трата за неделю " + minExpense);
            }

        public static void hamsterWeight() {

            Scanner scanner = new Scanner(System.in);
            System.out.println("Что будем делать дальше? 1 - Читать код, 2 - Отдыхать.");
            int command = scanner.nextInt();

            System.out.println("Сколько весит хомяк Байт?");
            int weight = scanner.nextInt();
            if (weight < 800) {
                for (int i = 1; i < 6; i = i + 1) {
                    System.out.println("Байт съел " + i + "-ю морковку");
                }
            } else {
                System.out.println("Разгрузочный день. Пьём водичку, крутим колесо!");
            }
        }


        public static void getExpenses(int[] expenses) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Что будем делать дальше? 1 - Читать код, 2 - Отдыхать.");
            int command = scanner.nextInt();

            double sum = 0;
            for (int i = 0; i < expenses.length; i++) {
                sum = sum + expenses[i];
            }
            System.out.println("Сумма трат за неделю составила " + sum);
        }


        public static void getMycity() {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Что будем делать дальше? 1 - Читать код, 2 - Отдыхать.");
            int command = scanner.nextInt();

            String myLoveCity = "мой любимый город!";
            System.out.println("До свидания," + myLoveCity);
    }
}
