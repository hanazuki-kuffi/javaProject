import java.util.Random;
import java.util.Scanner;


public class WhileLoop {

    public static void main(String[] args) {
//        whileloop1();
//        whileloop2();
        whileloop3();
    }

    public static void whileloop1() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Сколько денег у вас сейчас: ");
        double balance = scanner.nextDouble();

        double percent = 0.05;

        int years = 0;

        while (balance <= 1_000_000) {
            balance += balance * percent;
            years++;
        }

        System.out.println("Через " + years + " лет у вас будет миллион!");

    }

    public static void whileloop2() {

        Scanner scanner = new Scanner(System.in);
        int randomInt = new Random().nextInt(1000); // Генерирует новое число от 0 до 1000
        int userInput = -1; // Это нужно, чтобы цикл запустился, если Random выдаст 0
        System.out.println("Я загадал число от 0 до 1000.");

        while (userInput != randomInt) {
            System.out.println("Ваш ход: "); // Напишите условие цикла для запуска игры
            userInput = scanner.nextInt(); // В этой переменной должен сохраняться ввод пользователя
            if (userInput < randomInt) { // Условие проверяется в цикле
                System.out.println("Меньше");
            } else if (userInput > randomInt) {
                System.out.println("Больше");
            }
        }
        System.out.println("Вы великолепны! Именно это я загадал.");
    }

    public static void whileloop3() {

        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        int inputNumber;

        System.out.println("Введите числа для суммирования (0 для остановки): ");
        inputNumber = scanner.nextInt();
        while (true) {

            sum = sum + inputNumber;
            System.out.println("Введите числа для суммирования (0 для остановки): ");
            inputNumber = scanner.nextInt();
             if (inputNumber == 0) {
                 break;
             }
        }
        System.out.println("Сумма введенных чисел: " + sum);
    }
}