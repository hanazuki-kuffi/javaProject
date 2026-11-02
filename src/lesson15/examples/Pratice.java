package lesson15.examples;

public class Pratice {
    public static void main(String[] args) {
        int smallNumber = 40;
        checkMethod((byte)smallNumber);
    }

    public static void checkMethod(byte importantBigNumber) {
        System.out.println("Метод сработал!");
        System.out.println("integerNumber = " + importantBigNumber);
    }
}
