import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {
//        practice1();
//        practice2();
//        practice3();
//        practice4();
//        practice5();
//        practice6();
//        practice7();
//        practice8();
//        practice9();
//        practice10();
//        practice11();
//        practice12();
        practice13();

    }

//
    public static void practice1() {

        double rateUSD = 444.06;
        double tenge = 124356.5;

        System.out.println("Отличный курс доллора - рекомендую купить!");
        System.out.println("Ваши сбережения в доллорах: " + tenge / rateUSD);
    }

    public static void practice2() {

        int megabytes = 64000;
        int gigabytes = 64;
        int megabytesPerGigabyte = 1024;
        int gigabytesToMegabyte = gigabytes * megabytesPerGigabyte;
        boolean isMbMore = megabytes >= gigabytesToMegabyte; // 64000 >= 65536
        System.out.println(isMbMore);
    }


    public static void practice3() {

        int answer1 = 3; // Ответ на 1 вопрос      ПРАВИЛЬНЫЙ ВАРИАНТ: 2
        int answer2 = 2; // Ответ на 2 вопрос      ПРАВИЛЬНЫЙ ВАРИАНТ: любой кроме 4
        int answer3 = 1; // Ответ на 3 вопрос      ПРАВИЛЬНЫЙ ВАРИАНТ: 1

        boolean answerNumberOne = answer1 == 2;
        boolean answerNumberTwo = answer2 != 4;
        boolean answerNumberThree = answer3 == 1;

        System.out.println("Результат проверки вопроса 1: " + answerNumberOne);
        System.out.println("Результат проверки вопроса 2: " + answerNumberTwo);
        System.out.println("Результат проверки вопроса 3: " + answerNumberThree);

    }

    public static void practice4() {
        String pixelCat = "Пиксель — хороший кот!";
        boolean isGoodCat = pixelCat.equals("Пиксель — хороший кот!");

        System.out.println(isGoodCat);

    }

    public static void practice5() {

        String color = "Рыжий";
        int age = 1;
        int weight = 500;

        boolean isColor = ((color.equals("Рыжий") || color.equals("Рыже-белый")) && !color.equals("В крапинку"));
        boolean isAge = age < 2;
        boolean isWeight = weight > 100;
        boolean isFluffy = true;

        if (isColor && isAge) {
            if (isWeight || isFluffy)
            System.out.println("Берем хомяка домой!");
        } else {
            System.out.println("Скип сразу!");
        }
    }


    public static void practice6() {
        double moneyBeforeSalary = 140000.0;

        if (moneyBeforeSalary < 15_000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 50_000) {
            System.out.println("Окей, пора в Макдак!");
        } else if (moneyBeforeSalary < 150_000) {
            System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
        } else {
            System.out.println("Класс! Заказывайте крабов!");
        }
    }

    public static void practice7() {
        double tenges = 124356.5;
        double rateUSD = 444.06;
        double rateEUR = 489.32;
        double rateJPY = 3.12; // Курс японской иены

        String currency = "DKK";
        System.out.println("Вы конвертируете тенге в " + currency);

        if (currency.equals("USD")) {
            System.out.println("Ваши сбережения в долларах: " + tenges / rateUSD);
        } else if (currency.equals("EUR")) {
            System.out.println("Ваши сбережения в евро: " + tenges / rateEUR);
        } else if (currency.equals("JPY")) {
            System.out.println("Ваши сбережения в иенах: " + tenges / rateJPY);
        } else {
            System.out.println("Валюта не поддерживается.");
        }
    }

    public static void practice8() {
        double moneyBeforeSalary = 150_000.0; // Количество денег до зарплаты
        int daysBeforeSalary = 17;

        if (moneyBeforeSalary < 15_000) {
            System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
        } else if (moneyBeforeSalary < 50_000) {
            if (daysBeforeSalary < 10) { // а почему  здесь все полноценно стоит сразу?
                System.out.println("Окей, пора в Макдак!");
            } else {
                System.out.println("Сегодня лучше поесть дома. Экономьте, и вы дотянете до зарплаты!");
            }
        } else if (moneyBeforeSalary < 150_000) {
           if (daysBeforeSalary < 10) {
               System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
           } else {
                System.out.println("Окей, пора в Макдак!");
            }
        } else {
            if (daysBeforeSalary < 10) {
                System.out.println("Класс! Заказывайте крабов!");
            } else {
                System.out.println("Неплохо! Прикупите долларов и зайдите поужинать в классное место.");
            }
        }
    }

    public static void practice9() {
        for (int i = -3; i <= 11; i += 1) {
            System.out.println("Этаж " + i);
        }
    }

    public static void practice10() {
        for (int i = 1; i <= 17; i += 1) {
            System.out.println(i + "-я овечка перепрыгнула через забор.");
        }
        System.out.println("Хомяки сыты, овцы целы. Можно отдохнуть!");
    }

    public static void practice11() {
        System.out.println("Это первый этаж дома который построил Джек.");
        for (int floor = 1; floor < 10; floor++) {
            System.out.println("А это " + (floor+1) + " он на один выше, чем этаж " + floor);
        }
    }


    public static void practice12() {
        int secondBeforeStart = 70;

        for (int i = secondBeforeStart; i >= 0; i -= 7) {
            System.out.println("До старта SpaceY осталось " + i);
        }
    }

    public static void practice13() {
        int days = 30;
        int moneyPerDay = 200;
        int sum = 0;

        for (int i = 1; i <= days; i ++) {
            sum += moneyPerDay;
            System.out.println("День " + i + " Уже " + sum + " тенге.");
        }
    }

    public static void practice14() {

        double rateUSD = 444.06;
        double rateEUR = 489.32;
        double rateJPY = 3.12;

        Scanner scanner = new Scanner(System.in);


    }
}

