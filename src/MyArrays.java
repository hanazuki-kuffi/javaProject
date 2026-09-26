import java.util.Arrays;
import java.util.Scanner;

public class MyArrays {
    public static void main(String[] args) {
//        arrays1();
//        arrays2();
//        arrays3();
//        arrays4();
//        arrays5();
//        arrays6();
//        arrays7();
//        arrays8();
        arrays9();
    }


        public static void arrays1() {
            String[] currencies = {"USD", "EUR", "JPY", "KZT"};
//        System.out.println(currencies);


            System.out.println(Arrays.toString(currencies));
        }


        public static void arrays2() {

        String[] currencies = new String[4];
            System.out.println(Arrays.toString(currencies));
        }

        public static void arrays3() {

        int[] numbers = {1, 2, 3, 4, 5};
            System.out.println(Arrays.toString(numbers));
        }

        public static void arrays4() {
        int[] numbers = new int[5];
            System.out.println(Arrays.toString(numbers));
        }

        public static void arrays5() {

            double mondayExpense = 1500.50;
            double tuesdayExpense = 2500.50;
            double wednesdayExpense = 500.00;
            double thursdayExpense = 0.0;
            double fridayExpense = 750.60;
            double saturdayExpense = 2500.10;
            double sundayExpense = 1000.00;

            double[] expenses = {mondayExpense, tuesdayExpense, wednesdayExpense, thursdayExpense, fridayExpense, saturdayExpense, sundayExpense};

            System.out.println(Arrays.toString(expenses));

        }

        public static void arrays6() {
        double[] expenses = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};
        expenses[2] += 450;// Добавьте 450 тенге к расходам за среду

        System.out.println("Новое значение расходов за среду: " + expenses[2] + " тенге.");
        double summ = expenses[1] + expenses[4] + expenses[5];// Суммируйте три самые крупные траты

        System.out.println("Самые большие расходы были во вторник, пятницу и субботу.");
        System.out.println("Всего вы потратили в эти дни: " + summ + " тенге.");
    }


    public static void arrays7() {
        double[] expenses = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};
        Scanner scanner = new Scanner(System.in);

        System.out.println("Расходы за неделю хранятся под индексами от 0 (пн) до 6 (вс).");
        System.out.println("Введите индекс дня, траты за который вы хотите отредактировать:");

        int index;// Объявите переменную, которая будет хранить индекс выбранного элемента
        index  = scanner.nextInt();
        System.out.println("Введите новую сумму трат за этот день:");

        double newExpence;// Объявите переменную, в которой будет сохранено новое значение трат за выбранный день
        newExpence = scanner.nextDouble();
        expenses[index] += newExpence;// Замените значение элемента с нужным индексом на новое

        System.out.println("За день с индексом " + index + " размер трат теперь " + newExpence);

        System.out.println(Arrays.toString(expenses));
    }

    public static void arrays8() {
        String[] dishes = {"Ризотто", "Тартар", "Шурпа", "Панна-котта", "Сашими"}; // Массив
        System.out.println("Вы продегустировали пять блюд.");

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите индекс блюда, которое хотите переместить:");
        System.out.println("0-Ризотто");
        System.out.println("1-Тартар");
        System.out.println("2-Шурпа");
        System.out.println("3-Панна-котта");
        System.out.println("4-Сашими");

        int firstIndex = scanner.nextInt();


        System.out.println("Введите позицию, на которую хотите его переместить, от 0 до 4:");
        int secondIndex = scanner.nextInt();

        String swap = dishes[firstIndex];

        dishes[firstIndex] = dishes[secondIndex];

        dishes[secondIndex] = swap;

        System.out.println("Ваш рейтинг блюд:");
        System.out.println(dishes[0]);
        System.out.println(dishes[1]);
        System.out.println(dishes[2]);
        System.out.println(dishes[3]);
        System.out.println(dishes[4]);


    }


    public static void arrays9() {

        String[] currencies = new String[4];

        currencies[0] = "hello";
        currencies[1] = "bye";
        currencies[2] = "good";
        currencies[3] = "bad";


        System.out.println(Arrays.toString(currencies));

    }


}
