package lesson15.examples;

public class Practice3 {
    public static void main(String[] args) {

        int primitive = 7;
        method(primitive);

    }

    public static void method(Integer integer) {
        System.out.println("у нас тут обертка - " + integer);
    }
}
