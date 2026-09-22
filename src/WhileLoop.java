import java.util.Random;
import java.util.Scanner;


public class WhileLoop {

    public static void main(String[] args) {
//        whileloop1();
//        whileloop2();
//        whileloop3();
//        whileloop4();
        whileloop5();
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
        while (inputNumber != 0) {

            sum = sum + inputNumber;
            System.out.println("Введите числа для суммирования (0 для остановки): ");
            inputNumber = scanner.nextInt();
        }
        System.out.println("Сумма введенных чисел: " + sum);
    }


    public static void whileloop4() {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int secretCode;
        int pilotInput;


        System.out.println("Ракета SpaceY на орбите!");
        secretCode = random.nextInt(100);
        pilotInput = random.nextInt(100);

        while (pilotInput != secretCode) {
            System.out.println("Ракета SpaceY на орбите!");
            pilotInput = random.nextInt(100);

        }
        System.out.println("Пилот угадал число! Летим домой!");
    }

    public static void whileloop5() {
        double rateUSD = 450;
        double rateEUR = 500;
        double rateJPY = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {//настройте бесконечный цикл здесь
            System.out.println("Что вы хотите сделать? ");
            System.out.println("1 - Конвертировать валюту");
            System.out.println("2 - Получить совет");
            System.out.println("0 - Выход"); // Новый пункт меню, осталось только реализовать логику

            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR или 3 - JPY.");

                String currency = "";

                if (currency.equals("USD")) {
                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
                } else if (currency.equals("EUR")) {
                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
                } else if (currency.equals("JPY")) {
                    System.out.println("Ваши сбережения в йенах: " + moneyBeforeSalary / rateJPY);
                } else {
                    System.out.println("Валюта не поддерживается.");
                }

            } else if (command == 2) {
                if (moneyBeforeSalary < 15_000) {
                    System.out.println("Сегодня лучше поесть дома. Экономьте и вы дотянете до зарплаты!");
                } else if (moneyBeforeSalary < 50_000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Окей, пора в Макдак!");
                    } else {
                        System.out.println("Сегодня лучше поесть дома. Экономьте и вы дотянете до зарплаты!");
                    }
                } else if (moneyBeforeSalary < 150_000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    } else {
                        System.out.println("Окей, пора в Макдак!");
                    }
                } else {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Отлично! Заказывайте крабов!");
                    } else {
                        System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место. :)");
                    }
                }
            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}
