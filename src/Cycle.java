import java.util.Random;
import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
//        example1();
//        example2();
//        example3();
//        example4();
//        example5();
//        example6();
//        example7();
//        example8();
//        example9();
//        example10();
        example11();

    }

    public static void example1() {
        int number = 1;
        while (number <= 5) {
            System.out.println("Currently value for one cycle: " + number);
            number++;
        }
    }

    public static void example2() {
        int number = 1;
        while (number < 5) {
            number++;
            System.out.println("Currently value for one cycle: " + number);
        }
    }

    public static void example3() {
        int number = 1;
        while (number <= 5) {
            System.out.println("Currently value for one cycle: " + number);
            number++;
        }
    }

    public static void example4() {
        int number = 1;
        while (number <= 5) {
            number++;
            System.out.println("Currently value for one cycle:  " + number);
        }
    }

    public static void example5() {
        int number = 1;
        while (number <= 5) {
            System.out.println("Currently value for one cycle: " + number);
            number++;
        }
        System.out.println("Currently value for one cycle: " + number);
    }

    public static void example6() {
        int number = 1;
        while (number <= 5) {
            number++;
            System.out.println("Currently value for one cycle: " + number);
        }

        System.out.println("Currently value for one cycle: " + number);
    }

    public static void example7() {
        int number = 1;
        do {

            System.out.println("Currently value for one cycle: " + number);
            number++;
        } while (number > 5);
    }

    public static void example8() {
        int number = 1;
        while (number < 10) {

            System.out.println("Hello! I am writing some times");
            number++;
        }
    }

    public static void example9() {

        Random random = new Random();
        int dayCount = 0;
        int moneyTotal = 0;
        int moneyToday;
        int goal = 25000;

        while (moneyTotal <= goal) {
            moneyToday = random.nextInt(1500);
            moneyTotal += moneyToday;
            dayCount++;

            System.out.println("Сумма ежедневных пополнений " + moneyToday);
            System.out.println("Текущее сумма накоплений " + moneyTotal);

        }
        System.out.println("Ура! Вы смогли накопить" + goal + " за " + dayCount + " дней.");
    }

    public static void example10() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Oцените работу приложения Зеленоглазое-Такси по шкале от 1 до 3 ");

        boolean flag = true;

        while (flag) {

            int x = scanner.nextInt();

            if (x == 1) {
                System.out.println("Спасибо за вашу оценку. Мы станем лучше!");
                flag = false;
            }

            if (x == 2) {
                System.out.println("Спасибо за вашу оценку. Есть куда расти!");
                flag = false;
            }

            if (x == 3) {
                System.out.println("Спасибо за вашу высокую оценку! Рады что вы выбрали нас!");
                flag = false;
            }

            System.out.println("Ваша оценка должна быть в диапазоне от 1 до 3");
        }
    }

    public static void example11() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Oцените работу приложения Зеленоглазое-Такси по шкале от 1 до 3 ");

        int x = 0;

        while ((x != 1) && (x != 2) && (x != 3)) {

            x = scanner.nextInt();

            if (x == 1) {
                System.out.println("Спасибо за вашу оценку. Мы станем лучше!");
            }

            if (x == 2) {
                System.out.println("Спасибо за вашу оценку. Есть куда расти!");
            }

            if (x == 3) {
                System.out.println("Спасибо за вашу высокую оценку! Рады что вы выбрали нас!");
            }

            System.out.println("Ваша оценка должна быть в диапазоне от 1 до 3");
        }
    }
}
