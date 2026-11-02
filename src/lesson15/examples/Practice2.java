package lesson15.examples;

public class Practice2 {

    public static void main(String[] args) {


        Integer integer = new Integer(10);
        Integer number = 10; // 10 литерал примитивного типа int а левая сторона и его имя будет новым обьектом
        int integerNumber = 500;

        byte smallNumber = (byte) integerNumber;
        checkMethod(smallNumber);
    }

    public static void checkMethod(byte importantBigNumber) {
        System.out.println("Метод работает!");
        System.out.println("smallNumber = " + importantBigNumber);
    }
}
