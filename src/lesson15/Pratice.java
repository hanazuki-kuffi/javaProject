package lesson15;

public class Pratice {
    public static void main(String[] args) {
        short smallNumber = 40;
        checkMethod(smallNumber);
    }

    public static void checkMethod(int importantBigNumber) {
        System.out.println("Метод сработал!");
        System.out.println("small number - " + importantBigNumber);
    }

}
