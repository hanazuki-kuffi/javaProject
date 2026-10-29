package lesson15;

public class App {
    public static void main(String[] args) {
        int importantBigNumber = 40;
        checkMethod((byte)importantBigNumber);
    }

    public static void checkMethod(byte importantSmallNumber){

        System.out.println("Method is work");
        System.out.println(importantSmallNumber);
    }
}
