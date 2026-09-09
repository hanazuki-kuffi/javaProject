// Task #1
public class Task {

    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        task9();
        task10();
        task11();
    }


    public static void task1() {
        System.out.println("Zharylkassynova Gulaiym Dumanovna");
    }

    // Task #2
    public static void task2() {
        System.out.println("Теперь я умею выводить строки на экран ");
        System.out.println("Скоро я стану junior java backend разработчиком");
    }

    // Task #3
    public static void task3() {
        double cornFlakes;
        cornFlakes = 78.7;
        cornFlakes = cornFlakes;
        System.out.println(10 + 12 + 10);
    }

    public static void task4() {
        double megabytes = 32409.6;
        double megabytesPerGigabyte = 1024;
        double gigabytes = megabytes / megabytesPerGigabyte;

            System.out.println(gigabytes);

    }

    public static void task5() {

        int foodPrice = 8 * 5;
        int bagPrice = 4 * 5 + 4 * 3;
        int totalSum = foodPrice + bagPrice;

        System.out.println(totalSum);

    }

    public static void task6() {

        String hello = "Привет!";
        String name = "Kuffi";// Объявите переменную и присвойте ей значение - ваше имя
        System.out.println(hello);
        System.out.println(name); // Здесь нужно напечатать имя
    }

    public static void task7() {

        String hello = "Привет!";
        String name = "Kuffi"; // Замените на ваше имя

        System.out.println(hello + name + ".");// Напечатайте приветствие

    }

    public static void task8() {
        String hello = "Привет!";
        String myNameIsPixel = "Меня зовут Пиксель.";
        String iAmCat = "Я кот.";

        System.out.println(hello + " " + myNameIsPixel + " " + iAmCat);// Напечатайте фразу

    }

    
    public static void task9() {
        double tenges = 35000; // Напечатайте значение
        System.out.println("Сейчас у вас на счёте " + tenges + " тенге");

    }

    public static void task10() {
        double tenges = 1500002.7;
        double rateUSD = 463.8;
        double dollars = tenges / rateUSD;
        System.out.println("У вас на счету " + tenges + " тенге. В долларах это " + dollars + " долларов.Так держать!.");
    }


    public static void task11() {
        int x = -5;
        boolean isNegative = x < 0;
        System.out.println("Значение переменной isNegative = " + isNegative);
    }


}


