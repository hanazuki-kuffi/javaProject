import java.util.Scanner;

public class Robot {
    static void main(String[] args) {
        sayHello();
        sayHelloByTime();
        welcomeUserByName();
    }

    public static void robotVersion2_0() {
        System.out.println("Робот-помощник v2.0.");
        // Вызовите ниже методы в правильном порядке



    }
    public static void welcomeUserByName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Как вас зовут?");
        String name = scanner.nextLine();

    }

    public static void printSuccess() {
        System.out.println("У вас уже неплохо получается программировать!");
    }

    static void sayHello() { // Допишите метод sayHello(), который печатает: Привет!
        System.out.println("Привет!");
    }

    static void printCity() { // Допишите метод printCity(), который печатает: Из какого вы города?
        Scanner scanner = new Scanner(System.in);

        System.out.println("Из какого вы города?");
        String city = scanner.next();
        System.out.println("Рад познакомиться, " + name + " из " + city + "!");
    }

    public static void sayHelloByTime() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Который час?");
        int currentHour = scanner.nextInt();
        if (currentHour < 6) {
            System.out.println("Доброй ночи!");
        } else if (currentHour > 22) {
            System.out.println("Доброй ночи!");
        } else if (currentHour < 12) {
            System.out.println("Доброе утро!");
        } else if (currentHour < 18) {
            System.out.println("Добрый день!");
        } else {
            System.out.println("Добрый вечер!");
        }
    }
}
