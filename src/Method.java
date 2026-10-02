import java.util.Scanner;

public class Method {
    public static void main(String[] args) {
//        System.out.println("Робот-помощник v1.0.");
//        welcomeUserByName();
//        sayHelloByTime();
//        System.out.println(printSuccess());
//        printCity();
//        double result = multiply();
//        System.out.println("Result: " + multiply());
//        System.out.println(sayHello());
//        sayHello();

        int result = doubleIt(add(13 + 2, doubleIt(5)));
        System.out.println(result);
    }
    public static void welcomeUserByName() {  // Объявите метод welcomeUserByName Scanner scanner = new Scanner(System.in);
        Scanner scanner = new Scanner(System.in);
        System.out.println("Как вас зовут?");
        String name = scanner.next();// Сохраните введённое пользователем имя в переменную name
        System.out.println("Рад познакомиться, " + name + "!");
    }

    public static void sayHelloByTime() {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Который час?:  ");
        int currentHour = scanner.nextInt();

        if (22 < currentHour || currentHour < 6) {
            System.out.println("Доброй ночи! 🌘");
        }
        else if (6 < currentHour & currentHour < 12) {
            System.out.println("Доброе утро!🌤️");
        }
        else if (12 < currentHour & currentHour < 18) {
            System.out.println("Добрый день! ☀️");
        }
        else if (18 < currentHour & currentHour < 22) {
            System.out.println("Добрый вечер!🌥️");
        }
    }

    public static void printCity() {

        System.out.println("Я из Астаны! ");
    }


    public static double multiply() {
        return 3.0 * 6.0;
    }

    public static String sayHello() {
        String name = "Pixel";
        return "Hello " + name + "!";
    }

    public static void findHighestGrossingFilm() {

        String film1 = "Титаник";
        int income1 =  2194;

        String film2 = "Аватар";
        int income2 =  2810;

        String film3 = "Темный рыцарь";
        int income3 =  1084;

//        if ()

    }

    public static int add(int a, int b){
        return a + b;
    }

    public static int doubleIt(int number) {
        return number * 2;
    }
}

