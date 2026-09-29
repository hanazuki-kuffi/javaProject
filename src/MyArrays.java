import java.util.Arrays;
import java.util.Random;
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
//        arrays9();
//        arrays10();
//        arrays11();
//        arrays12();
//        arrays13();
//        arrays14();
//        arrays15();
//        arrays16();
//        arrays17();
//        arrays18();
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

    public static void arrays10() {

        double[] expenses = new double[3];

        expenses[0] = 100;
        expenses[1] = 250;
        expenses[2] = 1000;

        System.out.println(Arrays.toString(expenses));

    }

    public static void arrays11() {

        int[] numbers = {1, 2, 3, 6, 2, 7, 23, 65, 23, 75, 212, 1000};

        int numberCount = numbers.length;

        System.out.println(numberCount);
    }

    public static void arrays12() {

        String[] currencies = {"USD", "EUR", "RUB", "KZT", "THB", "UAH", "MAD", "SGD", "AMD", "DKK", "CZK", "SEK", "TRY", "CHF"};

        for (int i = 0; i < currencies.length; i++) {
            System.out.println("Поддерживаемая валюта: " + currencies[i]);
        }
    }

    public static void arrays13() {

        String[] currencies = {"USD", "EUR", "RUB"};

        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите номер валюты, которую хотите купить: ");
        int userInput = scanner.nextInt();

        if (userInput < 0) {
            System.out.println("Неверное значение номера валюты! Выберите число от 0 до 3.");
        } else if (userInput >= currencies.length) {
            System.out.println("Неверное значение номера валюты! Выберите число от 0 до 3.");
        } else {
            System.out.println("Вы купили валюту: " + currencies[userInput]);
        }


    }

    public static void arrays14() {
        double[] expenses = {1500.50, 2500.50, 500.00, 0.0, 4750.60, 2500.20, 1200.00};

        System.out.println("Сколько всего записей о расходах?");
       // Посчитайте размер массива
        int recordsCount =  expenses.length;
        // Напечатайте полученный результат
        System.out.println(recordsCount);
    }

    public static void arrays15() {

        String[] participants = {"Алибек", "Диана", "Бексултан"};

        String[] documentsParticipants = {"Удостоверения личности паспорт", "Водительское удостоверение", " Свидетельство о рождении"};

        int documentsCount = documentsParticipants.length;
        int particicpantsCount = participants.length;

        if (particicpantsCount == documentsCount) {
            System.out.println("Документы загружены верно. Список документов:");

            for (int i = 0; i < documentsCount; i++) {
                System.out.println(participants[i] + ": " + documentsParticipants[i]);
            }
        } else {
            System.out.println("Количество документов не соответствует количеству участников сделки 😞");
        }
    }

    public static void arrays16() {
        // Объявите пустой массив трат за неделю (7 дней)
        int[] expenses = new int[8];
        Random random = new Random(); // Генерирует случайное число

        // Допишите условие цикла for, чтобы заполнить массив случайными тратами
        // Выведите с помощью цикла все траты за неделю в виде: "День ... . Потрачено тенге: ..."
        System.out.println("Траты за неделю: ");
        int sum = 0;

        for ( int i = 1;i <= 7; i++) {
            expenses[i] = random.nextInt(10000);
            System.out.println("День " + i + ". Потрачено тенге: " + expenses[i]);

            sum = sum + expenses[i];
        }
        System.out.println("Траты в тенге за неделю: " + sum);
    }

    public static void arrays17() {

        double[] expenses = new double[7]; // забыли ставить [], потом забыли обьявить new...

        int expense = 500; // тут не просто

        // Заполнили массив, используя цикл for
        for (int i = 0; i < expenses.length; i++) {
            expenses[i] = expense;
            expense = expense + 100;
        }
        System.out.println("Ошибок нет. Все расходы успешно занесены в приложение!");
        System.out.println(Arrays.toString(expenses));
        System.out.println("Расходы за неделю успешно занесены в приложение!");
        Scanner scanner = new Scanner(System.in);
        while (true) { // Добавили бесконечный цикл — теперь не страшно ошибаться много раз

            System.out.println("Расходы за какой день вы хотите проверить. Выберите значение от 0 (пн) до 6 (вс).");
            int userIndex = scanner.nextInt();  // Считайте ввод пользователя из консоли и сохраните в переменной index

            // Проверьте, не допущена ли ошибка

            if (userIndex < 0) { // Если значение меньше нуля,
                System.out.println("Выбрано неверное значение! Минимальное значение - 0");
            }
            else if (userIndex >= expenses.length) { // Если выбрано значение больше длины массива или равное ей,
                System.out.println("Выбрано неверное значение! Максимальное значение - " + expenses.length);
            }
            System.out.println("Потрачено " + expenses[userIndex] +" тенге"); // Если пользователь ввёл корректный индекс,
            break;                                                                    // то программа должна вывести значение нужного элемента и завершить работу (прервать цикл)
        }


    }

    public static void arrays18() {

        double[] expenses = new double[7];

        double rateUSD = 450;
        double rateEUR = 500;
        double rateJPY = 3.14;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Сколько денег у вас осталось до зарплаты?");
        double moneyBeforeSalary = scanner.nextDouble();

        System.out.println("Сколько дней до зарплаты?");
        int daysBeforeSalary = scanner.nextInt();

        while (true) {
            System.out.println("Что вы хотите сделать?");
            System.out.println("1 — Конвертировать валюту");
            System.out.println("2 — Получить совет");
            System.out.println("3 — Ввести трату");
            System.out.println("0 — Выход");


            int command = scanner.nextInt();

            if (command == 1) {
                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " KZT");
                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
                int currency = scanner.nextInt();
                if (currency == 1) {
                    System.out.println("Ваши сбережения в долларах: " + moneyBeforeSalary / rateUSD);
                } else if (currency == 2) {
                    System.out.println("Ваши сбережения в евро: " + moneyBeforeSalary / rateEUR);
                } else if (currency == 3) {
                    System.out.println("Ваши сбережения в иенах: " + moneyBeforeSalary / rateJPY);
                } else {
                    System.out.println("Неизвестная валюта");
                }
            } else if (command == 2) {
                if (moneyBeforeSalary < 15_000) {
                    System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
                } else if (moneyBeforeSalary < 50_000) {
                    if (daysBeforeSalary < 10) {
                        System.out.println("Окей, пора в Макдак!");
                    } else {
                        System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
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
            } else if (command == 3) { // Ещё одно ветвление для обработки новой команды, допишите его условие
                System.out.println("За какой день вы хотите ввести трату: 1-ПН, 2-ВТ, 3-СР, 4-ЧТ, 5-ПТ, 6-СБ, 7-ВС?");
                int userDayInput = scanner.nextInt(); // Получите из консоли день, за который пользователь хочет указать расходы

                System.out.println("Введите размер траты:");
                int userExpense = scanner.nextInt(); // Получите из консоли значение расходов и сохраните в переменной expense

                expenses[userDayInput - 1] = userExpense; // Сохраните полученное значение дневных трат в массив expenses
                                            // Не забудьте прибавить новое значение к уже существующим тратам
                System.out.println("Значение сохранено!");

            } else if (command == 0) {
                System.out.println("Выход");
                break;
            } else {
                System.out.println("Извините, такой команды пока нет.");
            }
        }
    }
}
