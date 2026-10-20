//package finance_app;
//
//import Class_and_objects0081.Converter;
//import advice.example1.DinnerAdvisor;
//
//import java.util.Scanner;
//
//public class App {
//    public static void main(String[] args) {
//        double[] expenses = new double[7]; // Должно стать полем нового класса
//
//        Scanner scanner = new Scanner(System.in);
//        Converter converter = new Converter(444.06, 489.32, 3.81);
//        DinnerAdvisor dinnerAdvisor = new DinnerAdvisor();
//        ExpensesManager expensesManager = new ExpensesManager();
//
//        System.out.println("Сколько денег у вас осталось до зарплаты?");
//        double moneyBeforeSalary = scanner.nextDouble();
//
//        System.out.println("Сколько дней до зарплаты?");
//        int daysBeforeSalary = scanner.nextInt();
//
//        while (true) {
//            printMenu();
//            int command = scanner.nextInt();
//
//            if (command == 1) {
//                System.out.println("Ваши сбережения: " + moneyBeforeSalary + " KZT");
////                System.out.println("В какую валюту хотите конвертировать? Доступные варианты: 1 - USD, 2 - EUR, 3 - JPY.");
////                int currency = scanner.nextInt();
////                converter.convert(moneyBeforeSalary, currency); // Вызовите метод класса Converter
////            } else if (command == 2) {
////                dinnerAdvisor.getAdvice(moneyBeforeSalary, daysBeforeSalary);
////            } else if (command == 3) {
////                moneyBeforeSalary = saveExpense(scanner, moneyBeforeSalary, expenses);
////            } else if (command == 4) {
////                printAllExpenses(expenses);
////            } else if (command == 5) {
////                System.out.println("Самая большая сумма расходов на этой неделе составила " + findMaxExpense(expenses) + "тенге");
////            } else if (command == 0) {
////                System.out.println("Выход");
////                break;
////            } else {
////                System.out.println("Извините, такой команды пока нет.");
////            }
////        }
//    }
//
//    public static void printMenu() {
//        System.out.println("Что вы хотите сделать? ");
//        System.out.println("1 - Конвертировать валюту");
//        System.out.println("2 - Получить совет");
//        System.out.println("3 - Ввести трату");
//        System.out.println("4 - Показать траты за неделю");
//        System.out.println("5 - Показать самую большую сумму расходов за неделю");
//        System.out.println("0 - Выход");
//    }
//}
